package com.hdit.wldemo.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cjj.MaterialRefreshLayout;
import com.cjj.MaterialRefreshListener;
import com.hdit.wldemo.R;
import com.hdit.wldemo.adapter.ApplyAdapter;
import com.hdit.wldemo.mvp.Bean.ApplyBean;
import com.hdit.wldemo.mvp.presenter.ApplyPresenterImpl;
import com.hdit.wldemo.mvp.presenter.BasePresenter;
import com.hdit.wldemo.mvp.view.BaseView;
import com.hdit.wldemo.utils.LogUtils;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by joker on 2017/1/3.
 */
public class ApplyFragment extends LazyFragment implements BaseView.applyDetail{

    private int pagerCount;
    private boolean isPrepared;
    private RecyclerView applyRecylerView;
    private MaterialRefreshLayout refreshLayout;
    private BasePresenter.applyPresenter applyPresenter;
    private ApplyAdapter applyAdapter;

    private List<ApplyBean.RowsBean> listFirst=new LinkedList<>();
    private List<ApplyBean.RowsBean> listSecond=new LinkedList<>();
    private List<ApplyBean.RowsBean> listThird=new LinkedList<>();

    public static ApplyFragment newInstance(int pagerCount) {
        LogUtils.i("susu", String.valueOf(pagerCount));
        Bundle bundle = new Bundle();
        bundle.putInt("TAG", pagerCount);
        ApplyFragment fragment = new ApplyFragment();
        fragment.setArguments(bundle);
        return fragment;
    }

    private void getBundle() {
        if (getArguments() != null) {
            pagerCount = getArguments().getInt("TAG");
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = View.inflate(getActivity(), R.layout.fragment_apply, null);
        applyRecylerView= (RecyclerView) view.findViewById(R.id.apply_recyclerView);
        refreshLayout= (MaterialRefreshLayout) view.findViewById(R.id.srf_layout);
        isPrepared = true;
        getBundle();
        initData();
        return view;
    }

    @Override
    protected void initData() {
        if (!isPrepared || !isVisible ) {
            return;
        }
        applyPresenter=new ApplyPresenterImpl(this);
        switch (pagerCount){
            case 1:
                applyAdapter=new ApplyAdapter(listFirst);
                applyAdapter.addAll(listFirst);
                applyPresenter.requestNetWork(1);
                break;
            case 2:
                applyAdapter=new ApplyAdapter(listSecond);
                applyAdapter.addAll(listSecond);
                applyPresenter.requestNetWork(1);
                break;
            case 3:
                applyAdapter=new ApplyAdapter(listThird);
                applyAdapter.addAll(listThird);
                applyPresenter.requestNetWork(1);
                break;
        }
        refreshLayout.setMaterialRefreshListener(new MaterialRefreshListener() {
            @Override
            public void onRefresh(MaterialRefreshLayout materialRefreshLayout) {
                applyPresenter.requestNetWork(1);
                refreshLayout.finishRefresh();
            }
        });

        applyRecylerView.setLayoutManager(new LinearLayoutManager(getContext()));
        //applyRecylerView.addItemDecoration(new DividerItemDecoration(getContext(),DividerItemDecoration.VERTICAL_LIST));
    }

    @Override
    public void setData(ApplyBean datas) {
        //LogUtils.i("susu", String.valueOf(getArguments().getInt("TAG")));
        listFirst.clear();
        listSecond.clear();
        listThird.clear();
        if (!datas.getRows().isEmpty()){
            for (int i=0;i<datas.getRows().size();i++){
                listFirst.add(datas.getRows().get(i));
                if (datas.getRows().get(i).getPreferStatus()==0){
                    listSecond.add(datas.getRows().get(i));
                }else {
                    listThird.add(datas.getRows().get(i));
                }
            }
            applyRecylerView.setAdapter(applyAdapter);
        }
    }

    @Override
    public void netWorkError() {

    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

    }
}