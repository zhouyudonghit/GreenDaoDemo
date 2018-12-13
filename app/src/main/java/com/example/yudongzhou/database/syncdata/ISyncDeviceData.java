package com.example.yudongzhou.database.syncdata;

public interface ISyncDeviceData {
    void syncDeviceInfos(String userId,String gId,SyncDataCallback callback);
    void getDeviceInfosFromNet(String userId,String gId,SyncDataCallback callback);
    void getDeviceInfosFromDb(String userId,String gId,SyncDataCallback callback);

    interface SyncDataCallback
    {
        void doSuccess(Object result);
        void doFail(Exception e,String desc);
    }
}
