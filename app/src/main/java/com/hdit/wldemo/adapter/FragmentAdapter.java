package com.hdit.wldemo.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.hdit.wldemo.R;
import com.hdit.wldemo.fragment.ApplyFragment;

/**
 * Created by joker on 2017/1/3.
 */
public class FragmentAdapter extends FragmentPagerAdapter {
    private Context context;
    private final int PAGE_COUNT = 3;
    private String title[] = new String[]{"全部", "未审核", "已审核"};

    public FragmentAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        return ApplyFragment.newInstance(position + 1);
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }
    public View getTabView(int position){
        View view = LayoutInflater.from(context).inflate(R.layout.tab_item, null);
        TextView tv= (TextView) view.findViewById(R.id.textView);
        tv.setText(title[position]);
        return view;
    }
}