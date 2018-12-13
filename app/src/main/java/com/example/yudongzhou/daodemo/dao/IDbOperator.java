package com.example.yudongzhou.daodemo.dao;

import java.util.List;

public interface IDbOperator<K> {
    void insertOrReplaceAsync(K data, DbOperatorCallback callback);
    void insertOrReplaceInTxAsync(List<K> datas, DbOperatorCallback callback);
    void deleteAsync(K data, DbOperatorCallback callback);
    void deleteInTxAsync(List<K> datas, DbOperatorCallback callback);
    void deleteAllAsync(DbOperatorCallback callback);
    void queryRawAsync(DbOperatorCallback callback, String where, String... selectionArg);

    void insertOrReplace(K data, DbOperatorCallback callback);
    void insertOrReplaceInTx(List<K> datas, DbOperatorCallback callback);
    void delete(K data, DbOperatorCallback callback);
    void deleteInTx(List<K> datas, DbOperatorCallback callback);
    void deleteAll(DbOperatorCallback callback);
    void queryRaw(DbOperatorCallback callback, String where, String... selectionArg);

    interface DbOperatorCallback
    {
        void doSuccess(Object result);
        void doFail(Exception e);
    }
}
