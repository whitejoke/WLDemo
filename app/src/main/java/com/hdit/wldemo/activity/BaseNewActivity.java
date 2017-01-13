package com.hdit.wldemo.activity;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

import com.hdit.wldemo.mvp.Bean.UserBean;
import com.hdit.wldemo.mvp.Bean.UserForEmp;
import com.hdit.wldemo.utils.ActivityCollector;
import com.hdit.wldemo.utils.LogUtils;
import com.hdit.wldemo.utils.rxUtils;

import java.util.List;

import butterknife.ButterKnife;

/**
 * Created by joker on 2017/1/5.
 */

public abstract class BaseNewActivity extends AppCompatActivity {
    private static Context context;
    private static Activity activity;
    protected SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = getApplicationContext();
        activity = this;
        setContentView(getLayoutId());
        sharedPreferences = getSharedPreferences("member", MODE_WORLD_READABLE);
        LogUtils.i("BaseNewActivity", getClass().getSimpleName());
        ButterKnife.bind(this);
        ActivityCollector.addActivity(this);
        translucentStatusBar();
    }
    private void translucentStatusBar() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {//5.0及以上
            View decorView = getWindow().getDecorView();
            int option = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
            decorView.setSystemUiVisibility(option);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {//4.4到5.0
            WindowManager.LayoutParams localLayoutParams = getWindow().getAttributes();
            localLayoutParams.flags = (WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS | localLayoutParams.flags);
        }
    }

    void Toast(String content) {
        Toast.makeText(this, content, Toast.LENGTH_LONG).show();
    }

    public static Context getContext() {
        return context;
    }

    public static Activity getActivity() {
        return activity;
    }

    protected abstract int getLayoutId();

    protected void setMemberSharedPreference(List<UserBean.ResultBean.DataBean> result, boolean ischeck) {
        clearData();
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("id", result.get(0).getId());
        editor.putBoolean("isChecked",ischeck);
        editor.putString("phone",result.get(0).getCustoInfo().getTelphone());
        editor.putString("name", result.get(0).getCustoInfo().getUuid());
        editor.putInt("sex", result.get(0).getCustoInfo().getSex());
        editor.commit();
    }
    protected void setMemberForEmpSharedPreference(UserForEmp.ResultBean.DataBean result, boolean ischeck) {
        clearData();
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("id",result.getId());
        editor.putBoolean("isChecked",ischeck);
        editor.commit();
    }

    protected void clearData() {
        sharedPreferences.edit().clear().commit();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        rxUtils.unsubscribe();
    }
}
