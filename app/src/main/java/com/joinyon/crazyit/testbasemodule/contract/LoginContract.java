package com.joinyon.crazyit.testbasemodule.contract;

import com.joinyon.basemodule.base.BaseModel;
import com.joinyon.basemodule.base.BasePresenter;
import com.joinyon.basemodule.base.BaseView;
import com.joinyon.crazyit.testbasemodule.bean.LoginBean;

import io.reactivex.Flowable;

public interface LoginContract {

    interface Model extends BaseModel {
        Flowable<LoginBean> login(String loginName, String password);
    }

    interface View extends BaseView {
        void onLogin(LoginBean bean);
    }

    abstract class Presenter extends BasePresenter<View, Model> {

        public abstract void login(String loginName, String password);
    }
}
