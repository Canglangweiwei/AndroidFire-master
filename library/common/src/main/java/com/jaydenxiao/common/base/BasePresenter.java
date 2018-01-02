package com.jaydenxiao.common.base;

import android.content.Context;

import com.jaydenxiao.common.baserx.RxManager;

/**
 * des:基类presenter
 * Created by xsf
 * on 2016.07.11:55
 */
@SuppressWarnings("ALL")
public abstract class BasePresenter<T, E> {

    public Context mContext;
    public E mBasePresenterModel;
    public T mBasePresenterRootView;
    public RxManager mRxManage = new RxManager();

    public void setVM(T v, E m) {
        this.mBasePresenterRootView = v;
        this.mBasePresenterModel = m;
        this.onStart();
    }

    public void onStart() {

    }

    public void onDestroy() {
        mRxManage.clear();
    }
}
