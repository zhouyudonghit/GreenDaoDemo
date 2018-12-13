package com.example.yudongzhou.daodemo.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.example.yudongzhou.database.entity.BodyFatWeighWeekData;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "BODY_FAT_WEIGH_WEEK_DATA".
*/
public class BodyFatWeighWeekDataDao extends AbstractDao<BodyFatWeighWeekData, Long> {

    public static final String TABLENAME = "BODY_FAT_WEIGH_WEEK_DATA";

    /**
     * Properties of entity BodyFatWeighWeekData.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, long.class, "id", true, "_id");
        public final static Property UuId = new Property(1, String.class, "uuId", false, "UU_ID");
        public final static Property BeginTime = new Property(2, String.class, "beginTime", false, "BEGIN_TIME");
        public final static Property EndTime = new Property(3, String.class, "endTime", false, "END_TIME");
        public final static Property UserId = new Property(4, String.class, "userId", false, "USER_ID");
        public final static Property OwnerId = new Property(5, String.class, "ownerId", false, "OWNER_ID");
        public final static Property DeviceId = new Property(6, String.class, "deviceId", false, "DEVICE_ID");
        public final static Property Exp1 = new Property(7, String.class, "exp1", false, "EXP1");
        public final static Property Exp2 = new Property(8, String.class, "exp2", false, "EXP2");
        public final static Property Data1 = new Property(9, String.class, "data1", false, "DATA1");
        public final static Property Data2 = new Property(10, String.class, "data2", false, "DATA2");
        public final static Property Data3 = new Property(11, String.class, "data3", false, "DATA3");
        public final static Property Data4 = new Property(12, String.class, "data4", false, "DATA4");
        public final static Property Data5 = new Property(13, String.class, "data5", false, "DATA5");
        public final static Property Data6 = new Property(14, String.class, "data6", false, "DATA6");
        public final static Property Data7 = new Property(15, String.class, "data7", false, "DATA7");
        public final static Property Data8 = new Property(16, String.class, "data8", false, "DATA8");
        public final static Property Data9 = new Property(17, String.class, "data9", false, "DATA9");
        public final static Property Data10 = new Property(18, String.class, "data10", false, "DATA10");
    }


    public BodyFatWeighWeekDataDao(DaoConfig config) {
        super(config);
    }
    
    public BodyFatWeighWeekDataDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"BODY_FAT_WEIGH_WEEK_DATA\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL ," + // 0: id
                "\"UU_ID\" TEXT," + // 1: uuId
                "\"BEGIN_TIME\" TEXT," + // 2: beginTime
                "\"END_TIME\" TEXT," + // 3: endTime
                "\"USER_ID\" TEXT," + // 4: userId
                "\"OWNER_ID\" TEXT," + // 5: ownerId
                "\"DEVICE_ID\" TEXT," + // 6: deviceId
                "\"EXP1\" TEXT," + // 7: exp1
                "\"EXP2\" TEXT," + // 8: exp2
                "\"DATA1\" TEXT," + // 9: data1
                "\"DATA2\" TEXT," + // 10: data2
                "\"DATA3\" TEXT," + // 11: data3
                "\"DATA4\" TEXT," + // 12: data4
                "\"DATA5\" TEXT," + // 13: data5
                "\"DATA6\" TEXT," + // 14: data6
                "\"DATA7\" TEXT," + // 15: data7
                "\"DATA8\" TEXT," + // 16: data8
                "\"DATA9\" TEXT," + // 17: data9
                "\"DATA10\" TEXT);"); // 18: data10
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"BODY_FAT_WEIGH_WEEK_DATA\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, BodyFatWeighWeekData entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getId());
 
        String uuId = entity.getUuId();
        if (uuId != null) {
            stmt.bindString(2, uuId);
        }
 
        String beginTime = entity.getBeginTime();
        if (beginTime != null) {
            stmt.bindString(3, beginTime);
        }
 
        String endTime = entity.getEndTime();
        if (endTime != null) {
            stmt.bindString(4, endTime);
        }
 
        String userId = entity.getUserId();
        if (userId != null) {
            stmt.bindString(5, userId);
        }
 
        String ownerId = entity.getOwnerId();
        if (ownerId != null) {
            stmt.bindString(6, ownerId);
        }
 
        String deviceId = entity.getDeviceId();
        if (deviceId != null) {
            stmt.bindString(7, deviceId);
        }
 
        String exp1 = entity.getExp1();
        if (exp1 != null) {
            stmt.bindString(8, exp1);
        }
 
        String exp2 = entity.getExp2();
        if (exp2 != null) {
            stmt.bindString(9, exp2);
        }
 
        String data1 = entity.getData1();
        if (data1 != null) {
            stmt.bindString(10, data1);
        }
 
        String data2 = entity.getData2();
        if (data2 != null) {
            stmt.bindString(11, data2);
        }
 
        String data3 = entity.getData3();
        if (data3 != null) {
            stmt.bindString(12, data3);
        }
 
        String data4 = entity.getData4();
        if (data4 != null) {
            stmt.bindString(13, data4);
        }
 
        String data5 = entity.getData5();
        if (data5 != null) {
            stmt.bindString(14, data5);
        }
 
        String data6 = entity.getData6();
        if (data6 != null) {
            stmt.bindString(15, data6);
        }
 
        String data7 = entity.getData7();
        if (data7 != null) {
            stmt.bindString(16, data7);
        }
 
        String data8 = entity.getData8();
        if (data8 != null) {
            stmt.bindString(17, data8);
        }
 
        String data9 = entity.getData9();
        if (data9 != null) {
            stmt.bindString(18, data9);
        }
 
        String data10 = entity.getData10();
        if (data10 != null) {
            stmt.bindString(19, data10);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, BodyFatWeighWeekData entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getId());
 
        String uuId = entity.getUuId();
        if (uuId != null) {
            stmt.bindString(2, uuId);
        }
 
        String beginTime = entity.getBeginTime();
        if (beginTime != null) {
            stmt.bindString(3, beginTime);
        }
 
        String endTime = entity.getEndTime();
        if (endTime != null) {
            stmt.bindString(4, endTime);
        }
 
        String userId = entity.getUserId();
        if (userId != null) {
            stmt.bindString(5, userId);
        }
 
        String ownerId = entity.getOwnerId();
        if (ownerId != null) {
            stmt.bindString(6, ownerId);
        }
 
        String deviceId = entity.getDeviceId();
        if (deviceId != null) {
            stmt.bindString(7, deviceId);
        }
 
        String exp1 = entity.getExp1();
        if (exp1 != null) {
            stmt.bindString(8, exp1);
        }
 
        String exp2 = entity.getExp2();
        if (exp2 != null) {
            stmt.bindString(9, exp2);
        }
 
        String data1 = entity.getData1();
        if (data1 != null) {
            stmt.bindString(10, data1);
        }
 
        String data2 = entity.getData2();
        if (data2 != null) {
            stmt.bindString(11, data2);
        }
 
        String data3 = entity.getData3();
        if (data3 != null) {
            stmt.bindString(12, data3);
        }
 
        String data4 = entity.getData4();
        if (data4 != null) {
            stmt.bindString(13, data4);
        }
 
        String data5 = entity.getData5();
        if (data5 != null) {
            stmt.bindString(14, data5);
        }
 
        String data6 = entity.getData6();
        if (data6 != null) {
            stmt.bindString(15, data6);
        }
 
        String data7 = entity.getData7();
        if (data7 != null) {
            stmt.bindString(16, data7);
        }
 
        String data8 = entity.getData8();
        if (data8 != null) {
            stmt.bindString(17, data8);
        }
 
        String data9 = entity.getData9();
        if (data9 != null) {
            stmt.bindString(18, data9);
        }
 
        String data10 = entity.getData10();
        if (data10 != null) {
            stmt.bindString(19, data10);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.getLong(offset + 0);
    }    

    @Override
    public BodyFatWeighWeekData readEntity(Cursor cursor, int offset) {
        BodyFatWeighWeekData entity = new BodyFatWeighWeekData( //
            cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // uuId
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // beginTime
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // endTime
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // userId
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // ownerId
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // deviceId
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // exp1
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // exp2
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // data1
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // data2
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // data3
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // data4
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // data5
            cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14), // data6
            cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15), // data7
            cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16), // data8
            cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17), // data9
            cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18) // data10
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, BodyFatWeighWeekData entity, int offset) {
        entity.setId(cursor.getLong(offset + 0));
        entity.setUuId(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setBeginTime(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setEndTime(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setUserId(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setOwnerId(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setDeviceId(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setExp1(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setExp2(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setData1(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setData2(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setData3(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setData4(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setData5(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setData6(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
        entity.setData7(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
        entity.setData8(cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16));
        entity.setData9(cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17));
        entity.setData10(cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(BodyFatWeighWeekData entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(BodyFatWeighWeekData entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(BodyFatWeighWeekData entity) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
