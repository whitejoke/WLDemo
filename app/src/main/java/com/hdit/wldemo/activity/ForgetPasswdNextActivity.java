package com.hdit.wldemo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.hdit.wldemo.R;
import com.hdit.wldemo.constant.Constant;
import com.hdit.wldemo.mvp.Bean.ForgetPasswordBean;
import com.hdit.wldemo.mvp.presenter.BasePresenter;
import com.hdit.wldemo.mvp.presenter.ForgetPasswdPresenterImpl;
import com.hdit.wldemo.mvp.view.BaseView;

import java.util.HashMap;
import java.util.Map;

import butterknife.Bind;

/**
 * Created by joker on 2016/11/29.
 */

public class ForgetPasswdNextActivity extends BaseNewActivity implements BaseView.foegetPassword {
    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.toolbar_title)
    TextView toolbarTitle;
    @Bind(R.id.toolbar_right)
    ImageView toolbarRight;
    @Bind(R.id.toolbar_image)
    ImageView toolbarLeft;

    @Bind(R.id.btn_recognition)
    Button btnRecognition;
    @Bind(R.id.et_password)
    EditText etPassword;
    @Bind(R.id.et_code)
    EditText etCode;

    private BasePresenter.forgetPasswdPresenter forgetPasswdPresenter;
    private int code;
    private String email;
    private int type;
    private String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }

    private void init() {
        toolbarTitle.setText("找回密码");
        toolbar.setNavigationIcon(R.mipmap.toolbar_left);
        toolbar.setBackgroundResource(R.color.white);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        code=getIntent().getIntExtra("code",0);
        email=getIntent().getStringExtra("email");
        forgetPasswdPresenter=new ForgetPasswdPresenterImpl(this);
        btnRecognition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(etPassword.getText())){
                    Toast("请输入新密码");
                }else if (TextUtils.isEmpty(etCode.getText())){
                    Toast("请输入验证码");
                }else if (code==Integer.parseInt(etCode.getText().toString())){
                    Map<String,String> map=new HashMap<>();
                    map.put("email",email);
                    map.put("passwd",etPassword.getText().toString());
                    forgetPasswdPresenter.requestNetWork(map);
                }else {
                    Toast("验证码错误");
                }
            }
        });
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_forget_passwd_next;
    }

    @Override
    public void setData(ForgetPasswordBean datas) {
        this.type=datas.getType();
        this.message=datas.getMessage();
        Intent intent=new Intent();
        intent.putExtra("type", Constant.TYPE);
        intent.setClass(ForgetPasswdNextActivity.this,LoginActivity.class);
        startActivity(intent);
    }

    @Override
    public void netWorkError() {
        Toast("网络异常");
    }
}
