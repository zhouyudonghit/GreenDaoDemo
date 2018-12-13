package com.example.yudongzhou.database.syncdata;

import com.example.yudongzhou.daodemo.dao.DaoSession;
import com.example.yudongzhou.daodemo.dao.GreenDaoHelper;
import com.example.yudongzhou.daodemo.dao.IDbOperator;
import com.example.yudongzhou.database.entity.SmartDeviceInfo;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SyncDataService implements ISyncDeviceData{
    private static int THREAD_NUMBER = 1;
    protected DaoSession mDaoSession;
    private IDbOperator<SmartDeviceInfo> mBluetoothDeviceInfoIDbOperator;
    private volatile static boolean isSyncing;
    private volatile static SyncDataService mSingleInstance;
    private ExecutorService mExecutorService;

    private SyncDataService()
    {
        init();
    }

    public void init()
    {
        mDaoSession = GreenDaoHelper.getDaoSession();
        mBluetoothDeviceInfoIDbOperator = new GreenDaoHelper<>(SmartDeviceInfo.class);
        mExecutorService = Executors.newFixedThreadPool(THREAD_NUMBER);
    }

    public static SyncDataService getInstance()
    {
        if(mSingleInstance == null)
        {
            synchronized (SyncDataService.class)
            {
                if(mSingleInstance == null) {
                    mSingleInstance = new SyncDataService();
                }
            }
        }
        return mSingleInstance;
    }

    @Override
    public void syncDeviceInfos(String userId, String gId, SyncDataCallback callback) {
        isSyncing = true;
        mExecutorService.submit(new Runnable() {
            @Override
            public void run() {
                //getDeviceInfosFromNet();
            }
        });
    }

    @Override
    public void getDeviceInfosFromNet(String userId, String gId, SyncDataCallback callback) {

    }

    @Override
    public void getDeviceInfosFromDb(String userId, String gId, SyncDataCallback callback) {

    }

    public void updateDeviceInfosTable(List<SmartDeviceInfo> datas)
    {

    }

    public boolean isSyncing()
    {
        return isSyncing;
    }
}
