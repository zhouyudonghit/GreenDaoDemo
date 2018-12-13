package com.example.yudongzhou.daodemo.dao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

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
import com.example.yudongzhou.database.entity.Son;
import com.example.yudongzhou.database.entity.BaseBean;

import com.example.yudongzhou.daodemo.dao.BodyFatWeighDataRecordDao;
import com.example.yudongzhou.daodemo.dao.BodyFatWeighDayDataDao;
import com.example.yudongzhou.daodemo.dao.BodyFatWeighMonthDataDao;
import com.example.yudongzhou.daodemo.dao.BodyFatWeighWeekDataDao;
import com.example.yudongzhou.daodemo.dao.BodyFatWeighYearDataDao;
import com.example.yudongzhou.daodemo.dao.HamnatodynamometerDataRecordDao;
import com.example.yudongzhou.daodemo.dao.SmartDeviceInfoDao;
import com.example.yudongzhou.daodemo.dao.SmartDeviceOwnerDao;
import com.example.yudongzhou.daodemo.dao.SportDataRecordDao;
import com.example.yudongzhou.daodemo.dao.SportDayDataDao;
import com.example.yudongzhou.daodemo.dao.SportMonthDataDao;
import com.example.yudongzhou.daodemo.dao.SportWeekDataDao;
import com.example.yudongzhou.daodemo.dao.SportYearDataDao;
import com.example.yudongzhou.daodemo.dao.SonDao;
import com.example.yudongzhou.daodemo.dao.BaseBeanDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig bodyFatWeighDataRecordDaoConfig;
    private final DaoConfig bodyFatWeighDayDataDaoConfig;
    private final DaoConfig bodyFatWeighMonthDataDaoConfig;
    private final DaoConfig bodyFatWeighWeekDataDaoConfig;
    private final DaoConfig bodyFatWeighYearDataDaoConfig;
    private final DaoConfig hamnatodynamometerDataRecordDaoConfig;
    private final DaoConfig smartDeviceInfoDaoConfig;
    private final DaoConfig smartDeviceOwnerDaoConfig;
    private final DaoConfig sportDataRecordDaoConfig;
    private final DaoConfig sportDayDataDaoConfig;
    private final DaoConfig sportMonthDataDaoConfig;
    private final DaoConfig sportWeekDataDaoConfig;
    private final DaoConfig sportYearDataDaoConfig;
    private final DaoConfig sonDaoConfig;
    private final DaoConfig baseBeanDaoConfig;

    private final BodyFatWeighDataRecordDao bodyFatWeighDataRecordDao;
    private final BodyFatWeighDayDataDao bodyFatWeighDayDataDao;
    private final BodyFatWeighMonthDataDao bodyFatWeighMonthDataDao;
    private final BodyFatWeighWeekDataDao bodyFatWeighWeekDataDao;
    private final BodyFatWeighYearDataDao bodyFatWeighYearDataDao;
    private final HamnatodynamometerDataRecordDao hamnatodynamometerDataRecordDao;
    private final SmartDeviceInfoDao smartDeviceInfoDao;
    private final SmartDeviceOwnerDao smartDeviceOwnerDao;
    private final SportDataRecordDao sportDataRecordDao;
    private final SportDayDataDao sportDayDataDao;
    private final SportMonthDataDao sportMonthDataDao;
    private final SportWeekDataDao sportWeekDataDao;
    private final SportYearDataDao sportYearDataDao;
    private final SonDao sonDao;
    private final BaseBeanDao baseBeanDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        bodyFatWeighDataRecordDaoConfig = daoConfigMap.get(BodyFatWeighDataRecordDao.class).clone();
        bodyFatWeighDataRecordDaoConfig.initIdentityScope(type);

        bodyFatWeighDayDataDaoConfig = daoConfigMap.get(BodyFatWeighDayDataDao.class).clone();
        bodyFatWeighDayDataDaoConfig.initIdentityScope(type);

        bodyFatWeighMonthDataDaoConfig = daoConfigMap.get(BodyFatWeighMonthDataDao.class).clone();
        bodyFatWeighMonthDataDaoConfig.initIdentityScope(type);

        bodyFatWeighWeekDataDaoConfig = daoConfigMap.get(BodyFatWeighWeekDataDao.class).clone();
        bodyFatWeighWeekDataDaoConfig.initIdentityScope(type);

        bodyFatWeighYearDataDaoConfig = daoConfigMap.get(BodyFatWeighYearDataDao.class).clone();
        bodyFatWeighYearDataDaoConfig.initIdentityScope(type);

        hamnatodynamometerDataRecordDaoConfig = daoConfigMap.get(HamnatodynamometerDataRecordDao.class).clone();
        hamnatodynamometerDataRecordDaoConfig.initIdentityScope(type);

        smartDeviceInfoDaoConfig = daoConfigMap.get(SmartDeviceInfoDao.class).clone();
        smartDeviceInfoDaoConfig.initIdentityScope(type);

        smartDeviceOwnerDaoConfig = daoConfigMap.get(SmartDeviceOwnerDao.class).clone();
        smartDeviceOwnerDaoConfig.initIdentityScope(type);

        sportDataRecordDaoConfig = daoConfigMap.get(SportDataRecordDao.class).clone();
        sportDataRecordDaoConfig.initIdentityScope(type);

        sportDayDataDaoConfig = daoConfigMap.get(SportDayDataDao.class).clone();
        sportDayDataDaoConfig.initIdentityScope(type);

        sportMonthDataDaoConfig = daoConfigMap.get(SportMonthDataDao.class).clone();
        sportMonthDataDaoConfig.initIdentityScope(type);

        sportWeekDataDaoConfig = daoConfigMap.get(SportWeekDataDao.class).clone();
        sportWeekDataDaoConfig.initIdentityScope(type);

        sportYearDataDaoConfig = daoConfigMap.get(SportYearDataDao.class).clone();
        sportYearDataDaoConfig.initIdentityScope(type);

        sonDaoConfig = daoConfigMap.get(SonDao.class).clone();
        sonDaoConfig.initIdentityScope(type);

        baseBeanDaoConfig = daoConfigMap.get(BaseBeanDao.class).clone();
        baseBeanDaoConfig.initIdentityScope(type);

        bodyFatWeighDataRecordDao = new BodyFatWeighDataRecordDao(bodyFatWeighDataRecordDaoConfig, this);
        bodyFatWeighDayDataDao = new BodyFatWeighDayDataDao(bodyFatWeighDayDataDaoConfig, this);
        bodyFatWeighMonthDataDao = new BodyFatWeighMonthDataDao(bodyFatWeighMonthDataDaoConfig, this);
        bodyFatWeighWeekDataDao = new BodyFatWeighWeekDataDao(bodyFatWeighWeekDataDaoConfig, this);
        bodyFatWeighYearDataDao = new BodyFatWeighYearDataDao(bodyFatWeighYearDataDaoConfig, this);
        hamnatodynamometerDataRecordDao = new HamnatodynamometerDataRecordDao(hamnatodynamometerDataRecordDaoConfig, this);
        smartDeviceInfoDao = new SmartDeviceInfoDao(smartDeviceInfoDaoConfig, this);
        smartDeviceOwnerDao = new SmartDeviceOwnerDao(smartDeviceOwnerDaoConfig, this);
        sportDataRecordDao = new SportDataRecordDao(sportDataRecordDaoConfig, this);
        sportDayDataDao = new SportDayDataDao(sportDayDataDaoConfig, this);
        sportMonthDataDao = new SportMonthDataDao(sportMonthDataDaoConfig, this);
        sportWeekDataDao = new SportWeekDataDao(sportWeekDataDaoConfig, this);
        sportYearDataDao = new SportYearDataDao(sportYearDataDaoConfig, this);
        sonDao = new SonDao(sonDaoConfig, this);
        baseBeanDao = new BaseBeanDao(baseBeanDaoConfig, this);

        registerDao(BodyFatWeighDataRecord.class, bodyFatWeighDataRecordDao);
        registerDao(BodyFatWeighDayData.class, bodyFatWeighDayDataDao);
        registerDao(BodyFatWeighMonthData.class, bodyFatWeighMonthDataDao);
        registerDao(BodyFatWeighWeekData.class, bodyFatWeighWeekDataDao);
        registerDao(BodyFatWeighYearData.class, bodyFatWeighYearDataDao);
        registerDao(HamnatodynamometerDataRecord.class, hamnatodynamometerDataRecordDao);
        registerDao(SmartDeviceInfo.class, smartDeviceInfoDao);
        registerDao(SmartDeviceOwner.class, smartDeviceOwnerDao);
        registerDao(SportDataRecord.class, sportDataRecordDao);
        registerDao(SportDayData.class, sportDayDataDao);
        registerDao(SportMonthData.class, sportMonthDataDao);
        registerDao(SportWeekData.class, sportWeekDataDao);
        registerDao(SportYearData.class, sportYearDataDao);
        registerDao(Son.class, sonDao);
        registerDao(BaseBean.class, baseBeanDao);
    }
    
    public void clear() {
        bodyFatWeighDataRecordDaoConfig.clearIdentityScope();
        bodyFatWeighDayDataDaoConfig.clearIdentityScope();
        bodyFatWeighMonthDataDaoConfig.clearIdentityScope();
        bodyFatWeighWeekDataDaoConfig.clearIdentityScope();
        bodyFatWeighYearDataDaoConfig.clearIdentityScope();
        hamnatodynamometerDataRecordDaoConfig.clearIdentityScope();
        smartDeviceInfoDaoConfig.clearIdentityScope();
        smartDeviceOwnerDaoConfig.clearIdentityScope();
        sportDataRecordDaoConfig.clearIdentityScope();
        sportDayDataDaoConfig.clearIdentityScope();
        sportMonthDataDaoConfig.clearIdentityScope();
        sportWeekDataDaoConfig.clearIdentityScope();
        sportYearDataDaoConfig.clearIdentityScope();
        sonDaoConfig.clearIdentityScope();
        baseBeanDaoConfig.clearIdentityScope();
    }

    public BodyFatWeighDataRecordDao getBodyFatWeighDataRecordDao() {
        return bodyFatWeighDataRecordDao;
    }

    public BodyFatWeighDayDataDao getBodyFatWeighDayDataDao() {
        return bodyFatWeighDayDataDao;
    }

    public BodyFatWeighMonthDataDao getBodyFatWeighMonthDataDao() {
        return bodyFatWeighMonthDataDao;
    }

    public BodyFatWeighWeekDataDao getBodyFatWeighWeekDataDao() {
        return bodyFatWeighWeekDataDao;
    }

    public BodyFatWeighYearDataDao getBodyFatWeighYearDataDao() {
        return bodyFatWeighYearDataDao;
    }

    public HamnatodynamometerDataRecordDao getHamnatodynamometerDataRecordDao() {
        return hamnatodynamometerDataRecordDao;
    }

    public SmartDeviceInfoDao getSmartDeviceInfoDao() {
        return smartDeviceInfoDao;
    }

    public SmartDeviceOwnerDao getSmartDeviceOwnerDao() {
        return smartDeviceOwnerDao;
    }

    public SportDataRecordDao getSportDataRecordDao() {
        return sportDataRecordDao;
    }

    public SportDayDataDao getSportDayDataDao() {
        return sportDayDataDao;
    }

    public SportMonthDataDao getSportMonthDataDao() {
        return sportMonthDataDao;
    }

    public SportWeekDataDao getSportWeekDataDao() {
        return sportWeekDataDao;
    }

    public SportYearDataDao getSportYearDataDao() {
        return sportYearDataDao;
    }

    public SonDao getSonDao() {
        return sonDao;
    }

    public BaseBeanDao getBaseBeanDao() {
        return baseBeanDao;
    }

}
