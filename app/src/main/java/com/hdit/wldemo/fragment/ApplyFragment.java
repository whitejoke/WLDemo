package com.hdit.wldemo.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hdit.wldemo.R;
import com.hdit.wldemo.adapter.ApplyAdapter;
import com.hdit.wldemo.adapter.BaseRecyclerViewAdapter;
import com.hdit.wldemo.mvp.Bean.ApplyBean;
import com.hdit.wldemo.mvp.presenter.ApplyPresenterImpl;
import com.hdit.wldemo.mvp.presenter.BasePresenter;
import com.hdit.wldemo.mvp.view.BaseView;
import com.hdit.wldemo.utils.DividerItemDecoration;
import com.hdit.wldemo.utils.LogUtils;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by joker on 2017/1/3.
 */
public class ApplyFragment extends Fragment implements BaseView.applyDetail, BaseRecyclerViewAdapter.OnItemClickListener<ApplyBean.RowsBean> {

    private int pagerCount;
    private RecyclerView applyRecylerView;
    private BasePresenter.applyPresenter applyPresenter;
    private ApplyAdapter applyAdapter;
    private List<ApplyBean.RowsBean> list=new LinkedList<>();;

    public static ApplyFragment newInstance(int pagerCount) {
        Bundle bundle = new Bundle();
        bundle.putInt("TAG", pagerCount);
        ApplyFragment fragment = new ApplyFragment();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_apply, container, false);
        applyRecylerView= (RecyclerView) view.findViewById(R.id.apply_recyclerView);
        return view;
    }
    private void initData() {
        applyPresenter=new ApplyPresenterImpl(this);
        applyPresenter.requestNetWork(1);

        applyAdapter=new ApplyAdapter(list);

        //applyRecylerView.setHasFixedSize(true);
        applyRecylerView.setLayoutManager(new LinearLayoutManager(getContext()));
        applyRecylerView.addItemDecoration(new DividerItemDecoration(getContext(),DividerItemDecoration.VERTICAL_LIST));
        applyAdapter.setOnItemClickListener(this);
    }
//    @Override
//    public void onRefresh() {
//        applyAdapter.removeAll();
//        applyPresenter.requestNetWork(1);
//    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        pagerCount = getArguments().getInt("TAG");
        LogUtils.i("susu", String.valueOf(pagerCount));
        initData();
    }

    @Override
    public void setData(ApplyBean datas) {
        if (!datas.getRows().isEmpty()){
            list.clear();
            applyAdapter.addAll(datas.getRows());
            applyRecylerView.setAdapter(applyAdapter);
        }
    }

    @Override
    public void netWorkError() {

    }

    @Override
    public void onItemClick(View view, int position, ApplyBean.RowsBean info) {
            applyPresenter.onclick(info);
    }
}