package com.joinyon.crazyit.testbasemodule.presenter;

import com.joinyon.basemodule.rx.RxSubscriber;
import com.joinyon.basemodule.utils.ToastUtils;
import com.joinyon.crazyit.testbasemodule.bean.LoginBean;
import com.joinyon.crazyit.testbasemodule.contract.LoginContract;

public class LoginPresenter extends LoginContract.Presenter {
    @Override
    public void login(String loginName, String password) {
        mModel.login(loginName, password)
                .subscribe(new RxSubscriber<LoginBean>(mContext, true, "正在登录") {
                    @Override
                    protected void _onNext(LoginBean bean) {
                        mView.onLogin(bean);
                    }

                    @Override
                    protected void _onError(String s) {
                        ToastUtils.showShortToast(mContext, s);
                    }
                });
    }
}
