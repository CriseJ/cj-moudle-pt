package cj_pt.crise.com.base_library.base_account.login;

import android.content.Context;

public class LoginContext {

    //用户转态，默认为未登录状态
    UserState mState = new LoginOutState();
    //单例
    static LoginContext sLoginContext = new LoginContext();

    public static LoginContext getsLoginContext(){
        return sLoginContext;
    }

    public void setState(UserState userState){
        this.mState = userState;
    }

    public void doSomething(Context context){
        mState.canDoSomething(context);
    }




}
