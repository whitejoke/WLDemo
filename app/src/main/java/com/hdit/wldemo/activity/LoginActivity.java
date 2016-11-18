package com.hdit.wldemo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.hdit.wldemo.R;
import com.hdit.wldemo.mvp.Bean.UserBean;
import com.hdit.wldemo.mvp.presenter.BasePresenter;
import com.hdit.wldemo.mvp.presenter.LoginPresenterImpl;
import com.hdit.wldemo.mvp.view.BaseView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * Created by joker on 2016/11/14.
 */

public class LoginActivity extends BaseActivity implements BaseView.LoginView{
    @Bind(R.id.login_name)
    EditText loginName;
    @Bind(R.id.login_password)
    EditText loginPassword;
    @Bind(R.id.btn_login)
    Button btnLogin;

    private BasePresenter.LoginPresenter loginPresenter;
    private Map<String, String> map;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        map=new HashMap<String, String>();
        map.put("loginName","susu");
        map.put("passwd","112233");
        init();
    }

    private void init() {

        loginPresenter=new LoginPresenterImpl(this);

    }
    @OnClick(R.id.btn_login)
    public void click(){
        loginPresenter.requestNetWork(getApplicationContext(),map);
        Intent intent=new Intent();
        intent.setClass(this,MainActivity.class);
        startActivity(intent);
    }
    @Override
    protected int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    public void setData(List<UserBean.ResultBean.DataBean> datas) {
        setMemberSharedPreference(datas);
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
    public void showFoot() {

    }

    @Override
    public void hideFoot() {

    }
}
