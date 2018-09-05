package cj_pt.crise.com.login_regist_moudle.presenter;

import cj_pt.crise.com.base_library.base_mvp.BasePresenter;
import cj_pt.crise.com.login_regist_moudle.mvp_interface.SplashViewPresenterInterface;
import cj_pt.crise.com.login_regist_moudle.view.SplashViewInterface;

public class SplashPresenter extends BasePresenter<SplashViewInterface>
        implements SplashViewPresenterInterface{

    @Override
    public void putParams() {
        String data = "网络请求获取到的数据";
        mViewRef.get().showData(data);
    }
}
