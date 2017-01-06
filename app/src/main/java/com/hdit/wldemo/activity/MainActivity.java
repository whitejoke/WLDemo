package com.hdit.wldemo.activity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.FragmentTabHost;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TabHost;

import com.hdit.wldemo.R;
import com.hdit.wldemo.fragment.BusinessFragment;
import com.hdit.wldemo.fragment.FlowFragment;
import com.hdit.wldemo.fragment.HomeFragment;
import com.hdit.wldemo.fragment.MineFragment;
import com.hdit.wldemo.mvp.presenter.BasePresenter;
import com.hdit.wldemo.mvp.presenter.MainViewPresenterImpl;
import com.hdit.wldemo.mvp.view.BaseView;
import com.hdit.wldemo.utils.UIUtils;

import butterknife.Bind;

public class MainActivity extends BaseActivity implements BaseView.MainView{
    @Bind(R.id.tabhost)
    FragmentTabHost tabHost;
    @Bind(R.id.tab_home)
    RadioButton tabHome;
    @Bind(R.id.tab_flow)
    RadioButton tabFlow;
    @Bind(R.id.tab_business)
    RadioButton tabBusiness;
    @Bind(R.id.tab_mine)
    RadioButton tabMine;
    @Bind(R.id.rg_tab)
    RadioGroup radioGroup;

    private Class fragment[];
    private Class fragmentEmp[];
    private BasePresenter.MainViewPresenter mainViewPresenter;
    private SharedPreferences sharedPreferences;
    private boolean ischeck=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fragment = new Class[]{HomeFragment.class, FlowFragment.class, MineFragment.class};
        fragmentEmp=new Class[]{HomeFragment.class, BusinessFragment.class, MineFragment.class};
        init();
    }

    private void init() {
        mainViewPresenter = new MainViewPresenterImpl(this);

        sharedPreferences= UIUtils.getActivity().getSharedPreferences("member",MODE_WORLD_READABLE);
        ischeck=sharedPreferences.getBoolean("isChecked",false);
        tabHost.setup(this,getSupportFragmentManager(),R.id.realtabcontent);
        if (ischeck==false){
            tabBusiness.setVisibility(View.GONE);
            tabFlow.setVisibility(View.VISIBLE);
            for (int i=0;i<fragment.length;i++){
                TabHost.TabSpec tabSpec=tabHost.newTabSpec(String.valueOf(i)).setIndicator(String.valueOf(i));
                tabHost.addTab(tabSpec,fragment[i],null);
            }
        }else {
            tabBusiness.setVisibility(View.VISIBLE);
            tabFlow.setVisibility(View.GONE);
            for (int i=0;i<fragmentEmp.length;i++){
                TabHost.TabSpec tabSpec=tabHost.newTabSpec(String.valueOf(i)).setIndicator(String.valueOf(i));
                tabHost.addTab(tabSpec,fragmentEmp[i],null);
            }
        }
        switchId();
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                mainViewPresenter.switchId(checkedId);
            }
        });
    }
    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void switchHome() {
        tabHost.setCurrentTab(0);
    }

    @Override
    public void switchFlow() {
        tabHost.setCurrentTab(1);
    }

    @Override
    public void switchBusiness() {
        tabHost.setCurrentTab(1);
    }

    @Override
    public void switchMine() {
        tabHost.setCurrentTab(2);
    }
    public void switchId(){
        mainViewPresenter.switchId(R.id.tab_mine);
        tabMine.setChecked(true);
    }

}
