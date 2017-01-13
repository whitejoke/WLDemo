package com.hdit.wldemo.fragment;

/**
 * Created by joker on 2017/1/12.
 */

import android.support.v4.app.Fragment;

/**
 * Fragment懒加载
 */
public abstract class LazyFragment extends Fragment {

    protected boolean isVisible;

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);

        if (getUserVisibleHint()) {
            isVisible = true;
            onVisible();
        } else {
            isVisible = false;
            onInvisible();
        }
    }

    private void onVisible() {
        initData();
    }

    private void onInvisible() {
    }

    protected abstract void initData();

}