package com.example.yudongzhou.database;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.yudongzhou.daodemo.dao.GreenDaoHelper;
import com.example.yudongzhou.daodemo.dao.IDbOperator;
import com.example.yudongzhou.daodemo.dao.SonDao;
import com.example.yudongzhou.database.entity.BodyFatWeighDataRecord;
import com.example.yudongzhou.database.entity.BodyFatWeighDayData;
import com.example.yudongzhou.database.entity.HamnatodynamometerDataRecord;
import com.example.yudongzhou.database.entity.SmartDeviceInfo;
import com.example.yudongzhou.database.entity.SmartDeviceOwner;
import com.example.yudongzhou.database.entity.Son;
import com.example.yudongzhou.database.entity.SportDataRecord;

import java.io.File;
import java.net.HttpCookie;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private TextView addTV, searchTV, deleteTV, modifyTV, testMaxNumTV, clearTableTV, testSearchTV, testForeignKey, testUpgrade;
    private static int owner_id;
    public static String TAG = "daotest";
    private GreenDaoHelper<SmartDeviceOwner> ownerGreenDaoHelper;
    private GreenDaoHelper<SmartDeviceInfo> deviceInfoGreenDaoHelper;
    private GreenDaoHelper<BodyFatWeighDataRecord> bodyFatWeighGreenDaoHelper;
    private GreenDaoHelper<HamnatodynamometerDataRecord> hamnatodynamometerGreenDaoHelper;
    private GreenDaoHelper<SportDataRecord> phoneGreenDaoHelper;
    private GreenDaoHelper<BodyFatWeighDayData> dayData_bodyFatWeighGreenDaoHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    public void initView() {
        bodyFatWeighGreenDaoHelper = new GreenDaoHelper<>(BodyFatWeighDataRecord.class);
        ownerGreenDaoHelper = new GreenDaoHelper<>(SmartDeviceOwner.class);
        deviceInfoGreenDaoHelper = new GreenDaoHelper<>(SmartDeviceInfo.class);
        hamnatodynamometerGreenDaoHelper = new GreenDaoHelper<>(HamnatodynamometerDataRecord.class);
        phoneGreenDaoHelper = new GreenDaoHelper<>(SportDataRecord.class);
        dayData_bodyFatWeighGreenDaoHelper = new GreenDaoHelper<>(BodyFatWeighDayData.class);
        addTV = findViewById(R.id.add);
        searchTV = findViewById(R.id.search);
        deleteTV = findViewById(R.id.delete);
        modifyTV = findViewById(R.id.modify);
        testMaxNumTV = findViewById(R.id.test_max_num);
        clearTableTV = findViewById(R.id.clear_table);
        testSearchTV = findViewById(R.id.test_search);
        testForeignKey = findViewById(R.id.test_foreignkey);
        testUpgrade = findViewById(R.id.test_upgrade);

        addTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insertData();
            }
        });

        searchTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //List<MstBluetoothOwner> list = GreenDaoHelper.getDaoSession().getMstBluetoothOwnerDao().queryBuilder().where(MstBluetoothOwnerDao.Properties.Owner_id.eq(0)).build().list();
                //Toast.makeText(MainActivity.this,list.get(0).getOwner_id()+","+list.get(0).getDevice_id(),Toast.LENGTH_LONG).show();
