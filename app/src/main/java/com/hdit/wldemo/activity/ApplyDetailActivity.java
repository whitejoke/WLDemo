package com.hdit.wldemo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.hdit.wldemo.R;
import com.hdit.wldemo.adapter.ApplyProjectAdapter;
import com.hdit.wldemo.constant.Constant;
import com.hdit.wldemo.mvp.Bean.ApplyBean;
import com.hdit.wldemo.mvp.Bean.PostNoBean;
import com.hdit.wldemo.mvp.presenter.ApplyPresenterImpl;
import com.hdit.wldemo.mvp.presenter.BasePresenter;
import com.hdit.wldemo.mvp.presenter.ReviewPreferenPresenterImpl;
import com.hdit.wldemo.mvp.view.BaseView;
import com.hdit.wldemo.utils.UIUtils;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import butterknife.Bind;

/**
 * Created by joker on 2017/1/3.
 */

public class ApplyDetailActivity extends BaseNewActivity implements BaseView.applyDetail, View.OnClickListener, BaseView.reviewPreferen {
    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.toolbar_title)
    TextView toolbarTitle;
    @Bind(R.id.toolbar_right)
    ImageView toolbarRight;
    @Bind(R.id.toolbar_image)
    ImageView toolbarLeft;

    @Bind(R.id.ll_apply_pass)
    LinearLayout llApplyPass;
    @Bind(R.id.ll_apply_text)
    LinearLayout llApplyText;
    @Bind(R.id.rl_apply_button)
    RelativeLayout rlApplyButton;
    @Bind(R.id.apply_name)
    TextView applyName;
    @Bind(R.id.apply_creattime)
    TextView applyCreatTime;
    @Bind(R.id.apply_preferStatus)
    TextView applyPreferStatus;
    @Bind(R.id.apply_referPrice)
    TextView applyReferPrice;
    @Bind(R.id.apply_preferPrice)
    TextView applyPreferPrice;
    @Bind(R.id.apply_level)
    TextView applyLevel;
    @Bind(R.id.apply_static)
    TextView applyStatic;
    @Bind(R.id.apply_reviewNote)
    TextView applyReviewNote;
    @Bind(R.id.et_apply_text)
    EditText etApplyText;
    @Bind(R.id.btn_no)
    Button buttonNo;
    @Bind(R.id.btn_yes)
    Button buttonYes;
    @Bind(R.id.apply_order_recycle)
    RecyclerView applyOrderRecycle;

    private ApplyProjectAdapter projectAdapter;
    private String[] first={"未处理","已处理"};
    private String[] second={"通过申请","拒绝申请"};
    private String[] level={"一级","二级","三级"};

    private int id;
    private boolean type;
    private BasePresenter.applyPresenter applyPresenter;
    private BasePresenter.reviewPreferen reviewPreferen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }

    private void init() {
        id=getIntent().getIntExtra("id",0);
        type=getIntent().getBooleanExtra("type",false);
        toolbarTitle.setText("优惠申请详情");
        toolbar.setNavigationIcon(R.mipmap.toolbar_left);
        toolbar.setBackgroundResource(R.color.white);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        applyPresenter=new ApplyPresenterImpl(this);
        applyPresenter.requestNetWork(1);
        reviewPreferen=new ReviewPreferenPresenterImpl(this);

        if (!type){
            llApplyPass.setVisibility(View.GONE);
            llApplyText.setVisibility(View.VISIBLE);
            rlApplyButton.setVisibility(View.VISIBLE);
        }else {
            llApplyPass.setVisibility(View.VISIBLE);
            llApplyText.setVisibility(View.GONE);
            rlApplyButton.setVisibility(View.GONE);
        }
        List<ApplyBean.RowsBean.ProjectDetailsBean> list=new LinkedList<>();
        projectAdapter=new ApplyProjectAdapter(list);
        buttonNo.setOnClickListener(this);
        buttonYes.setOnClickListener(this);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.item_favorable;
    }

    @Override
    public void setData(ApplyBean datas) {
        for (int i=0;i<datas.getRows().size();i++){
            if (datas.getRows().get(i).getId()==id){
                projectAdapter.addAll(datas.getRows().get(i).getProjectDetails());
                applyOrderRecycle.setLayoutManager(new LinearLayoutManager(UIUtils.getContext()));
                applyOrderRecycle.setAdapter(projectAdapter);
                applyName.setText(datas.getRows().get(i).getEmpInfo().getEmpName());
                applyCreatTime.setText(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(datas.getRows().get(0).getEmpInfo().getCreateTime()));
                applyReferPrice.setText(datas.getRows().get(i).getReferPrice());
                applyPreferPrice.setText(String.valueOf(datas.getRows().get(i).getPreferPrice()));
                applyLevel.setText(level[datas.getRows().get(i).getLevel()-1]);
                switch (datas.getRows().get(i).getPreferStatus()){
                    case 1:
                        applyPreferStatus.setText(first[1]);
                        applyStatic.setText(second[0]);
                        applyReviewNote.setText(datas.getRows().get(i).getReviewNote());
                        break;
                    case -1:
                        applyPreferStatus.setText(first[1]);
                        applyStatic.setText(second[1]);
                        applyReviewNote.setText(datas.getRows().get(i).getReviewNote());
                        break;
                    case 0:
                        applyPreferStatus.setText(first[0]);
                        break;
                }
            }
        }

    }

    @Override
    public void setData(PostNoBean datas) {
        Intent intent=new Intent();
        setResult(Constant.RESULTCODE,intent);
        finish();
    }

    @Override
    public void netWorkError() {

    }

    @Override
    public void onClick(View v) {
        Map<String,String> map;
        switch (v.getId()){
            case R.id.btn_no:
                map=new HashMap<>();
                map.put("id", String.valueOf(id));
                map.put("preferStatus","-1");
                map.put("reviewNote",etApplyText.getText().toString());
                reviewPreferen.requestNetWork(map);
                break;
            case R.id.btn_yes:
                map=new HashMap<>();
                map.put("id", String.valueOf(id));
                map.put("preferStatus","-1");
                map.put("reviewNote",etApplyText.getText().toString());
                reviewPreferen.requestNetWork(map);
                break;
        }
    }
}
