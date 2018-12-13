package com.example.yudongzhou.database;

import android.app.Application;

import com.example.yudongzhou.daodemo.dao.GreenDaoHelper;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        GreenDaoHelper.initDatabase(getApplicationContext());
    }
}
