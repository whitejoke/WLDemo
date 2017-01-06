package com.hdit.wldemo.activity;

import android.os.Bundle;
import android.webkit.WebView;

import com.hdit.wldemo.R;
import com.hdit.wldemo.utils.ActivityUtils;

import butterknife.Bind;

/**
 * Created by joker on 2016/11/17.
 */

public class DetailActivity extends BaseNewActivity {

    @Bind(R.id.webView)
    WebView webView;

    int id;
    String content=null;


    public static void startIntent(int id, String content) {
        Bundle bundle = new Bundle();
        bundle.putInt("id", id);
        bundle.putString("content", content);
        ActivityUtils.startActivity(DetailActivity.class, bundle);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getBundle();
        init();
    }

    private void init() {
        webView.loadDataWithBaseURL(null,content,"text/html","utf-8",null);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_webview;
    }

    private void getBundle() {
        Bundle bundle = getIntent().getExtras();
        if (null != bundle && !bundle.isEmpty()) {
            id = bundle.getInt("id");
            content=bundle.getString("content");
        }
    }
}
