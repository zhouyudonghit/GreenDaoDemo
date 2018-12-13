package com.example.yudongzhou.database.entity;
import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.JoinProperty;
import org.greenrobot.greendao.annotation.ToMany;

import java.util.List;
import com.example.yudongzhou.daodemo.dao.DaoSession;
import com.example.yudongzhou.daodemo.dao.SmartDeviceInfoDao;
import com.example.yudongzhou.daodemo.dao.SmartDeviceOwnerDao;

/**
 * 成员数据
 */
@Entity
public class SmartDeviceOwner {
    @Id
    private String ownerId;
    private String deviceId;
    private String modelId;
    private String num;
    private String attr;
    private String createUserId;
    private String lastModifyUserId;
    private String createTime;
    private String updateTime;

    public String getOwnerId() {
        return this.ownerId;
    }
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }
    public String getDeviceId() {
        return this.deviceId;
    }
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }
    public String getModelId() {
        return this.modelId;
    }
    public void setModelId(String modelId) {
        this.modelId = modelId;
    }
    public String getNum() {
        return this.num;
    }
    public void setNum(String num) {
        this.num = num;
    }
    public String getAttr() {
        return this.attr;
    }
    public void setAttr(String attr) {
        this.attr = attr;
    }
    public String getCreateUserId() {
        return this.createUserId;
    }
    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }
    public String getLastModifyUserId() {
        return this.lastModifyUserId;
    }
    public void setLastModifyUserId(String lastModifyUserId) {
        this.lastModifyUserId = lastModifyUserId;
    }
    public String getCreateTime() {
        return this.createTime;
    }
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
    /**
     * To-many relationship, resolved on first access (and after reset).
     * Changes to to-many relations are not persisted, make changes to the target entity.
     */

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    @Generated(hash = 1303439392)
    public synchronized void resetDeviceInfos() {
        deviceInfos = null;
    }
    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#delete(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 128553479)
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.delete(this);
    }
    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#refresh(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 1942392019)
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.refresh(this);
    }
    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#update(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 713229351)
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.update(this);
    }
    /**
     * To-many relationship, resolved on first access (and after reset).
     * Changes to to-many relations are not persisted, make changes to the target entity.
     */
    @Generated(hash = 1874179146)
    public List<SmartDeviceInfo> getDeviceInfos() {
        if (deviceInfos == null) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            SmartDeviceInfoDao targetDao = daoSession.getSmartDeviceInfoDao();
            List<SmartDeviceInfo> deviceInfosNew = targetDao
                    ._querySmartDeviceOwner_DeviceInfos(ownerId);
            synchronized (this) {
                if (deviceInfos == null) {
                    deviceInfos = deviceInfosNew;
                }
            }
        }
        return deviceInfos;
    }
    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 1818793187)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getSmartDeviceOwnerDao() : null;
    }

    @ToMany(joinProperties = { @JoinProperty(name = "ownerId", referencedName = "ownerId") })
    List<SmartDeviceInfo> deviceInfos;
    /** Used to resolve relations */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;
    /** Used for active entity operations. */
    @Generated(hash = 357589827)
    private transient SmartDeviceOwnerDao myDao;

    @Generated(hash = 94324204)
    public SmartDeviceOwner(String ownerId, String deviceId, String modelId, String num, String attr,
            String createUserId, String lastModifyUserId, String createTime, String updateTime) {
        this.ownerId = ownerId;
        this.deviceId = deviceId;
        this.modelId = modelId;
        this.num = num;
        this.attr = attr;
        this.createUserId = createUserId;
        this.lastModifyUserId = lastModifyUserId;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }
    @Generated(hash = 43012430)
    public SmartDeviceOwner() {
    }
}
