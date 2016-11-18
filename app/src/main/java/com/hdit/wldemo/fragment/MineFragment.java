package com.hdit.wldemo.fragment;

import android.content.Intent;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.hdit.wldemo.R;
import com.hdit.wldemo.activity.MineInfomationActivity;
import com.hdit.wldemo.activity.MineMedicalOrderActivity;
import com.hdit.wldemo.activity.MinePersonInfomation;
import com.hdit.wldemo.activity.MinePostOrderActivity;
import com.hdit.wldemo.utils.UIUtils;

import butterknife.Bind;

/**
 * Created by joker on 2016/11/10.
 */

public class MineFragment extends BaseFragment implements View.OnClickListener {
    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.toolbar_title)
    TextView toolbarTitle;
    @Bind(R.id.toolbar_right)
    ImageView toolbarRight;
    @Bind(R.id.toolbar_image)
    ImageView toolbarLeft;

    @Bind(R.id.mine_infomation)
    TextView mineInfomation;
    @Bind(R.id.mine_medical_order)
    TextView mineMedicalOrder;
    @Bind(R.id.mine_counselor_order)
    TextView mineCounselorOrder;
    @Bind(R.id.mine_person_infomation)
    TextView minePersonInfomation;
    @Bind(R.id.mine_share)
    TextView mineShare;
    @Bind(R.id.mine_error)
    TextView mineError;



    @Override
    protected View initView() {
        return View.inflate(UIUtils.getActivity(), R.layout.fragment_mime,null);
    }

    @Override
    protected void initData() {
        mineInfomation.setOnClickListener(this);
        mineMedicalOrder.setOnClickListener(this);
        mineCounselorOrder.setOnClickListener(this);
        minePersonInfomation.setOnClickListener(this);
        mineShare.setOnClickListener(this);
        mineError.setOnClickListener(this);

        toolbarTitle.setText("我的");
        toolbar.setNavigationIcon(R.mipmap.toolbar_left);

    }

    @Override
    public void onClick(View v) {
        Intent intent=new Intent();
        switch (v.getId()){
            case R.id.mine_infomation:
                intent.setClass(getContext(), MineInfomationActivity.class);
                startActivity(intent);
                break;
            case R.id.mine_medical_order:
                intent.setClass(getContext(), MineMedicalOrderActivity.class);
                startActivity(intent);
                break;
            case R.id.mine_counselor_order:
                intent.setClass(getContext(), MinePostOrderActivity.class);
                startActivity(intent);
                break;
            case R.id.mine_person_infomation:
                intent.setClass(getContext(), MinePersonInfomation.class);
                startActivity(intent);
                break;
        }
    }

}
