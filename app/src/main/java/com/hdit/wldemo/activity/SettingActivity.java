package com.hdit.wldemo.activity;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.hdit.wldemo.R;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }

    private void init() {
        toolbarTitle.setText("设置");
        toolbar.setNavigationIcon(R.mipmap.toolbar_left);
        toolbar.setBackgroundResource(R.color.white);
        try {
            tvCache.setText(DataCleanManager.getTotalCacheSize(SettingActivity.this));
        }catch (Exception e){
            e.printStackTrace();
        }
        tvDel.setOnClickListener(this);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.mine_setting;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv_del:
                DataCleanManager.clearAllCache(SettingActivity.this);
                onRefresh();
                break;
            case R.id.tv_login_out:
                clearData();
                Toast("退出成功！");
        }
    }
    public void onRefresh(){
        try {
            tvCache.setText(DataCleanManager.getTotalCacheSize(SettingActivity.this));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
