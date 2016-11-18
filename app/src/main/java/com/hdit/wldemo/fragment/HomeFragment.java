package com.hdit.wldemo.fragment;

import android.support.v4.view.ViewPager;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;

import com.hdit.wldemo.R;
import com.hdit.wldemo.adapter.HomeBottomAdapter;
import com.hdit.wldemo.adapter.HomeHeadAdapter;
import com.hdit.wldemo.constant.Constant;
import com.hdit.wldemo.mvp.Bean.HomeBean;
import com.hdit.wldemo.mvp.presenter.BasePresenter;
import com.hdit.wldemo.mvp.presenter.HomePresenterImpl;
import com.hdit.wldemo.mvp.view.BaseView;
import com.hdit.wldemo.utils.CompetenceUtils;
import com.hdit.wldemo.utils.UIUtils;
import com.hdit.wldemo.widget.MyRecyclerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;

/**
 * Created by joker on 2016/11/10.
 */

public class HomeFragment extends BaseFragment implements BaseView.HomeView, SwipeRefreshLayout.OnRefreshListener, MyRecyclerView.LoadingData {

    @Bind(R.id.viewPager)
    ViewPager viewPager;

    private BasePresenter.HomePresenter homePresenter;
    private HomeHeadAdapter homeHeadAdapter;
    private HomeBottomAdapter homeBottomAdapter;
    private List<HomeBean.ResultBean.DataBean.AdvertBean> list_head=new ArrayList<>();
    private List<HomeBean.ResultBean.DataBean.NewsBean> list_bottom=new ArrayList<>();
    private int pageNum=1;
    private int pageSize=10;
    private int pos;

    private SwipeRefreshLayout srfLayout;
    private MyRecyclerView recyclerView;

    @Override
    protected View initView() {
        CompetenceUtils.Storage();
        View view=View.inflate(UIUtils.getActivity(), R.layout.fragment_home,null);
        recyclerView= (MyRecyclerView) view.findViewById(R.id.recyclerView);
        srfLayout = (SwipeRefreshLayout) view.findViewById(R.id.srf_layout);
        return view;
    }

    @Override
    protected void initData() {
        homePresenter=new HomePresenterImpl(this);
        homePresenter.requestNetWork(pageNum,pageSize);

        homeHeadAdapter=new HomeHeadAdapter(list_head);
        homeBottomAdapter=new HomeBottomAdapter(list_bottom);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        srfLayout.setOnRefreshListener(this);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLoadingData(this);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(Constant.RECYCLERVIEW_LINEAR, LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(homeBottomAdapter);
    }


    @Override
    public void setData(HomeBean datas) {
        if (!datas.getResult().getData().getAdvert().isEmpty()) {
            list_head.addAll(datas.getResult().getData().getAdvert());
            viewPager.setAdapter(homeHeadAdapter);
        }
        if (!datas.getResult().getData().getNews().isEmpty()){
            homeBottomAdapter.addAll(datas.getResult().getData().getNews());
        }
    }

    @Override
    public void netWorkError() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void showProgress() {

    }

    @Override
    public void onRefresh() {
        pageNum=1;

    }

    @Override
    public void onLoadMore() {

    }
}
