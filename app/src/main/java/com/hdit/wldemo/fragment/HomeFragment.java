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
import com.hdit.wldemo.activity.CosmetologyActivity;
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

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import butterknife.Bind;

/**
 * Created by joker on 2016/11/10.
 */

public class HomeFragment extends BaseFragment implements BaseView.HomeView, BaseRecyclerViewAdapter.OnItemClickListener<HomeBean.ResultBean.DataBean.NewsBean>, View.OnClickListener {

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
    @Bind(R.id.home_more)
    TextView homeMore;

    private BasePresenter.HomePresenter homePresenter;
    private HomeHeadAdapter homeHeadAdapter;
    private HomeBottomAdapter homeBottomAdapter;
    private List<HomeBean.ResultBean.DataBean.AdvertBean> list_head=new LinkedList<>();
    private List<HomeBean.ResultBean.DataBean.NewsBean> list_bottom=new LinkedList<>();
    private boolean isLoadMore = true;

    private MaterialRefreshLayout srfLayout;
    private RecyclerView recyclerView;
    private Map<String, Integer> map=new HashMap<>();

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
        homePresenter.requestNetWork(map);

        homeHeadAdapter=new HomeHeadAdapter(list_head);
        homeBottomAdapter=new HomeBottomAdapter(list_bottom);

        toolbarCenter.setImageResource(R.mipmap.toolbar_title_img);
        toolbarRight.setImageResource(R.mipmap.toolbar_right_none);

        srfLayout.setMaterialRefreshListener(new MaterialRefreshListener() {
            @Override
            public void onRefresh(MaterialRefreshLayout materialRefreshLayout) {
                homeBottomAdapter.removeAll();
                homePresenter.requestNetWork(map);
                srfLayout.finishRefresh();
            }

//            @Override
//            public void onRefreshLoadMore(MaterialRefreshLayout materialRefreshLayout) {
//                isLoadMore=false;
//                ++pageNum;
//                homePresenter.requestNetWork(map);
//                srfLayout.finishRefreshLoadMore();
//            }
        });
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(Constant.RECYCLERVIEW_LINEAR, LinearLayoutManager.VERTICAL));
        homeBottomAdapter.setOnItemClickListener(this);
        homeMore.setOnClickListener(this);
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

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.home_more:
                CosmetologyActivity.startIntent();
                break;
        }
    }
}
