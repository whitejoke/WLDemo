package com.hdit.wldemo.activity;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.cjj.MaterialRefreshLayout;
import com.cjj.MaterialRefreshListener;
import com.hdit.wldemo.R;
import com.hdit.wldemo.adapter.PostOrderAdapter;
import com.hdit.wldemo.mvp.Bean.OrderDetail;
import com.hdit.wldemo.mvp.presenter.BasePresenter;
import com.hdit.wldemo.mvp.presenter.OrderDetailPresenterImpl;
import com.hdit.wldemo.mvp.view.BaseView;
import com.hdit.wldemo.utils.DividerItemDecoration;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import butterknife.Bind;

/**
 * Created by joker on 2016/11/17.
 */

public class MinePostOrderActivity extends BaseNewActivity implements BaseView.orderDetail {

    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.toolbar_title)
    TextView toolbarTitle;
    @Bind(R.id.toolbar_right)
    ImageView toolbarRight;
    @Bind(R.id.toolbar_image)
    ImageView toolbarLeft;
    @Bind(R.id.refresh_layout)
    MaterialRefreshLayout refreshLayout;
    @Bind(R.id.post_recycler)
    RecyclerView postRecycler;
    @Bind(R.id.tv_none)
    TextView tvNone;

    private BasePresenter.orderDetailPresenter orderDetailPresenter;
    private PostOrderAdapter postOrderAdapter;
    private List<OrderDetail.RowsBean> list=new LinkedList<>();
    private Map<String,String> map;

    private boolean type=true;
    private int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }

    private void init() {
        toolbarTitle.setText("历史治疗订单");
        toolbar.setNavigationIcon(R.mipmap.toolbar_left);
        toolbar.setBackgroundResource(R.color.white);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        id=sharedPreferences.getInt("id",0);

        orderDetailPresenter=new OrderDetailPresenterImpl(this);
        map=new HashMap<>();
        map.put("userId", String.valueOf(id));
        map.put("order","desc");
        map.put("sort","create_time");
        orderDetailPresenter.requestNetWork(map);

        postOrderAdapter=new PostOrderAdapter(list);
        postRecycler.setLayoutManager(new LinearLayoutManager(getContext()));
        postRecycler.addItemDecoration(new DividerItemDecoration(getActivity(),DividerItemDecoration.VERTICAL_LIST));

        refreshLayout.setMaterialRefreshListener(new MaterialRefreshListener() {
            @Override
            public void onRefresh(MaterialRefreshLayout materialRefreshLayout) {
                orderDetailPresenter.requestNetWork(map);
                refreshLayout.finishRefresh();
            }
        });
    }

    @Override
    protected int getLayoutId() {
        return R.layout.mine_past_order;
    }

    @Override
    public void setData(OrderDetail datas) {
        for (int i=0;i<datas.getRows().size();i++){
            if (datas.getRows().get(i).getType()==-1){
                type=false;
                break;
            }
        }
        if (!datas.getRows().isEmpty()&&type==true){
            tvNone.setVisibility(View.GONE);
            refreshLayout.setVisibility(View.VISIBLE);
            list.clear();
            postOrderAdapter.addAll(datas.getRows());
            postRecycler.setAdapter(postOrderAdapter);
        }else {
            tvNone.setVisibility(View.VISIBLE);
            refreshLayout.setVisibility(View.GONE);
        }
    }

    @Override
    public void netWorkError() {
        Toast("出错啦");
    }
}
