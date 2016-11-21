package com.hdit.wldemo.fragment;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.cjj.MaterialRefreshLayout;
import com.cjj.MaterialRefreshListener;
import com.hdit.wldemo.R;
import com.hdit.wldemo.adapter.BaseRecyclerViewAdapter;
import com.hdit.wldemo.adapter.HomeBottomAdapter;
import com.hdit.wldemo.adapter.HomeHeadAdapter;
import com.hdit.wldemo.constant.Constant;
import com.hdit.wldemo.mvp.Bean.HomeBean;
import com.hdit.wldemo.mvp.presenter.BasePresenter;
import com.hdit.wldemo.mvp.presenter.HomePresenterImpl;
import com.hdit.wldemo.mvp.view.BaseView;
import com.hdit.wldemo.utils.CompetenceUtils;
import com.hdit.wldemo.utils.UIUtils;
import com.jude.rollviewpager.RollPagerView;

import java.util.LinkedList;
import java.util.List;

import butterknife.Bind;

/**
 * Created by joker on 2016/11/10.
 */

public class HomeFragment extends BaseFragment implements BaseView.HomeView, BaseRecyclerViewAdapter.OnItemClickListener<HomeBean.ResultBean.DataBean.NewsBean> {

    @Bind(R.id.viewPager)
    RollPagerView viewPager;
    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.toolbar_title)
    TextView toolbarTitle;
    @Bind(R.id.toolbar_right)
    ImageView toolbarRight;
    @Bind(R.id.toolbar_image)
    ImageView toolbarLeft;
    @Bind(R.id.toolbar_center)
    ImageView toolbarCenter;

    private BasePresenter.HomePresenter homePresenter;
    private HomeHeadAdapter homeHeadAdapter;
    private HomeBottomAdapter homeBottomAdapter;
    private List<HomeBean.ResultBean.DataBean.AdvertBean> list_head=new LinkedList<>();
    private List<HomeBean.ResultBean.DataBean.NewsBean> list_bottom=new LinkedList<>();
    private int pageNum=1;
    private int pageSize=10;
    private boolean isLoadMore = true;

    private MaterialRefreshLayout srfLayout;
    private RecyclerView recyclerView;

    @Override
    protected View initView() {
        CompetenceUtils.Storage();
        View view=View.inflate(UIUtils.getActivity(), R.layout.fragment_home,null);
        recyclerView= (RecyclerView) view.findViewById(R.id.recyclerView);
        srfLayout = (MaterialRefreshLayout) view.findViewById(R.id.srf_layout);
        return view;
    }

    @Override
    protected void initData() {
        homePresenter=new HomePresenterImpl(this);
        homePresenter.requestNetWork(pageNum,pageSize);

        homeHeadAdapter=new HomeHeadAdapter(list_head);
        homeBottomAdapter=new HomeBottomAdapter(list_bottom);

        toolbarCenter.setImageResource(R.mipmap.toolbar_title_img);
        toolbarRight.setImageResource(R.mipmap.toolbar_right_none);

        srfLayout.setLoadMore(true);
        srfLayout.setMaterialRefreshListener(new MaterialRefreshListener() {
            @Override
            public void onRefresh(MaterialRefreshLayout materialRefreshLayout) {
                pageNum=1;
                pageSize=10;
                homeBottomAdapter.removeAll();
                homePresenter.requestNetWork(pageNum,pageSize);
                srfLayout.finishRefresh();
            }

            @Override
            public void onRefreshLoadMore(MaterialRefreshLayout materialRefreshLayout) {
                isLoadMore=false;
                ++pageNum;
                homePresenter.requestNetWork(pageNum, pageSize);
                srfLayout.finishRefreshLoadMore();
            }
        });
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(Constant.RECYCLERVIEW_LINEAR, LinearLayoutManager.VERTICAL));
        homeBottomAdapter.setOnItemClickListener(this);
    }


    @Override
    public void setData(HomeBean datas) {
        if (!datas.getResult().getData().getAdvert().isEmpty()) {
            list_head.addAll(datas.getResult().getData().getAdvert());
            viewPager.setAdapter(homeHeadAdapter);
        }
        if (!datas.getResult().getData().getNews().isEmpty()){
            homeBottomAdapter.addAll(datas.getResult().getData().getNews());
            recyclerView.setAdapter(homeBottomAdapter);
        }
    }

    @Override
    public void netWorkError() {

    }


    @Override
    public void onItemClick(View view, int position, HomeBean.ResultBean.DataBean.NewsBean info) {
        homePresenter.onClick(info);
    }
}
