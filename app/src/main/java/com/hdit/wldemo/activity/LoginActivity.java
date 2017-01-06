package com.hdit.wldemo.activity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.hdit.wldemo.R;
import com.hdit.wldemo.constant.Constant;
import com.hdit.wldemo.mvp.Bean.UserForEmp;
import com.hdit.wldemo.mvp.Bean.UserBean;
import com.hdit.wldemo.mvp.presenter.BasePresenter;
import com.hdit.wldemo.mvp.presenter.LoginForEmpPresenterImpl;
import com.hdit.wldemo.mvp.presenter.LoginPresenterImpl;
import com.hdit.wldemo.mvp.view.BaseView;

import java.util.HashMap;
import java.util.Map;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * Created by joker on 2016/11/14.
 */

public class LoginActivity extends BaseNewActivity implements BaseView.LoginView, BaseView.LoginForEmpView {
    @Bind(R.id.login_name)
    EditText loginName;
    @Bind(R.id.login_password)
    EditText loginPassword;
    @Bind(R.id.btn_login)
    Button btnLogin;
    @Bind(R.id.check_login)
    CheckBox checkLogin;


    private BasePresenter.LoginPresenter loginPresenter;
    private BasePresenter.LoginForEmpPresenter loginForEmpPresenter;
    private Map<String, String> map;
    private int id;
    private int TYPE=0;
    private int type;
    private String message;
    private boolean ischeck=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }

    private void init() {
        TYPE=getIntent().getIntExtra("type",0);
        loginPresenter=new LoginPresenterImpl(this);
        loginForEmpPresenter=new LoginForEmpPresenterImpl(this);
        if (TYPE==Constant.TYPE){
            new AlertDialog.Builder(LoginActivity.this)
                    .setTitle("修改成功")
                    .setPositiveButton("OK", null)
                    .create().show();
        }
    }
    @OnClick(R.id.btn_login)
    public void click(){
        if (TextUtils.isEmpty(loginName.getText())){
            Toast("用户名不能为空");
        }else if (TextUtils.isEmpty(loginPassword.getText())){
            Toast("密码不能为空");
        }else if(!checkLogin.isChecked()){
            ischeck=false;
            map=new HashMap<String, String>();
            map.put("loginName",loginName.getText().toString());
            map.put("passwd",loginPassword.getText().toString());
            map.put("type","0");
            loginPresenter.requestNetWork(getApplicationContext(),map);
        }else {
            ischeck=true;
            map=new HashMap<String, String>();
            map.put("loginName",loginName.getText().toString());
            map.put("passwd",loginPassword.getText().toString());
            map.put("type","1");
            loginForEmpPresenter.requestNetWork(map);
        }
    }
    @OnClick(R.id.register)
    public void register(){
        Intent intent=new Intent();
        intent.setClass(this,RegisterActivity.class);
        startActivity(intent);
    }
    @OnClick(R.id.forget_passwd)
    public void forgetPasswd(){
        Intent intent=new Intent();
        intent.setClass(this,ForgetPasswdActivity.class);
        startActivity(intent);
    }
    @Override
    protected int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    public void setData(UserBean datas) {
        this.id=datas.getResult().getData().get(0).getId();
        this.type=datas.getType();
        this.message=datas.getMessage();
        setMemberSharedPreference(datas.getResult().getData(),ischeck);
        DoNext();
    }

    @Override
    public void setData(UserForEmp datas) {
        this.id=datas.getResult().getData().getId();
        this.type=datas.getType();
        this.message=datas.getMessage();
        setMemberForEmpSharedPreference(datas.getResult().getData(),ischeck);
        DoNext();
    }

    @Override
    public void netWorkError() {
        Toast("出错啦");
    }

    private void DoNext() {
        if (type==1){
            Intent intent=new Intent();
            intent.setClass(this,MainActivity.class);
            startActivity(intent);
//            intent.putExtra("id",id);
//            setResult(Constant.RESULTCODE,intent);
//            finish();
        }else {
            Toast(message);
        }
    }


}
