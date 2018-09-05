package cj_pt.crise.com.base_library.base_mvp;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public abstract class BasePresenter<T> {

    protected Reference<T> mViewRef;//View接口类型的弱引用
    public void attachView(T view){
        mViewRef = new WeakReference<T>(view);//建立关联
    }

    protected T getView(){
        return mViewRef.get();
    }

    public boolean isViewAttached(){
        return null != mViewRef && null != mViewRef.get();
    }

    public void detachView(){
        if (null != mViewRef){
            mViewRef.clear();
            mViewRef = null;
        }
    }










}
