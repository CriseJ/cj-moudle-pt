package cj_pt.crise.com.base_library.base_mvp;

public interface IBaseModel<T> {
    void save(T t);
    void loadDataFromCache(CachDataListener<T> listener);
}
