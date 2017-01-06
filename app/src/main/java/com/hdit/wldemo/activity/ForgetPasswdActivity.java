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
import android.widget.Toast;

import com.hdit.wldemo.R;
import com.hdit.wldemo.mvp.Bean.ForgetPasswordBean;
import com.hdit.wldemo.mvp.presenter.BasePresenter;
import com.hdit.wldemo.mvp.presenter.ForgetPasswdPresenterImpl;
import com.hdit.wldemo.mvp.view.BaseView;

import java.util.HashMap;
import java.util.Map;

import butterknife.Bind;

/**
 * Created by joker on 2016/11/25.
 */

public class ForgetPasswdActivity extends BaseNewActivity implements BaseView.foegetPassword{
    @Bind(R.id.find_password)
    EditText findPassword;
    @Bind(R.id.btn_find)
    Button btnFind;

    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.toolbar_title)
    TextView toolbarTitle;
    @Bind(R.id.toolbar_right)
    ImageView toolbarRight;
    @Bind(R.id.toolbar_image)
    ImageView toolbarLeft;

    private BasePresenter.forgetPasswdPresenter forgetPasswdPresenter;
    private int code;
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

        forgetPasswdPresenter=new ForgetPasswdPresenterImpl(this);
        btnFind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(findPassword.getText())){
                    Toast("请输入邮箱");
                }else {
                    Map<String,String> map=new HashMap<>();
                    map.put("email",findPassword.getText().toString());
                    forgetPasswdPresenter.requestNetWork(map);
                }
            }
        });
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_forget_password;
    }

    @Override
    public void setData(ForgetPasswordBean datas) {
        this.code=datas.getResult().getCode();
        this.type=datas.getType();
        this.message=datas.getMessage();
        nextDo();
    }

    @Override
    public void netWorkError() {
        Toast("网络异常");
    }

    private void nextDo() {
        if (type==1){
            Intent intent=new Intent();
            intent.putExtra("code",code);
            intent.putExtra("email",findPassword.getText().toString());
            intent.setClass(this,ForgetPasswdNextActivity.class);
            startActivity(intent);
        }else {
            Toast.makeText(this,message,Toast.LENGTH_LONG).show();
        }
    }

}
