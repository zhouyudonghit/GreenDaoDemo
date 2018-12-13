package com.example.yudongzhou.daodemo.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.example.yudongzhou.database.entity.Son;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "SON".
*/
public class SonDao extends AbstractDao<Son, Long> {

    public static final String TABLENAME = "SON";

    /**
     * Properties of entity Son.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Value = new Property(1, float.class, "value", false, "VALUE");
        public final static Property Value2 = new Property(2, float.class, "value2", false, "VALUE2");
        public final static Property Value3 = new Property(3, float.class, "value3", false, "VALUE3");
        public final static Property Test1 = new Property(4, String.class, "test1", false, "TEST1");
        public final static Property Test2 = new Property(5, String.class, "test2", false, "TEST2");
        public final static Property Test3 = new Property(6, String.class, "test3", false, "TEST3");
    }


    public SonDao(DaoConfig config) {
        super(config);
    }
    
    public SonDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"SON\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"VALUE\" REAL NOT NULL ," + // 1: value
                "\"VALUE2\" REAL NOT NULL ," + // 2: value2
                "\"VALUE3\" REAL NOT NULL ," + // 3: value3
                "\"TEST1\" TEXT," + // 4: test1
                "\"TEST2\" TEXT," + // 5: test2
                "\"TEST3\" TEXT NOT NULL UNIQUE );"); // 6: test3
        // Add Indexes
        db.execSQL("CREATE UNIQUE INDEX " + constraint + "IDX_SON_TEST1_DESC_TEST2_DESC ON \"SON\"" +
                " (\"TEST1\" DESC,\"TEST2\" DESC);");
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"SON\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Son entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindDouble(2, entity.getValue());
        stmt.bindDouble(3, entity.getValue2());
        stmt.bindDouble(4, entity.getValue3());
 
        String test1 = entity.getTest1();
        if (test1 != null) {
            stmt.bindString(5, test1);
        }
 
        String test2 = entity.getTest2();
        if (test2 != null) {
            stmt.bindString(6, test2);
        }
        stmt.bindString(7, entity.getTest3());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Son entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindDouble(2, entity.getValue());
        stmt.bindDouble(3, entity.getValue2());
        stmt.bindDouble(4, entity.getValue3());
 
        String test1 = entity.getTest1();
        if (test1 != null) {
            stmt.bindString(5, test1);
        }
 
        String test2 = entity.getTest2();
        if (test2 != null) {
            stmt.bindString(6, test2);
        }
        stmt.bindString(7, entity.getTest3());
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Son readEntity(Cursor cursor, int offset) {
        Son entity = new Son( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getFloat(offset + 1), // value
            cursor.getFloat(offset + 2), // value2
            cursor.getFloat(offset + 3), // value3
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // test1
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // test2
            cursor.getString(offset + 6) // test3
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Son entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setValue(cursor.getFloat(offset + 1));
        entity.setValue2(cursor.getFloat(offset + 2));
        entity.setValue3(cursor.getFloat(offset + 3));
        entity.setTest1(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setTest2(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setTest3(cursor.getString(offset + 6));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Son entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Son entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Son entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
