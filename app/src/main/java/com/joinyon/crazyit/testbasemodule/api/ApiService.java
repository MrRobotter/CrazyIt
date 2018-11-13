package com.joinyon.crazyit.testbasemodule.api;

import com.joinyon.crazyit.testbasemodule.bean.LoginBean;

import io.reactivex.Flowable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiService {
    @FormUrlEncoded
    @POST(ApiConstants.LOGIN_URL)
    Flowable<LoginBean> login(@Field("loginName") String loginName, @Field("password") String password);

}
