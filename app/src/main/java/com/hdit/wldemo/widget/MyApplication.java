package com.hdit.wldemo.widget;

import android.app.Application;

import net.nashlegend.anypref.AnyPref;

/**
 * Created by joker on 2016/11/14.
 */

public class MyApplication extends Application {

    public static MyApplication myApplication;

    public static Application getContext() {

        return myApplication;

    }

    @Override
    public void onCreate() {
        super.onCreate();
        AnyPref.init(this);
        myApplication = this;

    }


}