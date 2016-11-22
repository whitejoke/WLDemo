package com.hdit.wldemo.fragment;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.hdit.wldemo.R;
import com.hdit.wldemo.activity.MineInfomationActivity;
import com.hdit.wldemo.activity.MineMedicalOrderActivity;
import com.hdit.wldemo.activity.MinePersonInfomation;
import com.hdit.wldemo.activity.MinePostOrderActivity;
import com.hdit.wldemo.activity.SettingActivity;
import com.hdit.wldemo.mvp.Bean.Member;
import com.hdit.wldemo.mvp.presenter.BasePresenter;
import com.hdit.wldemo.mvp.presenter.MemberPresenterImpl;
import com.hdit.wldemo.mvp.view.BaseView;
import com.hdit.wldemo.utils.UIUtils;

import butterknife.Bind;

import static android.content.Context.MODE_WORLD_READABLE;

/**
 * Created by joker on 2016/11/10.
 */

public class MineFragment extends BaseFragment implements View.OnClickListener, BaseView.MemberView {
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

    private BasePresenter.MemberPresenter memberPresenter;
    protected SharedPreferences sharedPreferences;

    private Member member;

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

        toolbarRight.setOnClickListener(this);

        toolbarTitle.setText("我的");
        toolbar.setNavigationIcon(R.mipmap.toolbar_left);
        toolbarRight.setImageResource(R.mipmap.mine_setting);
        toolbarTitle.setTextColor(this.getResources().getColorStateList(R.color.white));

        memberPresenter=new MemberPresenterImpl(this);
        sharedPreferences=UIUtils.getActivity().getSharedPreferences("member",MODE_WORLD_READABLE);
        int userId=sharedPreferences.getInt("id",0);

        memberPresenter.requestNeyWork(userId);

    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.mine_infomation:
                MineInfomationActivity.startIntent(member);
                break;
            case R.id.mine_medical_order:
                MineMedicalOrderActivity.startIntent();
                break;
            case R.id.mine_counselor_order:
                MinePostOrderActivity.startIntent();
                break;
            case R.id.mine_person_infomation:
                MinePersonInfomation.startIntent(member);
                break;
            case R.id.toolbar_right:
                intent=new Intent();
                intent.setClass(getActivity(), SettingActivity.class);
                startActivity(intent);
        }
    }

    @Override
    public void setData(Member datas) {
        member=new Member();
        member=datas;
        //LogUtils.i("susu",member.getResult().getArchive().get(0).getCustoInfo().getUserName()+"55555");
    }

    @Override
    public void netWorkError() {

    }
}
