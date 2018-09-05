package cj_pt.crise.com.login_regist_moudle.model;

import java.util.ArrayList;
import java.util.List;

import cj_pt.crise.com.base_library.base_mvp.CachDataListener;
import cj_pt.crise.com.base_library.base_mvp.IBaseModel;
import cj_pt.crise.com.login_regist_moudle.entry.Splash;

public class SplashModelImpl implements IBaseModel<List<Splash>> {

    @Override
    public void save(List<Splash> splashes) {
        //将splashes集合保存到数据库中
    }

    @Override
    public void loadDataFromCache(CachDataListener<List<Splash>> listener) {
        //从数据库查出来的数据
        List<Splash> dataLists = new ArrayList<>();
        Splash splash = new Splash();
        splash.setExemple("案例0");
        dataLists.add(splash);
        listener.onGetComplete(dataLists);
    }
}
