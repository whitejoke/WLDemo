package com.hdit.wldemo.activity;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.hdit.wldemo.R;
import com.hdit.wldemo.mvp.Bean.PostNoBean;
import com.hdit.wldemo.mvp.presenter.BasePresenter;
import com.hdit.wldemo.mvp.presenter.RegisterPresenterImpl;
import com.hdit.wldemo.mvp.view.BaseView;

import java.util.HashMap;
import java.util.Map;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * Created by joker on 2016/11/21.
 */

public class RegisterActivity extends BaseActivity implements BaseView.RegisterView{
    @Bind(R.id.register_name)
    EditText registerName;
    @Bind(R.id.register_password)
    EditText registerPassword;
    @Bind(R.id.register_email)
    EditText registerEmail;
    @Bind(R.id.btn_register)
    Button btnRegister;

    private BasePresenter.RegisterPresenter registerPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }

    private void init() {
        registerPresenter=new RegisterPresenterImpl(this);
    }
    @OnClick(R.id.btn_register)
    public void click(){
        if (TextUtils.isEmpty(registerName.getText().toString())){
            Toast.makeText(this,"请输入用户名",Toast.LENGTH_LONG).show();
        }else if (TextUtils.isEmpty(registerPassword.getText().toString())){
            Toast.makeText(this,"请输入密码",Toast.LENGTH_LONG).show();
        }else {
            Map<String,String> map=new HashMap<>();
            map.put("loginName",registerName.getText().toString());
            map.put("passwd",registerPassword.getText().toString());
            registerPresenter.requestNeyWork(map);
        }

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_register;
    }

    @Override
    public void setData(PostNoBean datas) {

    }

    @Override
    public void netWorkError() {

    }
}
