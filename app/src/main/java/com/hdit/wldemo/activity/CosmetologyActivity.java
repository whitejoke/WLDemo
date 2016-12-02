package com.hdit.wldemo.activity;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import com.hdit.wldemo.R;
import com.hdit.wldemo.adapter.CosmetologyAdapter;
import com.hdit.wldemo.constant.Constant;
import com.hdit.wldemo.mvp.Bean.HomeBean;
import com.hdit.wldemo.mvp.presenter.BasePresenter;
import com.hdit.wldemo.mvp.presenter.HomePresenterImpl;
import com.hdit.wldemo.mvp.view.BaseView;
import com.hdit.wldemo.utils.ActivityUtils;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import butterknife.Bind;

/**
 * Created by joker on 2016/11/24.
 */

public class CosmetologyActivity extends BaseActivity implements BaseView.HomeView{

    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.toolbar_title)
    TextView toolbarTitle;
    @Bind(R.id.toolbar_right)
    ImageView toolbarRight;
    @Bind(R.id.toolbar_image)
    ImageView toolbarLeft;
    @Bind(R.id.recyclerView)
    RecyclerView recyclerView;


    private BasePresenter.HomePresenter homePresenter;
    private CosmetologyAdapter cosmetologyAdapter;
    private List<HomeBean.ResultBean.DataBean.NewsBean> list=new LinkedList<>();
    private Map<String,Integer> map=new HashMap<>();
    int pageNum=1;
    int pageSize=10;

    public static void startIntent() {
        Bundle bundle = new Bundle();
        ActivityUtils.startActivity(CosmetologyActivity.class, bundle);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }

    private void init() {
        toolbarTitle.setText("美容知识");
        toolbar.setNavigationIcon(R.mipmap.toolbar_left);
        toolbar.setBackgroundResource(R.color.white);

        map.put("pageNum",pageNum);
        map.put("pageSize",pageSize);
        homePresenter=new HomePresenterImpl(this);
        homePresenter.requestNetWork(map);
        cosmetologyAdapter=new CosmetologyAdapter(list);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(Constant.RECYCLERVIEW_LINEAR, LinearLayoutManager.VERTICAL));
        //recyclerView.addItemDecoration(new RecycleViewDivider(getActivity(), LinearLayoutManager.VERTICAL));
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_cosmetology;
    }

    @Override
    public void setData(HomeBean datas) {
        if (!datas.getResult().getData().getNews().isEmpty()){
            cosmetologyAdapter.addAll(datas.getResult().getData().getNews());
            recyclerView.setAdapter(cosmetologyAdapter);
        }
    }

    @Override
    public void netWorkError() {

    }
}
