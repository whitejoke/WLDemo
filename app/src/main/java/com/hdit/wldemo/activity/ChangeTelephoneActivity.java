package com.hdit.wldemo.activity;

import android.os.Bundle;

import com.hdit.wldemo.R;

/**
 * Created by joker on 2016/11/30.
 */

public class ChangeTelephoneActivity extends BaseNewActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }

    private void init() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_telephone;
    }
}
