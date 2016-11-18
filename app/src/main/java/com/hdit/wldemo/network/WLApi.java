package com.hdit.wldemo.network;

import com.hdit.wldemo.mvp.Bean.HomeBean;
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

    @GET(Api.GETNEWS)
    Observable<HomeBean> getNews(@Query("pageNum") int pageNum,@Query("pageSize") int pageSize);
}
