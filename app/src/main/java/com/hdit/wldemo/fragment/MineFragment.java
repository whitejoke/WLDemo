package com.hdit.wldemo.fragment;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.hdit.wldemo.R;
import com.hdit.wldemo.activity.EvaluateActivity;
import com.hdit.wldemo.activity.LoginActivity;
import com.hdit.wldemo.activity.MainActivity;
import com.hdit.wldemo.activity.MineApplyNewActivity;
import com.hdit.wldemo.activity.MineEmpInfomationActivity;
import com.hdit.wldemo.activity.MineInfomationActivity;
import com.hdit.wldemo.activity.MineMedicalOrderActivity;
import com.hdit.wldemo.activity.MinePersonInfomation;
import com.hdit.wldemo.activity.MinePostOrderActivity;
import com.hdit.wldemo.activity.SettingActivity;
import com.hdit.wldemo.constant.Constant;
import com.hdit.wldemo.mvp.Bean.Member;
import com.hdit.wldemo.mvp.Bean.MemberForEmp;
import com.hdit.wldemo.mvp.presenter.BasePresenter;
import com.hdit.wldemo.mvp.presenter.MemberForEmpPresenterImpl;
import com.hdit.wldemo.mvp.presenter.MemberPresenterImpl;
import com.hdit.wldemo.mvp.view.BaseView;
import com.hdit.wldemo.utils.LogUtils;
import com.hdit.wldemo.utils.UIUtils;

import butterknife.Bind;

import static android.content.Context.MODE_WORLD_READABLE;

/**
 * Created by joker on 2016/11/10.
 */

public class MineFragment extends BaseFragment implements View.OnClickListener, BaseView.MemberView, BaseView.MemberForEmpView {
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

    @Bind(R.id.mine_emp_infomation)
    TextView mineEmpInfomation;
    @Bind(R.id.mine_apply)
    TextView mineApply;

    @Bind(R.id.user_head)
    ImageView userHead;
    @Bind(R.id.ll_login)
    LinearLayout linearLayout;
    @Bind(R.id.ll_user)
    LinearLayout ll_User;
    @Bind(R.id.ll_emp)
    LinearLayout ll_Emp;
    @Bind(R.id.rl_login)
    RelativeLayout relativeLayout;
    @Bind(R.id.head_name)
    TextView headName;

    private BasePresenter.MemberPresenter memberPresenter;
    private BasePresenter.MemberForEmpPresenter memberForEmpPresenter;
    protected SharedPreferences sharedPreferences;

    private Member member;
    private MemberForEmp memberForEmp;
    private int userId;
    private boolean error=false;
    private boolean ischeck;

    @Override
    protected View initView() {
        return View.inflate(UIUtils.getActivity(), R.layout.fragment_mime,null);
    }

    @Override
    protected void initData() {
        memberPresenter=new MemberPresenterImpl(this);
        memberForEmpPresenter=new MemberForEmpPresenterImpl(this);

        sharedPreferences=UIUtils.getActivity().getSharedPreferences("member",MODE_WORLD_READABLE);
        userId=sharedPreferences.getInt("id",0);
        ischeck=sharedPreferences.getBoolean("isChecked",false);
        LogUtils.i("susu", "222222222");
//        userId=7;
//        ischeck=false;
        if (userId==0){
            linearLayout.setVisibility(View.VISIBLE);
            relativeLayout.setVisibility(View.GONE);
        }else if (ischeck==false){
            ll_User.setVisibility(View.VISIBLE);
            ll_Emp.setVisibility(View.GONE);
            linearLayout.setVisibility(View.GONE);
            relativeLayout.setVisibility(View.VISIBLE);
            memberPresenter.requestNeyWork(userId);
        }else {
            ll_User.setVisibility(View.GONE);
            ll_Emp.setVisibility(View.VISIBLE);
            linearLayout.setVisibility(View.GONE);
            relativeLayout.setVisibility(View.VISIBLE);
            memberForEmpPresenter.requestNetWork(userId);
        }
        showView();
    }

