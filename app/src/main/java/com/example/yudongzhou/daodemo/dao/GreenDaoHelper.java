package com.example.yudongzhou.daodemo.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.yudongzhou.database.entity.BodyFatWeighDataRecord;
import com.example.yudongzhou.database.entity.BodyFatWeighDayData;
import com.example.yudongzhou.database.entity.BodyFatWeighMonthData;
import com.example.yudongzhou.database.entity.BodyFatWeighWeekData;
import com.example.yudongzhou.database.entity.BodyFatWeighYearData;
import com.example.yudongzhou.database.entity.HamnatodynamometerDataRecord;
import com.example.yudongzhou.database.entity.SmartDeviceInfo;
import com.example.yudongzhou.database.entity.SmartDeviceOwner;
import com.example.yudongzhou.database.entity.SportDataRecord;
import com.example.yudongzhou.database.entity.SportDayData;
import com.example.yudongzhou.database.entity.SportMonthData;
import com.example.yudongzhou.database.entity.SportWeekData;
import com.example.yudongzhou.database.entity.SportYearData;

import org.greenrobot.greendao.AbstractDao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import freemarker.template.utility.NullArgumentException;

public class GreenDaoHelper<K> implements IDbOperator<K> {
    private static String DB_NAME = "demo_db";
    private static DaoMaster.OpenHelper mHelper;
    private static SQLiteDatabase mDb;
    private static DaoMaster mDaoMaster;
    private static DaoSession mDaoSession;
    private AbstractDao mDao;
    private static ExecutorService mExecutorService = Executors.newSingleThreadExecutor();
    private static Map<Class,AbstractDao> daoCache = new HashMap<>();

    public GreenDaoHelper(Class<K> daoBeanClass) {
        initDao(daoBeanClass);
    }

    /**
     * 设置greenDao
     */
    public static void initDatabase(Context mContext) {
        //mHelper = new DaoMaster.DevOpenHelper(mContext, "biu_db", null);
        mHelper = new BaseSqliteOpenHelper(mContext,DB_NAME,null);
        mDb = mHelper.getWritableDatabase();
        mDaoMaster = new DaoMaster(mDb);
        mDaoSession = mDaoMaster.newSession();
        initDaoCache();
    }

    public static void initDaoCache()
    {
        daoCache.put(SmartDeviceOwner.class,mDaoSession.getSmartDeviceInfoDao());
        daoCache.put(SmartDeviceInfo.class,mDaoSession.getSmartDeviceInfoDao());
        daoCache.put(BodyFatWeighDataRecord.class,mDaoSession.getBodyFatWeighDataRecordDao());
        daoCache.put(BodyFatWeighDayData.class,mDaoSession.getBodyFatWeighDayDataDao());
        daoCache.put(BodyFatWeighWeekData.class,mDaoSession.getBodyFatWeighDayDataDao());
        daoCache.put(BodyFatWeighMonthData.class,mDaoSession.getBodyFatWeighMonthDataDao());
        daoCache.put(BodyFatWeighYearData.class,mDaoSession.getBodyFatWeighYearDataDao());
        daoCache.put(SportDataRecord.class,mDaoSession.getSportDataRecordDao());
        daoCache.put(SportDayData.class,mDaoSession.getSportDayDataDao());
        daoCache.put(SportWeekData.class,mDaoSession.getSportWeekDataDao());
        daoCache.put(SportMonthData.class,mDaoSession.getSportMonthDataDao());
        daoCache.put(SportYearData.class,mDaoSession.getSportYearDataDao());
        daoCache.put(HamnatodynamometerDataRecord.class,mDaoSession.getHamnatodynamometerDataRecordDao());
    }
    public void initDao(Class<K> daoBeanClass)
    {
        mDao = daoCache.get(daoBeanClass);
    }

    public static DaoSession getDaoSession() {
        return mDaoSession;
    }

    public static SQLiteDatabase getDb() {
        return mDb;
    }

    /**
     * Insert an entity into the table associated with a concrete DAO.
     *
     * @return row ID of newly inserted entity
     */
    @Override
    public void insertOrReplaceAsync(final K bean, final DbOperatorCallback callback) {
        if(mDao == null)
        {
            if(callback != null)
            {
                callback.doFail(new NullArgumentException("dao is null"));
            }else{
                return;
            }
        }
        mExecutorService.submit(new Runnable() {
            @Override
            public void run() {
                try {
                    long rowId = mDao.insertOrReplace(bean);
                    if (callback != null) {
                        callback.doSuccess(rowId);
                    }
                } catch (Exception e) {
                    if (callback != null) {
                        callback.doFail(e);
                    }
                }
            }
        });
    }

    /**
     * Inserts or replaces the given entities in the database using a transaction.
     *
     * @param datas The entities to insert.
     */
    @Override
    public void insertOrReplaceInTxAsync(final List<K> datas, final DbOperatorCallback callback) {
        if(mDao == null)
        {
            if(callback != null)
            {
                callback.doFail(new NullArgumentException("dao is null"));
            }else{
                return;
            }
        }
        mExecutorService.submit(new Runnable() {
            @Override
            public void run() {
                try {
                    mDao.insertOrReplaceInTx(datas);
                    if (callback != null) {
                        callback.doSuccess(null);
                    }
                } catch (Exception e) {
                    if (callback != null) {
                        callback.doFail(e);
                    }
                }
            }
        });
    }

