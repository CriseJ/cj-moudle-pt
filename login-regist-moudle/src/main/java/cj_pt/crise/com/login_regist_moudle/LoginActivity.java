package cj_pt.crise.com.login_regist_moudle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import cj_pt.crise.com.base_library.base_mvp.BasePresenter;
import cj_pt.crise.com.base_library.base_mvp.MVPBaseActivity;
import cj_pt.crise.com.base_library.base_ui.BaseActivity;
import debug.LoginAndRegistApplication;

public class LoginActivity extends MVPBaseActivity{

    @Override
    protected BasePresenter createPresenter() {
        return null;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}
