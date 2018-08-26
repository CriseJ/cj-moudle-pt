package cj_pt.crise.com.base_library.utils;

import android.support.v4.app.Fragment;

import com.alibaba.android.arouter.launcher.ARouter;

public class FragmentUtils {

    public static Fragment getOneFragment(){
        Fragment fragment = (Fragment) ARouter.getInstance().build(RouteUtils.one_fragment).navigation();
        return fragment;
    }

    public static Fragment getTwoFragment(){
        Fragment fragment = (Fragment) ARouter.getInstance().build(RouteUtils.two_fragment).navigation();
        return fragment;
    }

    public static Fragment getThreeFragment(){
        Fragment fragment = (Fragment) ARouter.getInstance().build(RouteUtils.three_fragment).navigation();
        return fragment;
    }

    public static Fragment getFourFragment(){
        Fragment fragment = (Fragment) ARouter.getInstance().build(RouteUtils.four_fragment).navigation();
        return fragment;
    }







}