    /** Deletes the given entity from the database. Currently, only single value PK entities are supported. */
    @Override
    public void deleteAsync(final K data, final DbOperatorCallback callback) {
        if(mDao == null)
        {
            if(callback != null)
            {
                callback.doFail(new NullArgumentException("dao is null"));
            }else{
                return;
            }
        }
        mExecutorService.submit(new Runnable() {
            @Override
            public void run() {
                try {
                    mDao.delete(data);
                    if (callback != null) {
                        callback.doSuccess(null);
                    }
                } catch (Exception e) {
                    if (callback != null) {
                        callback.doFail(e);
                    }
                }
            }
        });

    }

    /**
     * Deletes the given entities in the database using a transaction.
     *
     * @param datas The entities to delete.
     */
    @Override
    public void deleteInTxAsync(final List<K> datas, final DbOperatorCallback callback) {
        if(mDao == null)
        {
            if(callback != null)
            {
                callback.doFail(new NullArgumentException("dao is null"));
            }else{
                return;
            }
        }
        mExecutorService.submit(new Runnable() {
            @Override
            public void run() {
                try {
                    mDao.deleteInTx(datas);
                    if (callback != null) {
                        callback.doSuccess(null);
                    }
                } catch (Exception e) {
                    callback.doFail(e);
                }
            }
        });
    }

    @Override
    public void deleteAllAsync(final DbOperatorCallback callback) {
        if(mDao == null)
        {
            if(callback != null)
            {
                callback.doFail(new NullArgumentException("dao is null"));
            }else{
                return;
            }
        }
        mExecutorService.submit(new Runnable() {
            @Override
            public void run() {
                try {
                    mDao.deleteAll();
                    if (callback != null) {
                        callback.doSuccess(null);
                    }
                } catch (Exception e) {
                    callback.doFail(e);
                }
            }
        });
    }

    /**
     *
     * @param callback
     * @param where
     * @param selectionArg
     *
     */
    @Override
    public void queryRawAsync(final DbOperatorCallback callback, final String where, final String... selectionArg) {
        if(mDao == null)
        {
            if(callback != null)
            {
                callback.doFail(new NullArgumentException("dao is null"));
            }else{
                return;
            }
        }
        mExecutorService.submit(new Runnable() {
            @Override
            public void run() {
                try {
                    List<K> list = mDao.queryRaw(where, selectionArg);
                    if (callback != null) {
                        callback.doSuccess(list);
                    }
                } catch (Exception e) {
                    callback.doFail(e);
                }
            }
        });
    }

    /**
     * Insert an entity into the table associated with a concrete DAO.
     *
     * @return row ID of newly inserted entity
     */
    @Override
    public void insertOrReplace(K data, DbOperatorCallback callback) {
        if(mDao == null)
        {
            if(callback != null)
            {
                callback.doFail(new NullArgumentException("dao is null"));
            }else{
                return;
            }
        }
        try {
            long rowId = mDao.insertOrReplace(data);
            if (callback != null) {
                callback.doSuccess(rowId);
            }
        } catch (Exception e) {
            if (callback != null) {
                callback.doFail(e);
            }
        }
    }

    @Override
    public void insertOrReplaceInTx(List<K> datas, DbOperatorCallback callback) {
        if(mDao == null)
        {
            if(callback != null)
            {
                callback.doFail(new NullArgumentException("dao is null"));
            }else{
                return;
            }
        }
        try {
            mDao.insertOrReplaceInTx(datas);
            if (callback != null) {
                callback.doSuccess(null);
            }
        } catch (Exception e) {
            if (callback != null) {
                callback.doFail(e);
            }
        }
    }

    @Override
    public void delete(K data, DbOperatorCallback callback) {
        if(mDao == null)
        {
            if(callback != null)
            {
                callback.doFail(new NullArgumentException("dao is null"));
            }else{
                return;
            }
        }
        try {
            mDao.delete(data);
            if (callback != null) {
                callback.doSuccess(null);
            }
        } catch (Exception e) {
            if (callback != null) {
                callback.doFail(e);
            }
        }
    }

    @Override
    public void deleteInTx(List<K> datas, DbOperatorCallback callback) {
        if(mDao == null)
        {
            if(callback != null)
            {
                callback.doFail(new NullArgumentException("dao is null"));
            }else{
                return;
            }
        }
        try {
            mDao.deleteInTx(datas);
            if (callback != null) {
                callback.doSuccess(null);
            }
        } catch (Exception e) {
            if (callback != null) {
                callback.doFail(e);
            }
        }
    }

    @Override
    public void deleteAll(DbOperatorCallback callback) {
        if(mDao == null)
        {
            if(callback != null)
            {
                callback.doFail(new NullArgumentException("dao is null"));
            }else{
                return;
            }
        }
        try {
            mDao.deleteAll();
            if (callback != null) {
                callback.doSuccess(null);
            }
        } catch (Exception e) {
            if (callback != null) {
                callback.doFail(e);
            }
        }
    }

    @Override
    public void queryRaw(DbOperatorCallback callback, String where, String... selectionArg) {
        if(mDao == null)
        {
            if(callback != null)
            {
                callback.doFail(new NullArgumentException("dao is null"));
            }else{
                return;
            }
        }
        try {
            List<K> list = mDao.queryRaw(where, selectionArg);
            if (callback != null) {
                callback.doSuccess(list);
            }
        } catch (Exception e) {
            callback.doFail(e);
        }
    }
}
