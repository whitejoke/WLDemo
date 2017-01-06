package com.hdit.wldemo.activity;

import android.os.Bundle;
import android.widget.Toast;

import com.hdit.wldemo.R;
import com.hdit.wldemo.widget.RatingBarView;

import butterknife.Bind;

/**
 * Created by joker on 2016/11/24.
 */

public class EvaluateActivity extends BaseNewActivity {

    @Bind(R.id.custom_ratingbar)
    RatingBarView ratingBarView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }

    private void init() {
        ratingBarView.setOnRatingListener(new RatingBarView.OnRatingListener() {
            @Override
            public void onRating(Object bindObject, int RatingScore) {
                Toast.makeText(EvaluateActivity.this, String.valueOf(RatingScore), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected int getLayoutId() {
        return R.layout.user_comment;
    }
}
