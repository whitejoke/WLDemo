package com.hdit.wldemo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.hdit.wldemo.R;
import com.hdit.wldemo.constant.Constant;
import com.hdit.wldemo.mvp.Bean.PostNoBean;
import com.hdit.wldemo.mvp.presenter.BasePresenter;
import com.hdit.wldemo.mvp.presenter.UpdateEvaluPresenterImpl;
import com.hdit.wldemo.mvp.view.BaseView;
import com.hdit.wldemo.widget.RatingBarView;

import java.util.HashMap;
import java.util.Map;

import butterknife.Bind;

/**
 * Created by joker on 2016/11/24.
 */

public class EvaluateActivity extends BaseNewActivity implements BaseView.updateEvalu, View.OnClickListener {

    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.toolbar_title)
    TextView toolbarTitle;
    @Bind(R.id.toolbar_right)
    ImageView toolbarRight;
    @Bind(R.id.toolbar_image)
    ImageView toolbarLeft;

    @Bind(R.id.custom_ratingbar)
    RatingBarView ratingBarView;
    @Bind(R.id.btn_evaluate)
    Button btnEvaluate;
    @Bind(R.id.evaluate_content)
    EditText evaluateContent;

    private BasePresenter.updateEvalu updateEvalu;
    private Map<String,String> map=new HashMap<>();
    private int id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }

    private void init() {
        toolbarTitle.setText("用户评价");
        toolbar.setNavigationIcon(R.mipmap.toolbar_left);
        toolbar.setBackgroundResource(R.color.white);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        id=getIntent().getIntExtra("evaluateId",0);

        updateEvalu=new UpdateEvaluPresenterImpl(this);
        btnEvaluate.setOnClickListener(this);
        ratingBarView.setStar(5,false);
        map.put("star", "5");
        ratingBarView.setOnRatingListener(new RatingBarView.OnRatingListener() {
            @Override
            public void onRating(Object bindObject, int RatingScore) {
                map.put("star", String.valueOf(RatingScore));
            }
        });
    }

    @Override
    protected int getLayoutId() {
        return R.layout.user_comment;
    }

    @Override
    public void setData(PostNoBean datas) {
        Intent intent=new Intent();
        setResult(Constant.RESULTCODE,intent);
        finish();
    }

    @Override
    public void netWorkError() {
        Toast("出错啦");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_evaluate:
                map.put("id", String.valueOf(id));
                map.put("status","1");
                map.put("content",evaluateContent.getText().toString());
                updateEvalu.requestNetWork(map);
                break;
        }
    }
}
