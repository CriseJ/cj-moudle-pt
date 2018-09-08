package cj_pt.crise.com.base_library.base_account.login;

import android.content.Context;
import android.widget.Toast;

public class LoginedState implements UserState{

    @Override
    public void canDoSomething(Context context) {
        Toast.makeText(context, "用户可以做登录后才可以操作的事情", Toast.LENGTH_SHORT).show();
    }
}
