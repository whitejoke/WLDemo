package com.hdit.wldemo.activity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.hdit.wldemo.R;
import com.hdit.wldemo.constant.Constant;
import com.hdit.wldemo.utils.DataCleanManager;

import butterknife.Bind;

/**
 * Created by joker on 2016/11/22.
 */

public class SettingActivity extends BaseActivity implements View.OnClickListener {
    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.toolbar_title)
    TextView toolbarTitle;
    @Bind(R.id.toolbar_right)
    ImageView toolbarRight;
    @Bind(R.id.toolbar_image)
    ImageView toolbarLeft;

    @Bind(R.id.tv_cache)
    TextView tvCache;
    @Bind(R.id.tv_del)
    TextView tvDel;
    @Bind(R.id.tv_passwd_change)
    TextView tvPasswdChange;
    @Bind(R.id.tv_phone)
    TextView tvPhone;
    @Bind(R.id.tv_login_out)
    TextView tvLoginOut;
    @Bind(R.id.ll_phone)
    LinearLayout linearLayout;

    private String telephone;
    private String telePhone;
    private int userId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }

    private void init() {
        toolbarTitle.setText("设置");
        toolbar.setNavigationIcon(R.mipmap.toolbar_left);
        toolbar.setBackgroundResource(R.color.white);

        userId=getIntent().getIntExtra("userId",0);
        telephone=getIntent().getStringExtra("telephone");
        if (userId==0){
            tvLoginOut.setVisibility(View.GONE);
        }else {
            telePhone=telephone.substring(0,3)+"****"+telephone.substring(7,telephone.length());
            tvPhone.setText(telePhone);
            tvLoginOut.setVisibility(View.VISIBLE);
        }
        try {
            tvCache.setText(DataCleanManager.getTotalCacheSize(SettingActivity.this));
        }catch (Exception e){
            e.printStackTrace();
        }
        tvDel.setOnClickListener(this);
        tvPasswdChange.setOnClickListener(this);
        tvLoginOut.setOnClickListener(this);
        linearLayout.setOnClickListener(this);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.mine_setting;
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.tv_del:
                DataCleanManager.clearAllCache(SettingActivity.this);
                onRefresh();
                break;
            case R.id.tv_login_out:
                clearData();
                intent=new Intent();
                setResult(Constant.RESULT_SETTING_CODE);
                Toast("退出成功！");
                finish();
                break;
            case R.id.tv_passwd_change:
                if (userId==0)
                    CheckUserId();
                else
                {
                    intent=new Intent();
                    intent.setClass(this,SettingPasswordActivity.class);
                    startActivityForResult(intent, Constant.REQUESTCODE);
                }
                break;
            case R.id.ll_phone:
                if (userId==0)
                    CheckUserId();
                else{
                    intent=new Intent();
                    intent.setClass(this,ChangeTelephoneActivity.class);
                    startActivityForResult(intent,Constant.REQUESTCODE);
                }
                break;

        }
    }
    public void onRefresh(){
        try {
            tvCache.setText(DataCleanManager.getTotalCacheSize(SettingActivity.this));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void CheckUserId() {
        Intent intent;
        intent=new Intent();
        intent.setClass(getActivity(), LoginActivity.class);
        startActivityForResult(intent, Constant.REQUESTCODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode==Constant.RESULTCODE){
            new AlertDialog.Builder(SettingActivity.this)
                    .setTitle("修改成功")
                    .setPositiveButton("OK", null)
                    .create().show();
        }

    }
}
