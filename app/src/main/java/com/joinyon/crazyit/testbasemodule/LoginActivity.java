package com.joinyon.crazyit.testbasemodule;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.joinyon.basemodule.base.BaseActivity;
import com.joinyon.crazyit.R;
import com.joinyon.crazyit.testbasemodule.bean.LoginBean;
import com.joinyon.crazyit.testbasemodule.contract.LoginContract;
import com.joinyon.crazyit.testbasemodule.model.LoginModel;
import com.joinyon.crazyit.testbasemodule.presenter.LoginPresenter;

import butterknife.BindView;
import butterknife.OnClick;


public class LoginActivity extends BaseActivity<LoginPresenter, LoginModel> implements LoginContract.View {

    @BindView(R.id.tvResponse)
    TextView tvResponse;

    @Override
    protected void getBundleExtras(Bundle extras) {

    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    public void initPresenter() {
        mPresenter.setVM(this, mModel);
    }

    @OnClick(R.id.btnLogin)
    public void onClick(View view) {
        mPresenter.login("15925642987", "11111111");
    }

    @Override
    public void initView() {

    }

    @Override
    public void onLogin(LoginBean bean) {
        tvResponse.setText(bean.toString());
    }

    @Override
    public void showLoading(String s) {

    }

    @Override
    public void stopLoading() {

    }

    @Override
    public void showErrorTip(String s) {

    }
}
