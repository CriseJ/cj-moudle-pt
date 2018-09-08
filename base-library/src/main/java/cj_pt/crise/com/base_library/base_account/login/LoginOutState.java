package cj_pt.crise.com.base_library.base_account.login;

import android.content.Context;

import com.alibaba.android.arouter.launcher.ARouter;

/**
* 注销状态
 *
* */
public class LoginOutState implements UserState{

    @Override
    public void canDoSomething(Context context) {
        gotoLoginActivity(context);
    }

    private void gotoLoginActivity(Context context){
        ARouter.getInstance().build("").navigation();
    }


}
