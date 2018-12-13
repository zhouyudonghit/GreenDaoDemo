package com.example.yudongzhou.daodemo.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import org.greenrobot.greendao.database.Database;

public class BaseSqliteOpenHelper extends DaoMaster.OpenHelper {
    private String TAG = getClass().getSimpleName();
    public BaseSqliteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory) {
        super(context, name, factory);
    }

    @Override
    public void onUpgrade(Database db, int oldVersion, int newVersion) {
        super.onUpgrade(db, oldVersion, newVersion);
        Log.d(TAG,"onupgrade,oldVersion = "+oldVersion+",newVersion = "+newVersion);
        switch (newVersion)
        {
            case 4:
                //just for test
                //String sql = "alter table "+SonDao.TABLENAME +" rename "+ SonDao.Properties.Test1.columnName +" to "+"Test3";
                //renameTable(db);
                modifyColumn(db);
                break;
            default:
        }
    }

    public void renameColumnTest(Database db)
    {
        //执行下面的语句会抛异常
        String sql = "alter table son rename TEST2 to test3";
        Log.d(TAG,"sql = "+sql);
        db.execSQL(sql);
    }

    public void dropColumnTest(Database db)
    {
        //报异常android.database.sqlite.SQLiteException: near "drop": syntax error (code 1): , while compiling: alter table son drop TEST2
        String sql = "alter table son drop TEST2";
        Log.d(TAG,"sql = "+sql);
        db.execSQL(sql);
    }

    public void renameTable(Database db)
    {
        //可以正常执行，没有问题
        String sql = "alter table son rename to son_new";
        Log.d(TAG,"sql = "+sql);
        db.execSQL(sql);
    }

    public void addOneColumn(Database db)
    {
        //可以正常执行，没有问题,经过测试这样添加的列可以用DAO对象正常插入
        String sql = "alter table son add column TEST3 TEXT";
        Log.d(TAG,"sql = "+sql);


        db.execSQL(sql);
    }

    public void modifyColumn(Database db)
    {
        //1,将表名修改为临时表名
        //2、创建一张新表
        //3、将临时表的数据拷贝到新表中

        //String sql1 = "alter table son rename to son_new";
        String sql2 = "CREATE TABLE " + "\"SON2\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"VALUE\" REAL NOT NULL ," + // 1: value
                "\"VALUE2\" REAL NOT NULL ," + // 2: value2
                "\"VALUE3\" REAL NOT NULL ," + // 3: value3
                "\"TEST1\" TEXT," + // 4: test1
                "\"TEST2\" TEXT," + // 5: test2
                "\"TEST3232\" TEXT)";
        String sql3 = "insert into son2 select * from son";
        String sql4 = "CREATE UNIQUE INDEX " + "IDX_SON2_TEST1_DESC_TEST2_DESC ON \"SON2\"" +
                " (\"TEST1\" DESC,\"TEST2\" DESC)";
        String sql5 = "drop table if exists son";

        db.execSQL(sql2);
        db.execSQL(sql3);
        db.execSQL(sql4);
        db.execSQL(sql5);
    }
}
