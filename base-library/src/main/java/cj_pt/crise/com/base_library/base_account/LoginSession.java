package cj_pt.crise.com.base_library.base_account;

public class LoginSession {

    private static LoginSession sLoginSession = null;
    //已登录用户
    private User loginedUser;

    public static LoginSession getsLoginSession(){
        if (null == sLoginSession){
            sLoginSession = new LoginSession();
        }
        return sLoginSession;
    }

    //设置已登录的用户信息，不对外开放
    public void setsLoginSession(User user){
        loginedUser = user;
    }

    /**
     * 利用原型模式，外部获取User类，只是获取到的User的clone信息，只能通过上面的方法
     * @see LoginSession #setsLoginSession()来修改User中的变量
     * */
    public User getLoginedUser(){
        return loginedUser.clone();
    }





}
