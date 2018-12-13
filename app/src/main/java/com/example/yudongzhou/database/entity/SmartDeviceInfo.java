package com.example.yudongzhou.database.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;

import java.util.Calendar;
import java.util.Date;

@Entity
public class SmartDeviceInfo {
    @Id
    //设备ID
    private String deviceId;
    //设备名称（用户设置的名称）
    private String nickName;
    //设备默认名称
    private String deviceName;
    private String modleId;
    private String modelName;
    //设备分类，0端对云，1云对云
    private String modelType;
    //设备分组ID
    private String groupId;
    //成员Id
    @NotNull
    private String ownerId;
    //绑定时间
    private Date bindedTime;
    //最近使用时间
    private Date lastReprotTime;
    //使用次数
    private int usedTimes;
    //控制面板版本号
    private String version;
    //分类Id
    private String categoryId;
    //分类名称
    private String categoryName;
    //绑定状态 0表示未绑定，1表示已绑定
    private int bind_state;


    @Generated(hash = 975564633)
    public SmartDeviceInfo(String deviceId, String nickName, String deviceName,
            String modleId, String modelName, String modelType, String groupId,
            @NotNull String ownerId, Date bindedTime, Date lastReprotTime,
            int usedTimes, String version, String categoryId, String categoryName,
            int bind_state) {
        this.deviceId = deviceId;
        this.nickName = nickName;
        this.deviceName = deviceName;
        this.modleId = modleId;
        this.modelName = modelName;
        this.modelType = modelType;
        this.groupId = groupId;
        this.ownerId = ownerId;
        this.bindedTime = bindedTime;
        this.lastReprotTime = lastReprotTime;
        this.usedTimes = usedTimes;
        this.version = version;
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.bind_state = bind_state;
    }
    @Generated(hash = 192066575)
    public SmartDeviceInfo() {
    }


    public String getDeviceId() {
        return this.deviceId;
    }
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }
    public String getNickName() {
        return this.nickName;
    }
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    public String getDeviceName() {
        return this.deviceName;
    }
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }
    public String getModleId() {
        return this.modleId;
    }
    public void setModleId(String modleId) {
        this.modleId = modleId;
    }
    public String getModelName() {
        return this.modelName;
    }
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
    public String getModelType() {
        return this.modelType;
    }
    public void setModelType(String modelType) {
        this.modelType = modelType;
    }
    public String getGroupId() {
        return this.groupId;
    }
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
    public String getOwnerId() {
        return this.ownerId;
    }
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }
    
    public int getUsedTimes() {
        return this.usedTimes;
    }
    public void setUsedTimes(int usedTimes) {
        this.usedTimes = usedTimes;
    }
    public String getVersion() {
        return this.version;
    }
    public void setVersion(String version) {
        this.version = version;
    }
    public String getCategoryId() {
        return this.categoryId;
    }
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }
    public String getCategoryName() {
        return this.categoryName;
    }
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    public int getBind_state() {
        return this.bind_state;
    }
    public void setBind_state(int bind_state) {
        this.bind_state = bind_state;
    }
    public Date getLastReprotTime() {
        return this.lastReprotTime;
    }
    public void setLastReprotTime(Date lastReprotTime) {
        this.lastReprotTime = lastReprotTime;
    }
    public Date getBindedTime() {
        return this.bindedTime;
    }
    public void setBindedTime(Date bindedTime) {
        this.bindedTime = bindedTime;
    }
}
