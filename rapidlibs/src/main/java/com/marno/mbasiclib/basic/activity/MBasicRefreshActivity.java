package com.marno.mbasiclib.basic.activity;


import com.marno.mbasiclib.widgets.xrecyclerview.XRecyclerView;

/**
 * Created by 李刚 on 2016/6/6/15:55.
 * 支持列表刷新不支持滑动返回
 */
public abstract class MBasicRefreshActivity extends MBasicActivity
        implements XRecyclerView.LoadingListener {

    protected boolean mIsRefresh;


}
