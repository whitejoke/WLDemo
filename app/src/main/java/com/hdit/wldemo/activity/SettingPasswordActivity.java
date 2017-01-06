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
import com.hdit.wldemo.constant.Constant;
import com.hdit.wldemo.mvp.Bean.PostNoBean;
import com.hdit.wldemo.mvp.presenter.BasePresenter;
import com.hdit.wldemo.mvp.presenter.UpdatePasswdPresenterImpl;
import com.hdit.wldemo.mvp.view.BaseView;

import java.util.HashMap;
import java.util.Map;

import butterknife.Bind;

/**
 * Created by joker on 2016/11/25.
 */

public class SettingPasswordActivity extends BaseNewActivity implements BaseView.updatePasswdView{
    @Bind(R.id.old_password)
    EditText oldPassword;
    @Bind(R.id.new_password)
    EditText newPassword;
    @Bind(R.id.btn_password)
    Button btnPassword;

    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.toolbar_title)
    TextView toolbarTitle;
    @Bind(R.id.toolbar_right)
    ImageView toolbarRight;
    @Bind(R.id.toolbar_image)
    ImageView toolbarLeft;

    private BasePresenter.updatePasswd updatePasswd;
    private int type;
    private String message=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }

    private void init() {
        toolbarTitle.setText("设置密码");
        toolbar.setNavigationIcon(R.mipmap.toolbar_left);
        toolbar.setBackgroundResource(R.color.white);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        updatePasswd=new UpdatePasswdPresenterImpl(this);
        btnPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(oldPassword.getText())){
                    Toast("请输入旧密码");
                }else if (TextUtils.isEmpty(newPassword.getText())){
                    Toast("请输入新密码");
                }else {
                    Map<String,String> map=new HashMap<String, String>();
                    map.put("id", String.valueOf(7));
                    map.put("oldPasswd",oldPassword.getText().toString());
                    map.put("newPasswd",newPassword.getText().toString());
                    updatePasswd.requestNetWork(map);
                }
            }
        });
    }

    private void nextDo() {
        if (type==1){
            Intent intent=new Intent();
            setResult(Constant.RESULTCODE,intent);
            finish();
        }else {
            Toast.makeText(this,message,Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_setting_password;
    }

    @Override
    public void setData(PostNoBean datas) {
        this.type=datas.getType();
        this.message=datas.getMessage();
        nextDo();
    }

    @Override
    public void netWorkError() {
        Toast("网络异常");
    }
}