    private void showView() {
        mineInfomation.setOnClickListener(this);
        mineMedicalOrder.setOnClickListener(this);
        mineCounselorOrder.setOnClickListener(this);
        minePersonInfomation.setOnClickListener(this);
        mineShare.setOnClickListener(this);
        mineError.setOnClickListener(this);

        mineEmpInfomation.setOnClickListener(this);
        mineApply.setOnClickListener(this);

        userHead.setOnClickListener(this);
        toolbarRight.setOnClickListener(this);

        toolbarTitle.setText("我的");
        toolbar.setNavigationIcon(R.mipmap.toolbar_left);
        toolbarRight.setImageResource(R.mipmap.mine_setting);
        toolbarTitle.setTextColor(this.getResources().getColorStateList(R.color.white));

    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.mine_infomation:
                if (userId==0){
                    CheckUserId();
                }else if (error){
                    Toast("没网啦");
                }else {
                    Bundle bundle = new Bundle();
                    bundle.putString("memberId",
                            String.valueOf(member.getRows().get(0).getId()));
                    bundle.putString("memberName",
                            member.getRows().get(0).getCustoInfo().getUserName()==null?null:member.getRows().get(0).getCustoInfo().getUserName());
                    bundle.putString("memberSex",
                            member.getRows().get(0).getCustoInfo().getSex()==null?null:member.getRows().get(0).getCustoInfo().getSex());
                    bundle.putString("memberTelephone",
                            member.getRows().get(0).getCustoInfo().getTelphone()==null?null:member.getRows().get(0).getCustoInfo().getTelphone());
                    bundle.putString("memberAddress",
                            member.getRows().get(0).getCustoInfo().getAddress()==null?null:member.getRows().get(0).getCustoInfo().getAddress());
                    bundle.putString("memberBirthday",
                            member.getRows().get(0).getCustoInfo().getBirthday()==null?null:member.getRows().get(0).getCustoInfo().getBirthday());
                    intent=new Intent();
                    intent.setClass(getActivity(),MineInfomationActivity.class);
                    intent.putExtras(bundle);
                    startActivityForResult(intent,Constant.REQUESTCODE);
                    //MineInfomationActivity.startIntent(member);
                }
                break;
            case R.id.mine_emp_infomation:
                if (userId==0){
                    CheckUserId();
                }else if (error){
                    Toast("没网啦");
                }else {
                    Bundle bundle = new Bundle();
                    bundle.putInt("memberId",
                            memberForEmp.getResult().getEmpInfo().get(0).getId());
                    bundle.putString("memberName",
                            memberForEmp.getResult().getEmpInfo().get(0).getEmpName()==null?null:memberForEmp.getResult().getEmpInfo().get(0).getEmpName());
                    bundle.putInt("memberSex",
                            memberForEmp.getResult().getEmpInfo().get(0).getSex());
                    bundle.putString("memberJobNum",
                            memberForEmp.getResult().getEmpInfo().get(0).getEmpNumber()==null?null:memberForEmp.getResult().getEmpInfo().get(0).getEmpNumber());
                    bundle.putString("memberRoom",
                            memberForEmp.getResult().getEmpInfo().get(0).getRoom()==null?null:memberForEmp.getResult().getEmpInfo().get(0).getRoom());
                    bundle.putLong("memberEntryTime",
                            memberForEmp.getResult().getEmpInfo().get(0).getEntryTime());
                    intent=new Intent();
                    intent.setClass(getActivity(),MineEmpInfomationActivity.class);
                    intent.putExtras(bundle);
                    startActivityForResult(intent,Constant.REQUESTCODE);
                   // MineEmpInfomationActivity.startIntent(memberForEmp);
                }
                break;
            case R.id.mine_medical_order:
                if (userId==0)
                    CheckUserId();
                else if (error){
                    Toast("没网啦");
                }
                else{
                    intent=new Intent();
                    intent.setClass(getActivity(),MineMedicalOrderActivity.class);
                    startActivity(intent);
                }
                    //MineMedicalOrderActivity.startIntent();
                break;
            case R.id.mine_counselor_order:
                if (userId==0)
                    CheckUserId();
                else if (error){
                    Toast("没网啦");
                }
                else{
                    intent=new Intent();
                    intent.setClass(getActivity(),MinePostOrderActivity.class);
                    startActivity(intent);
                }
                    //MinePostOrderActivity.startIntent();
                break;
            case R.id.mine_person_infomation:
                if (userId==0)
                    CheckUserId();
                else if (error){
                    Toast("没网啦");
                }
                else{
                    Bundle bundle = new Bundle();
                    bundle.putInt("memberId",
                            member.getRows().get(0).getId());
                    bundle.putString("memberTrueName",
                            member.getRows().get(0).getCustoInfo().getUuid()==null?null:member.getRows().get(0).getCustoInfo().getUuid());
                    bundle.putString("memberAge",
                            member.getRows().get(0).getCustoInfo().getAge()==null?null:member.getRows().get(0).getCustoInfo().getAge());
                    bundle.putString("memberBirthday",
                            member.getRows().get(0).getCustoInfo().getBirthday()==null?null:member.getRows().get(0).getCustoInfo().getBirthday());
                    bundle.putString("memberOccupa",
                            member.getRows().get(0).getCustoInfo().getOccupa()==null?null:member.getRows().get(0).getCustoInfo().getOccupa());
                    bundle.putString("memberTelephone",
                            member.getRows().get(0).getCustoInfo().getTelphone()==null?null:member.getRows().get(0).getCustoInfo().getTelphone());
                    bundle.putString("memberIdnum",
                            member.getRows().get(0).getCustoInfo().getIdNum()==null?null:member.getRows().get(0).getCustoInfo().getIdNum());
                    bundle.putString("memberEmail",
                            member.getRows().get(0).getCustoInfo().getEmail()==null?null:member.getRows().get(0).getCustoInfo().getEmail());
                    bundle.putString("memberUserCard",
                            member.getRows().get(0).getCustoInfo().getUserCardNum()==null?null:member.getRows().get(0).getCustoInfo().getUserCardNum());
                    bundle.putString("memberIncome",
                            member.getRows().get(0).getCustoInfo().getIncome()==null?null:member.getRows().get(0).getCustoInfo().getIncome());
                    intent=new Intent();
                    intent.setClass(getActivity(),MinePersonInfomation.class);
                    intent.putExtras(bundle);
                    startActivityForResult(intent,Constant.REQUESTCODE);
                }
                break;
            case R.id.toolbar_right:
                intent=new Intent();
                intent.setClass(getActivity(), SettingActivity.class);
                startActivityForResult(intent,Constant.REQUESTCODE);
                break;
            case R.id.mine_error:
                intent=new Intent();
                intent.setClass(getActivity(), EvaluateActivity.class);
                startActivity(intent);
                break;
            case R.id.user_head:
                intent=new Intent();
                intent.setClass(getActivity(), LoginActivity.class);
                startActivity(intent);
                break;
            case R.id.mine_apply:
                if (userId==0)
                    CheckUserId();
                else if (error){
                    Toast("没网啦");
                }
                else{
                    intent=new Intent();
                    intent.setClass(getActivity(),MineApplyNewActivity.class);
                    startActivity(intent);
                }
                    //MineApplyNewActivity.startIntent();
                break;
        }
    }
    private void CheckUserId() {
        Intent intent;
        intent=new Intent();
        intent.setClass(getActivity(), LoginActivity.class);
        startActivity(intent);
    }

    @Override
    public void setData(Member datas) {
        member=new Member();
        member=datas;
        showHead();
    }

    @Override
    public void setData(MemberForEmp datas) {
        memberForEmp=new MemberForEmp();
        memberForEmp=datas;
        showEmpHead();
    }

    private void showEmpHead() {
        headName.setText(memberForEmp.getResult().getEmpInfo().get(0).getEmpName());
    }

    private void showHead() {
        headName.setText(member.getRows().get(0).getLoginName());
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode==Constant.RESULTCODE){
            onRefresh();
        }else if (resultCode==Constant.RESULT_SETTING_CODE){
            onRefresh();
        }
    }

    private void onRefresh() {
        activity= (MainActivity) getActivity();
        memberPresenter=new MemberPresenterImpl(this);
        sharedPreferences=UIUtils.getActivity().getSharedPreferences("member",MODE_WORLD_READABLE);
        int userId=sharedPreferences.getInt("id",0);
        LogUtils.i("susu", String.valueOf(userId)+"----------");
        if (userId==0){
            linearLayout.setVisibility(View.VISIBLE);
            relativeLayout.setVisibility(View.GONE);
        }else if (ischeck==false){
            ll_User.setVisibility(View.VISIBLE);
            ll_Emp.setVisibility(View.GONE);
            linearLayout.setVisibility(View.GONE);
            relativeLayout.setVisibility(View.VISIBLE);
            memberPresenter.requestNeyWork(userId);
        }else {
            ll_User.setVisibility(View.GONE);
            ll_Emp.setVisibility(View.VISIBLE);
            linearLayout.setVisibility(View.GONE);
            relativeLayout.setVisibility(View.VISIBLE);
            memberForEmpPresenter.requestNetWork(userId);
        }
    }

    @Override
    public void netWorkError() {
        error=true;
        Toast("网络异常");
    }
}