//        new Thread(new Runnable() {
//          @Override
//          public void run() {
//            //子线程里面做没有问题
//            List<BluetoothOwner> list = bluetoothOwnerDao.queryBuilder().where(BluetoothOwnerDao.Properties.OwnerId.eq(0)).build().list();
//
//          }
//        }).start();
                //Toast.makeText(MainActivity.this,list.get(0).getOwner_id()+","+list.get(0).getDevice_id(),Toast.LENGTH_LONG).show();
            }
        });

        modifyTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //bluetoothOwnerDao.refresh(new BluetoothOwner(0+"","dsafdsf2","sdfasd","132","","","","",""));
                //bluetoothOwnerDao.queryBuilder().where(MstBluetoothOwnerDao.Properties.Owner_id.eq(0)).build().unique();
                //修改之前先查询，若查询到了，则修改，

            }
        });

        deleteTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //bluetoothOwnerDao.delete(new BluetoothOwner(0+"","dsafdsf2","sdfasd","132","","","","",""));

            }
        });

        testMaxNumTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                testMaxNum();
            }
        });

        clearTableTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearTable();
            }
        });

        testSearchTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                testSearch();
            }
        });

        testForeignKey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //testForeignKey();
            }
        });
    }

    public void testMaxNum() {
        Log.d(TAG, "enter textMaxNum()");
        int i = 0;
        Long beginTime = System.currentTimeMillis();
        try {
            while (i < 100000) {
                BodyFatWeighDataRecord bodyFatWeigh = new BodyFatWeighDataRecord();
                bodyFatWeigh.setUuid(i + "");
                bodyFatWeigh.setReportStatus(0);
                bodyFatWeigh.setData1("werwerwer");
                bodyFatWeigh.setData2("dsfaddsdf");
                bodyFatWeigh.setData3("fdsfadsff");
                bodyFatWeigh.setData4("fdsfadsff");
                bodyFatWeigh.setData5("fdsfadsff");
                bodyFatWeigh.setData6("fdsfadsff");
                bodyFatWeigh.setData7("fdsfadsff");
                bodyFatWeigh.setData8("fdsfadsff");
                bodyFatWeigh.setData9("fdsfadsff");
                bodyFatWeigh.setData10("fdsfadsff");
                bodyFatWeigh.setExp1("fdsfsafsdfsdfsdfsdf");
                bodyFatWeigh.setExp2("fdsfsafsdfsdfsdfsdf");
                bodyFatWeigh.setDeviceId("fdsfdsaf");
                bodyFatWeigh.setModleId("fdsafdsafsfdsafds");
                bodyFatWeigh.setOwnerId("fdsfdsf");
                //bodyFatWeigh.setReportTime("fdsafdsfdsfsdfsdf");
                bodyFatWeigh.setUserId("fdsffsafd");
                //bodyFatWeighDao.insert(bodyFatWeigh);
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(MainActivity.this, e.getLocalizedMessage(), Toast.LENGTH_LONG).show();
        } finally {
            long endTime = System.currentTimeMillis();
            Toast.makeText(this, "insert number = " + i + ",耗时毫秒：" + (endTime - beginTime), Toast.LENGTH_LONG).show();
            Log.d(TAG, "insert number = " + i + ",耗时毫秒：" + (endTime - beginTime));
        }
    }

    public void clearTable() {
        long beginTime = System.nanoTime();
        //bodyFatWeighDao.deleteAll();
        long endTime = System.nanoTime();
        Toast.makeText(this, "清除表数据耗时纳秒：" + (endTime - beginTime), Toast.LENGTH_LONG).show();
        Log.d(TAG, "清除表数据耗时纳秒：" + (endTime - beginTime));
    }

    public void testSearch() {
        Long beginTime = System.nanoTime();
        //MstBluetoothStatusRecord_BodyFatWeigh bodyFatWeigh = bodyFatWeighDao.queryBuilder().where(MstBluetoothStatusRecord_BodyFatWeighDao.Properties.Data8.eq("fdsfadsff")).build().unique();
//    List<MstBluetoothStatusRecord_BodyFatWeigh> bodyFatWeighs = bodyFatWeighDao.queryBuilder().where(MstBluetoothStatusRecord_BodyFatWeighDao.Properties.Data8.eq("fdsfadsff")).build().list();
//    Long endTime = System.nanoTime();
//    List<BluetoothStatusRecord> bodyFatWeighs = bodyFatWeighDao.queryRaw(null,null);
//    bodyFatWeighDao.loadAll();
//    Log.d(TAG,"c查询耗时纳秒："+(endTime-beginTime)+",id = "+bodyFatWeigh.getId());
        //Log.d(TAG,"c查询耗时纳秒："+(endTime-beginTime)+",count = "+bodyFatWeighs.size());
        Son msearch = GreenDaoHelper.getDaoSession().getSonDao().queryBuilder()
                .where(SonDao.Properties.Id.eq(2))
                //.whereOr(SonDao.Properties.Value2.eq(2),SonDao.Properties.Value3.eq(3))
                .build()
                .unique();

        //Log.d(TAG,"msearch.size = "+msearch.size());
        try {
            URI uri = new URI("file://data/data");
            //URI uri2 = new URI("https://www.baidu.com/s?ie=utf-8&f=8&rsv_bp=1&tn=02003390_14_hao_pg&wd=%E5%A6%82%E4%BD%95%E5%88%A4%E6%96%AD%E4%B8%80%E4%B8%AA%E8%B7%AF%E5%BE%84%E6%98%AF%E6%96%87%E4%BB%B6%E8%BF%98%E6%98%AF%E7%BD%91%E7%BB%9C&oq=json&rsv_pq=a9d593c100027fca&rsv_t=83e3FbkfgEPgWYYs2kMHzf05uq18zncfJteD0fm2uRHOHmhHTi1mVwsHsk3CfRFaH2BjATPTE%2Fpt&rqlang=cn&rsv_enter=0&inputT=23004&rsv_sug3=136&rsv_sug1=67&rsv_sug7=100&bs=json");

        } catch (Exception e) {
            e.printStackTrace();
        }
        Uri uri = Uri.parse("https://www.baidu.com/s?ie=utf-8&f=8&rsv_bp=1&tn=02003390_14_hao_pg&wd=%E5%A6%82%E4%BD%95%E5%88%A4%E6%96%AD%E4%B8%80%E4%B8%AA%E8%B7%AF%E5%BE%84%E6%98%AF%E6%96%87%E4%BB%B6%E8%BF%98%E6%98%AF%E7%BD%91%E7%BB%9C&oq=json&rsv_pq=a9d593c100027fca&rsv_t=83e3FbkfgEPgWYYs2kMHzf05uq18zncfJteD0fm2uRHOHmhHTi1mVwsHsk3CfRFaH2BjATPTE%2Fpt&rqlang=cn&rsv_enter=0&inputT=23004&rsv_sug3=136&rsv_sug1=67&rsv_sug7=100&bs=json");
        Log.d(TAG,uri.toString());

        Uri uri1 = Uri.fromFile(new File("data/data/test"));
    }

    public void insertData() {
        DecimalFormat df = new DecimalFormat("#");
        String str = df.format(345678.988);
        float f = Float.valueOf(str);
        Log.d(TAG, f + "");
        SmartDeviceInfo deviceInfo = new SmartDeviceInfo();
        deviceInfo.setDeviceId("1");
        deviceInfo.setBindedTime(new Date());
        deviceInfo.setLastReprotTime(new Date());
        deviceInfo.setOwnerId("1");
        deviceInfoGreenDaoHelper.insertOrReplace(deviceInfo, new IDbOperator.DbOperatorCallback() {
            @Override
            public void doSuccess(Object result) {
                Log.d("zhouyudong", "insert device info suc");
            }

            @Override
            public void doFail(Exception e) {
                e.printStackTrace();
                Log.d("zhouyudong", "insert device info fail");
            }
        });

        SmartDeviceInfo deviceInfo2 = new SmartDeviceInfo();
        deviceInfo2.setDeviceId("2");
        deviceInfo2.setBindedTime(new Date());
        deviceInfo2.setLastReprotTime(new Date());
        deviceInfo2.setOwnerId("1");
        deviceInfoGreenDaoHelper.insertOrReplace(deviceInfo2, new IDbOperator.DbOperatorCallback() {
            @Override
            public void doSuccess(Object result) {
                Log.d("zhouyudong", "insert device info suc");
            }

            @Override
            public void doFail(Exception e) {
                e.printStackTrace();
                Log.d("zhouyudong", "insert device info fail");
            }
        });

        SmartDeviceInfo deviceInfo3 = new SmartDeviceInfo();
        deviceInfo3.setDeviceId("3");
        deviceInfo3.setBindedTime(new Date());
        deviceInfo3.setLastReprotTime(new Date());
        deviceInfo3.setOwnerId("1");
        deviceInfoGreenDaoHelper.insertOrReplace(deviceInfo3, new IDbOperator.DbOperatorCallback() {
            @Override
            public void doSuccess(Object result) {
                Log.d("zhouyudong", "insert device info suc");
            }

            @Override
            public void doFail(Exception e) {
                e.printStackTrace();
                Log.d("zhouyudong", "insert device info fail");
            }
        });

        SmartDeviceInfo deviceInfo4 = new SmartDeviceInfo();
        deviceInfo4.setDeviceId("4");
        deviceInfo4.setBindedTime(new Date());
        deviceInfo4.setLastReprotTime(new Date());
        deviceInfo4.setOwnerId("1");
        deviceInfoGreenDaoHelper.insertOrReplace(deviceInfo4, new IDbOperator.DbOperatorCallback() {
            @Override
            public void doSuccess(Object result) {
                Log.d("zhouyudong", "insert device info suc");
            }

            @Override
            public void doFail(Exception e) {
                e.printStackTrace();
                Log.d("zhouyudong", "insert device info fail");
            }
        });
        try {
            GreenDaoHelper.getDaoSession().getSmartDeviceInfoDao().queryRaw("device_id = 1 order by device_id asc", null);
            Log.d("zhouyudong", "query suc");
        } catch (Exception e) {
            e.printStackTrace();
            Log.d("zhouyudong", "query fail");
        }

        Calendar calendar = Calendar.getInstance();
        //calendar.clear();
        calendar.set(Calendar.YEAR, 2017);
        calendar.set(Calendar.MONTH, 1);
        int firstDay = calendar.getActualMinimum(calendar.DAY_OF_MONTH);
        int lastDay = calendar.getActualMaximum(calendar.DAY_OF_MONTH);
        System.out.println(2 + "月第一天是：" + firstDay);
        System.out.println(2 + "月最后一天是：" + lastDay);
        calendar.set(Calendar.DAY_OF_MONTH, lastDay);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(calendar.getTime()));

        try {
            Son son1 = new Son();
            son1.setValue(1);
            son1.setValue2(2);
            son1.setValue3(1);
            son1.setTest1("test1");
            son1.setTest2("test1");
            GreenDaoHelper.getDaoSession().getSonDao().insertOrReplace(son1);
            Son son2 = new Son();
            son2.setValue(1);
            son2.setValue2(2);
            son2.setValue3(2);
            son2.setTest1("test2");
            son2.setTest2("test2");
            GreenDaoHelper.getDaoSession().getSonDao().insertOrReplace(son2);
            Son son3 = new Son();
            son3.setValue(1);
            son3.setValue2(2);
            son3.setValue3(2);
            son3.setTest1("test3");
            son3.setTest2("test3");
            son3.setTest3("test3");
            GreenDaoHelper.getDaoSession().getSonDao().insertOrReplace(son3);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }


}