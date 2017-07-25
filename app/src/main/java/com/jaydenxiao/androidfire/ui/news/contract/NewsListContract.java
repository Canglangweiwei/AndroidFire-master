package com.jaydenxiao.androidfire.ui.news.contract;

import com.jaydenxiao.androidfire.bean.NewsSummary;
import com.jaydenxiao.common.base.BaseModel;
import com.jaydenxiao.common.base.BasePresenter;
import com.jaydenxiao.common.base.BaseView;

import java.util.List;

import rx.Observable;

/**
 * des:新闻列表contract
 * Created by xsf
 * on 2016.09.14:38
 */
@SuppressWarnings("ALL")
public interface NewsListContract {

    interface Model extends BaseModel {
        /**
         * 请求获取新闻
         *
         * @param type
         * @param id
         * @param startPage
         * @return
         */
        Observable<List<NewsSummary>> getNewsListData(String type, final String id, int startPage);
    }

    interface View extends BaseView {
        /**
         * 返回获取的新闻
         *
         * @param newsSummaries
         */
        void returnNewsListData(List<NewsSummary> newsSummaries);

        /**
         * 返回顶部
         */
        void scrolltoTop();
    }

    abstract class Presenter extends BasePresenter<View, Model> {
        /**
         * 发起获取新闻请求
         *
         * @param type
         * @param id
         * @param startPage
         */
        public abstract void getNewsListDataRequest(String type, final String id, int startPage);
    }
}
