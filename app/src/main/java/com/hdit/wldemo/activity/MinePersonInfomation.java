package com.hdit.wldemo.activity;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import com.hdit.wldemo.R;
import com.hdit.wldemo.mvp.Bean.Member;
import com.hdit.wldemo.utils.ActivityUtils;

import java.io.Serializable;

import butterknife.Bind;

/**
 * Created by joker on 2016/11/17.
 */

public class MinePersonInfomation extends BaseActivity {

    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.toolbar_title)
    TextView toolbarTitle;
    @Bind(R.id.toolbar_right)
    ImageView toolbarRight;
    @Bind(R.id.toolbar_image)
    ImageView toolbarLeft;

    private Member member;
    public static void startIntent(Member member) {
        Bundle bundle = new Bundle();
         bundle.putSerializable("member", (Serializable) member);
        ActivityUtils.startActivity(MinePersonInfomation.class, bundle);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getBundle();
        init();
    }
    private void getBundle() {
        Bundle bundle = getIntent().getExtras();
        if (null != bundle && !bundle.isEmpty()) {
            member = (Member) bundle.getSerializable("user");
        }
    }

    private void init() {
        toolbarTitle.setText("个人医疗资料");
        toolbar.setNavigationIcon(R.mipmap.toolbar_left);
        toolbar.setBackgroundResource(R.color.white);
    }
    @Override
    protected int getLayoutId() {
        return R.layout.mine_medical_data;
    }
}
