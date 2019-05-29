package com.example.dome2;

import android.app.Application;

import com.example.dome2.dao.DaoMaster;
import com.example.dome2.dao.DaoSession;

public class MyApplication extends Application {

    private static DaoSession mDaoSession;

    @Override
    public void onCreate() {
        super.onCreate();
        initData();
    }

    private void initData() {
        DaoMaster.DevOpenHelper devOpenHelper = new DaoMaster.DevOpenHelper(this, "aa.db");
        mDaoSession = new DaoMaster(devOpenHelper.getWritableDatabase()).newSession();
    }

    public static DaoSession getmDaoSession() {
        return mDaoSession;
    }
}
