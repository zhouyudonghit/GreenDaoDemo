package com.example.yudongzhou.database.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class BaseBean {
    protected String name;

    @Generated(hash = 1602857262)
    public BaseBean(String name) {
        this.name = name;
    }

    @Generated(hash = 1972076277)
    public BaseBean() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
