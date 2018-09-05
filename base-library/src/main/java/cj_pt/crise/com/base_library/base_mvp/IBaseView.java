package cj_pt.crise.com.base_library.base_mvp;

public interface IBaseView {
    //显示请求成功
    void showSuccess();
    //null 显示
    void showEmpty();
    //检测当前网络是否可用
    boolean checkNet();
    //失败重试
    void showFaild();
    //显示当前网络不可用
    void showNoNet();
}
