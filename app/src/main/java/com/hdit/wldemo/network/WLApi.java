package com.hdit.wldemo.network;

import com.hdit.wldemo.mvp.Bean.ApplyBean;
import com.hdit.wldemo.mvp.Bean.ForgetPasswordBean;
import com.hdit.wldemo.mvp.Bean.HomeBean;
import com.hdit.wldemo.mvp.Bean.Member;
import com.hdit.wldemo.mvp.Bean.MemberForEmp;
import com.hdit.wldemo.mvp.Bean.UserForEmp;
import com.hdit.wldemo.mvp.Bean.OrderDetail;
import com.hdit.wldemo.mvp.Bean.PostNoBean;
import com.hdit.wldemo.mvp.Bean.UserBean;

import java.util.Map;

import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Created by joker on 2016/11/10.
 */

public interface WLApi {
    @POST("{url}")
    Observable<String> executePost(@Path("url") String url,@QueryMap Map<String, String> map);

    @GET("{url")
    Observable<HomeBean> executeGet(@Path("url") String url, @QueryMap Map<String,String> map);


    @GET(Api.LOGIN)
    Observable<UserBean> getUserInfo(@QueryMap Map<String,String> map);

    @GET(Api.LOGIN)
    Observable<UserForEmp> getUserForEmp(@QueryMap Map<String,String> map);


    @GET(Api.GETNEWS)
    Observable<HomeBean> getNews(@QueryMap Map<String,Integer> map);

    @POST(Api.BUILDARCHIVE)
    Observable<PostNoBean> postRegister(@QueryMap Map<String,String> map);

    @GET(Api.GETUSERARCHIVE)
    Observable<Member> getMember(@Query("userId") int userId);

    @GET(Api.GETEMPINFO)
    Observable<MemberForEmp> getMemberForEmp(@Query("empId") int empId);

    @POST(Api.UPDATEPASSWD)
    Observable<PostNoBean> postUpdatePasswd(@QueryMap Map<String,String> map);

    @POST(Api.FORGETPASSWD)
    Observable<ForgetPasswordBean> postForgetPasswd(@QueryMap Map<String,String> map);

    @GET(Api.GETORDERDETAIL)
    Observable<OrderDetail> getOrderDetail(@QueryMap Map<String,String> map);

    @GET(Api.GETPREFERENAPPLY)
    Observable<ApplyBean> getApply(@Query("userId") int userId);

    @POST(Api.UPDATEEMPLOYEE)
    Observable<PostNoBean> postUpdateEmp(@QueryMap Map<String,String> map);

    @POST(Api.UPDATEEVALU)
    Observable<PostNoBean> postUpdateEvalu(@QueryMap Map<String,String> map);

    @POST(Api.REVIEWPREFEREN)
    Observable<PostNoBean> postReviewPreferen(@QueryMap Map<String,String> map);

}
