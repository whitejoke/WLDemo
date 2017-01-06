package com.hdit.wldemo.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.hdit.wldemo.R;
import com.hdit.wldemo.adapter.FragmentAdapter;
import com.hdit.wldemo.utils.ActivityUtils;

import butterknife.Bind;

/**
 * Created by joker on 2017/1/3.
 */

public class MineApplyNewActivity extends BaseNewActivity {
    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.toolbar_title)
    TextView toolbarTitle;
    @Bind(R.id.toolbar_right)
    ImageView toolbarRight;
    @Bind(R.id.toolbar_image)
    ImageView toolbarLeft;

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private FragmentAdapter adapter;
    private static String POSITION;
    public static void startIntent() {
        Bundle bundle = new Bundle();
        ActivityUtils.startActivity(MineApplyNewActivity.class, bundle);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        toolbarTitle.setText("优惠申请详情");
        toolbar.setNavigationIcon(R.mipmap.toolbar_left);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        tabLayout= (TabLayout) findViewById(R.id.id_tl);
        viewPager= (ViewPager) findViewById(R.id.id_vp);
        adapter=new FragmentAdapter(getSupportFragmentManager(),this);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);//将tablayout与viewPager关联起来
        tabLayout.setTabMode(TabLayout.MODE_FIXED);
        for (int i = 0; i < tabLayout.getTabCount(); i++) {
            TabLayout.Tab tab = tabLayout.getTabAt(i);
            tab.setCustomView(adapter.getTabView(i));
        }
    }
    @Override
    protected int getLayoutId() {
        return R.layout.mine_apply;
    }
}
