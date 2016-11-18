package com.hdit.wldemo.activity;

import android.os.Bundle;
import android.webkit.WebView;

import com.hdit.wldemo.R;

import butterknife.Bind;

/**
 * Created by joker on 2016/11/17.
 */

public class DetailActivity extends BaseActivity {

    @Bind(R.id.webView)
    WebView webView;

    String content=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }

    private void init() {
        content=getIntent().getStringExtra("HeadNews");
        webView.loadDataWithBaseURL(null,content,"text/html","utf-8",null);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_webview;
    }
}
