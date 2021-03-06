package com.example.yudongzhou.daodemo.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.example.yudongzhou.database.entity.SportDataRecord;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "SPORT_DATA_RECORD".
*/
public class SportDataRecordDao extends AbstractDao<SportDataRecord, String> {

    public static final String TABLENAME = "SPORT_DATA_RECORD";

    /**
     * Properties of entity SportDataRecord.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Uuid = new Property(0, String.class, "uuid", true, "UUID");
        public final static Property DeviceId = new Property(1, String.class, "deviceId", false, "DEVICE_ID");
        public final static Property ModleId = new Property(2, String.class, "modleId", false, "MODLE_ID");
        public final static Property UserId = new Property(3, String.class, "userId", false, "USER_ID");
        public final static Property OwnerId = new Property(4, String.class, "ownerId", false, "OWNER_ID");
        public final static Property ReportTime = new Property(5, String.class, "reportTime", false, "REPORT_TIME");
        public final static Property ReportStatus = new Property(6, int.class, "reportStatus", false, "REPORT_STATUS");
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


    public SportDataRecordDao(DaoConfig config) {
        super(config);
    }
    
    public SportDataRecordDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"SPORT_DATA_RECORD\" (" + //
                "\"UUID\" TEXT PRIMARY KEY NOT NULL ," + // 0: uuid
                "\"DEVICE_ID\" TEXT," + // 1: deviceId
                "\"MODLE_ID\" TEXT," + // 2: modleId
                "\"USER_ID\" TEXT," + // 3: userId
                "\"OWNER_ID\" TEXT," + // 4: ownerId
                "\"REPORT_TIME\" TEXT," + // 5: reportTime
                "\"REPORT_STATUS\" INTEGER NOT NULL ," + // 6: reportStatus
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
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"SPORT_DATA_RECORD\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, SportDataRecord entity) {
        stmt.clearBindings();
 
        String uuid = entity.getUuid();
        if (uuid != null) {
            stmt.bindString(1, uuid);
        }
 
        String deviceId = entity.getDeviceId();
        if (deviceId != null) {
            stmt.bindString(2, deviceId);
        }
 
        String modleId = entity.getModleId();
        if (modleId != null) {
            stmt.bindString(3, modleId);
        }
 
        String userId = entity.getUserId();
        if (userId != null) {
            stmt.bindString(4, userId);
        }
 
        String ownerId = entity.getOwnerId();
        if (ownerId != null) {
            stmt.bindString(5, ownerId);
        }
 
        String reportTime = entity.getReportTime();
        if (reportTime != null) {
            stmt.bindString(6, reportTime);
        }
        stmt.bindLong(7, entity.getReportStatus());
 
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
    protected final void bindValues(SQLiteStatement stmt, SportDataRecord entity) {
        stmt.clearBindings();
 
        String uuid = entity.getUuid();
        if (uuid != null) {
            stmt.bindString(1, uuid);
        }
 
        String deviceId = entity.getDeviceId();
        if (deviceId != null) {
            stmt.bindString(2, deviceId);
        }
 
        String modleId = entity.getModleId();
        if (modleId != null) {
            stmt.bindString(3, modleId);
        }
 
        String userId = entity.getUserId();
        if (userId != null) {
            stmt.bindString(4, userId);
        }
 
        String ownerId = entity.getOwnerId();
        if (ownerId != null) {
            stmt.bindString(5, ownerId);
        }
 
        String reportTime = entity.getReportTime();
        if (reportTime != null) {
            stmt.bindString(6, reportTime);
        }
        stmt.bindLong(7, entity.getReportStatus());
 
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
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0);
    }    

    @Override
    public SportDataRecord readEntity(Cursor cursor, int offset) {
        SportDataRecord entity = new SportDataRecord( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // uuid
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // deviceId
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // modleId
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // userId
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // ownerId
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // reportTime
            cursor.getInt(offset + 6), // reportStatus
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
    public void readEntity(Cursor cursor, SportDataRecord entity, int offset) {
        entity.setUuid(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setDeviceId(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setModleId(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setUserId(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setOwnerId(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setReportTime(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setReportStatus(cursor.getInt(offset + 6));
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
    protected final String updateKeyAfterInsert(SportDataRecord entity, long rowId) {
        return entity.getUuid();
    }
    
    @Override
    public String getKey(SportDataRecord entity) {
        if(entity != null) {
            return entity.getUuid();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(SportDataRecord entity) {
        return entity.getUuid() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
