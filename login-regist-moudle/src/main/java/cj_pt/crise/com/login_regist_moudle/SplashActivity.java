package cj_pt.crise.com.login_regist_moudle;

import android.os.Bundle;

import cj_pt.crise.com.base_library.base_mvp.MVPBaseActivity;
import cj_pt.crise.com.login_regist_moudle.presenter.SplashPresenter;
import cj_pt.crise.com.login_regist_moudle.view.SplashViewInterface;

public class SplashActivity extends MVPBaseActivity<SplashViewInterface, SplashPresenter> implements SplashViewInterface{

    @Override
    protected SplashPresenter createPresenter() {
        return new SplashPresenter();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);
        mPresenter.putParams();
    }


    @Override
    public void showData(String data) {

    }

    @Override
    public void showSuccess() {

    }

    @Override
    public void showEmpty() {

    }

    @Override
    public boolean checkNet() {
        return false;
    }

    @Override
    public void showFaild() {

    }

    @Override
    public void showNoNet() {

    }
}
