package com.example.myapplication;

import android.app.Application;
import android.util.Log;

/**
 * @version :V01
 * @File Name：com.example.myapplication.HYApp
 * @Description:
 * @author：123user
 * @date：2016/3/30 15:52
 */
public class HYApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Log.e("==========HYApp========","onCreate");
    }


    @Override
    public void onTerminate() {
        super.onTerminate();
        Log.e("==========HYApp========","onTerminate");
    }
}
