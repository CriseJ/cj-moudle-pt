package cj_pt.crise.com.base_library.base_application;

import android.app.Application;
import android.content.Context;

import com.alibaba.android.arouter.launcher.ARouter;

import cj_pt.crise.com.base_library.utils.UIUtils;

public class BaseApplication extends Application {

    private static BaseApplication applicationInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        applicationInstance = this;
        initRouter(this);
    }

    public static Context getApplicationInstance(){
        return applicationInstance;
    }

    private void initRouter(BaseApplication baseApplication){
        // 这两行必须写在init之前，否则这些配置在init过程中将无效
        if (UIUtils.isApkInDebug(applicationInstance)){
            //打印日志
            ARouter.openLog();
            //开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！
            //线上版本需要关闭,否则有安全风险)
//            ARouter.openDebug();
        }

        // 尽可能早，推荐在Application中初始化
        ARouter.init(baseApplication);
    }

}
