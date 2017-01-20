package com.hdit.wldemo.activity;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import com.hdit.wldemo.R;

import butterknife.Bind;

/**
 * Created by joker on 2016/11/17.
 */

public class DetailActivity extends BaseNewActivity {
    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.toolbar_title)
    TextView toolbarTitle;
    @Bind(R.id.toolbar_right)
    ImageView toolbarRight;
    @Bind(R.id.toolbar_image)
    ImageView toolbarLeft;

    @Bind(R.id.webView)
    WebView webView;

    int id;
    String content=null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }

    private void init() {

        toolbarTitle.setText("美容知识");
        toolbar.setNavigationIcon(R.mipmap.toolbar_left);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        content=getIntent().getStringExtra("content");
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setTextSize(WebSettings.TextSize.LARGER);
        webView.loadDataWithBaseURL(null,content,"text/html","utf-8",null);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_webview;
    }

}
