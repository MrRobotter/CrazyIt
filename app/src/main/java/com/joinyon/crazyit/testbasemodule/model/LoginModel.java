package com.joinyon.crazyit.testbasemodule.model;

import com.joinyon.basemodule.rx.RxSchedulers;
import com.joinyon.crazyit.testbasemodule.api.Api;
import com.joinyon.crazyit.testbasemodule.bean.LoginBean;
import com.joinyon.crazyit.testbasemodule.contract.LoginContract;

import io.reactivex.Flowable;

public class LoginModel implements LoginContract.Model {
    @Override
    public Flowable<LoginBean> login(String loginName, String password) {
        return Api.getDefault().login(loginName, password).compose(RxSchedulers.<LoginBean>io_main());
    }
}
