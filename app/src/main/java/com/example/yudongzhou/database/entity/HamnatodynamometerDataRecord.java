package com.example.yudongzhou.database.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

/**
 * 血压仪测量数据
 */
@Entity
public class HamnatodynamometerDataRecord {
    @Id
    private String uuid;
    private String deviceId;
    private String modleId;
    private String userId;
    private String ownerId;
    private String reportTime;
    //上报状态，0位未上报，1为已上报
    private int reportStatus;
    private String exp1;
    private String exp2;
    private String data1;
    private String data2;
    private String data3;
    private String data4;
    private String data5;
    private String data6;
    private String data7;
    private String data8;
    private String data9;
    private String data10;

    @Generated(hash = 389366438)
    public HamnatodynamometerDataRecord(String uuid, String deviceId,
            String modleId, String userId, String ownerId, String reportTime,
            int reportStatus, String exp1, String exp2, String data1, String data2,
            String data3, String data4, String data5, String data6, String data7,
            String data8, String data9, String data10) {
        this.uuid = uuid;
        this.deviceId = deviceId;
        this.modleId = modleId;
        this.userId = userId;
        this.ownerId = ownerId;
        this.reportTime = reportTime;
        this.reportStatus = reportStatus;
        this.exp1 = exp1;
        this.exp2 = exp2;
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
        this.data4 = data4;
        this.data5 = data5;
        this.data6 = data6;
        this.data7 = data7;
        this.data8 = data8;
        this.data9 = data9;
        this.data10 = data10;
    }
    @Generated(hash = 1921650409)
    public HamnatodynamometerDataRecord() {
    }

    public String getDeviceId() {
        return this.deviceId;
    }
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }
    public String getModleId() {
        return this.modleId;
    }
    public void setModleId(String modleId) {
        this.modleId = modleId;
    }
    public String getUserId() {
        return this.userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getOwnerId() {
        return this.ownerId;
    }
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }
    public int getReportStatus() {
        return this.reportStatus;
    }
    public void setReportStatus(int reportStatus) {
        this.reportStatus = reportStatus;
    }
    public String getUuid() {
        return this.uuid;
    }
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
    public String getExp1() {
        return this.exp1;
    }
    public void setExp1(String exp1) {
        this.exp1 = exp1;
    }
    public String getExp2() {
        return this.exp2;
    }
    public void setExp2(String exp2) {
        this.exp2 = exp2;
    }
    public String getData1() {
        return this.data1;
    }
    public void setData1(String data1) {
        this.data1 = data1;
    }
    public String getData2() {
        return this.data2;
    }
    public void setData2(String data2) {
        this.data2 = data2;
    }
    public String getData3() {
        return this.data3;
    }
    public void setData3(String data3) {
        this.data3 = data3;
    }
    public String getData4() {
        return this.data4;
    }
    public void setData4(String data4) {
        this.data4 = data4;
    }
    public String getData5() {
        return this.data5;
    }
    public void setData5(String data5) {
        this.data5 = data5;
    }
    public String getData6() {
        return this.data6;
    }
    public void setData6(String data6) {
        this.data6 = data6;
    }
    public String getData7() {
        return this.data7;
    }
    public void setData7(String data7) {
        this.data7 = data7;
    }
    public String getData8() {
        return this.data8;
    }
    public void setData8(String data8) {
        this.data8 = data8;
    }
    public String getData9() {
        return this.data9;
    }
    public void setData9(String data9) {
        this.data9 = data9;
    }
    public String getData10() {
        return this.data10;
    }
    public void setData10(String data10) {
        this.data10 = data10;
    }
    public String getReportTime() {
        return this.reportTime;
    }
    public void setReportTime(String reportTime) {
        this.reportTime = reportTime;
    }
}
