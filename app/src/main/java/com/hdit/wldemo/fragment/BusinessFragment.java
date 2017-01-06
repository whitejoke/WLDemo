package com.hdit.wldemo.fragment;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.hdit.wldemo.R;
import com.hdit.wldemo.adapter.FragmentAdapter;
import com.hdit.wldemo.utils.UIUtils;

import butterknife.Bind;

/**
 * Created by joker on 2017/1/4.
 */

public class BusinessFragment extends BaseFragment {
    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.toolbar_title)
    TextView toolbarTitle;
    @Bind(R.id.toolbar_right)
    ImageView toolbarRight;
    @Bind(R.id.toolbar_image)
    ImageView toolbarLeft;
    @Bind(R.id.toolbar_center)
    ImageView toolbarCenter;

    @Bind(R.id.id_tl)
    TabLayout tabLayout;
    @Bind(R.id.id_vp)
    ViewPager viewPager;

    private FragmentAdapter adapter;

    @Override
    protected View initView() {
        return View.inflate(UIUtils.getActivity(),R.layout.mine_apply,null);
    }

    @Override
    protected void initData() {
        toolbarTitle.setText("业务处理");
        toolbar.setBackgroundResource(R.color.white);

        adapter=new FragmentAdapter(getFragmentManager(),getActivity());
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);//将tablayout与viewPager关联起来
        tabLayout.setTabMode(TabLayout.MODE_FIXED);
        for (int i = 0; i < tabLayout.getTabCount(); i++) {
            TabLayout.Tab tab = tabLayout.getTabAt(i);
            tab.setCustomView(adapter.getTabView(i));
        }
    }
}
