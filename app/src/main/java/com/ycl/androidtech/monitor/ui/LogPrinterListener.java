package com.ycl.androidtech.monitor.ui;

/**
 * Created by yuchengluo on 2016/4/1.
 */
public interface LogPrinterListener {
    void onStartLoop();
    void onEndLoop(long starttime,long endtime,String loginfo,int level); //一次监听结束，level级别
}
