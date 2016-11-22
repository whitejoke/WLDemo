package com.hdit.wldemo.activity;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import com.hdit.wldemo.R;
import com.hdit.wldemo.mvp.Bean.Member;
import com.hdit.wldemo.utils.ActivityUtils;
import com.hdit.wldemo.utils.LogUtils;

import butterknife.Bind;

/**
 * Created by joker on 2016/11/17.
 */

public class MineInfomationActivity extends BaseActivity {

    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.toolbar_title)
    TextView toolbarTitle;
    @Bind(R.id.toolbar_right)
    ImageView toolbarRight;
    @Bind(R.id.toolbar_image)
    ImageView toolbarLeft;

    @Bind(R.id.member_name)
    TextView memberName;

    private String member_name;

    public static void startIntent(Member member) {
        Bundle bundle = new Bundle();
        bundle.putString("memberName",member.getResult().getArchive().get(0).getCustoInfo().getUserName()==null?"":member.getResult().getArchive().get(0).getCustoInfo().getUserName());
        ActivityUtils.startActivity(MineInfomationActivity.class, bundle);
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
            member_name = bundle.getString("memberName");
        }
    }

    private void init() {
        toolbarTitle.setText("个人信息");
        toolbar.setNavigationIcon(R.mipmap.toolbar_left);
        toolbar.setBackgroundResource(R.color.white);

        showView();
    }

    private void showView() {
        LogUtils.i("susu",member_name);
        memberName.setText(member_name);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.mine_item;
    }


}
