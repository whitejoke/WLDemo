package com.hdit.wldemo.fragment;

import android.view.View;

import com.hdit.wldemo.R;
import com.hdit.wldemo.utils.UIUtils;

/**
 * Created by joker on 2016/11/10.
 */

public class FlowFragment extends BaseFragment {
    @Override
    protected View initView() {
        return View.inflate(UIUtils.getActivity(), R.layout.fragment_flow,null);
    }

    @Override
    protected void initData() {

    }
}
