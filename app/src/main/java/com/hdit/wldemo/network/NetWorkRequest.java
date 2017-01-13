package com.hdit.wldemo.network;

import android.content.Context;

import com.hdit.wldemo.mvp.Bean.ApplyBean;
import com.hdit.wldemo.mvp.Bean.ForgetPasswordBean;
import com.hdit.wldemo.mvp.Bean.HomeBean;
import com.hdit.wldemo.mvp.Bean.Member;
import com.hdit.wldemo.mvp.Bean.MemberForEmp;
import com.hdit.wldemo.mvp.Bean.UserForEmp;
import com.hdit.wldemo.mvp.Bean.OrderDetail;
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
    public static void loginForEmpDetail(Map<String,String> map, Subscriber<UserForEmp> subscriber){
        rxUtils.unsubscribe();
        rxUtils.subscription = Network.getWlApi().getUserForEmp(map)
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
    public static void memberForEmpDetail(int empId, Subscriber<MemberForEmp> subscriber){
        rxUtils.unsubscribe();
        rxUtils.subscription=Network.getWlApi().getMemberForEmp(empId)
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
    public static void orderDetail(Map<String,String> map, Subscriber<OrderDetail> subscriber){
        rxUtils.unsubscribe();
        rxUtils.subscription=Network.getWlApi().getOrderDetail(map)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }
    public static void applyDetail(int userId, Subscriber<ApplyBean> subscriber){
        rxUtils.unsubscribe();
        rxUtils.subscription=Network.getWlApi().getApply(userId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }
    public static void updateEmp(Map<String,String> map,Subscriber<PostNoBean> subscriber){
        rxUtils.unsubscribe();
        rxUtils.subscription=Network.getWlApi().postUpdateEmp(map)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }
    public static void updateEvalu(Map<String,String> map,Subscriber<PostNoBean> subscriber){
        rxUtils.unsubscribe();
        rxUtils.subscription=Network.getWlApi().postUpdateEvalu(map)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }
    public static void reviewPreferen(Map<String,String> map,Subscriber<PostNoBean> subscriber){
        rxUtils.unsubscribe();
        rxUtils.subscription=Network.getWlApi().postReviewPreferen(map)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }
}
