package com.hdit.wldemo.network;

import android.content.Context;

import com.hdit.wldemo.mvp.Bean.ForgetPasswordBean;
import com.hdit.wldemo.mvp.Bean.HomeBean;
import com.hdit.wldemo.mvp.Bean.Member;
import com.hdit.wldemo.mvp.Bean.PostNoBean;
import com.hdit.wldemo.mvp.Bean.UserBean;
import com.hdit.wldemo.utils.rxUtils;

import java.util.Map;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * by y on 2016/5/6.
 */
public class NetWorkRequest {

    public static void loginDetail(final Context context, final Map<String,String> map, Subscriber<UserBean> subscriber){
        rxUtils.unsubscribe();
        rxUtils.subscription = Network.getWlApi().getUserInfo(map)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }
    public static void homeDetail(Map<String,Integer> map, Subscriber<HomeBean> subscriber){
        rxUtils.unsubscribe();
        rxUtils.subscription = Network.getWlApi().getNews(map)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }
    public static void registerDetail(Map<String,String> map,Subscriber<PostNoBean> subscriber){
        rxUtils.unsubscribe();
        rxUtils.subscription = Network.getWlApi().postRegister(map)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }
    public static void memberDetail(int userId, Subscriber<Member> subscriber){
        rxUtils.unsubscribe();
        rxUtils.subscription=Network.getWlApi().getMember(userId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }
    public static void updatePasswd(Map<String,String> map,Subscriber<PostNoBean> subscriber){
        rxUtils.unsubscribe();
        rxUtils.subscription=Network.getWlApi().postUpdatePasswd(map)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }
    public static void forgetPasswd(Map<String,String> map, Subscriber<ForgetPasswordBean> subscriber){
        rxUtils.unsubscribe();
        rxUtils.subscription=Network.getWlApi().postForgetPasswd(map)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }
}
