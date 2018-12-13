package com.example.yudongzhou.database.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Index;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Unique;

import java.math.BigDecimal;

@Entity(indexes = {@Index(value = "test1 DESC,test2 DESC",unique = true)})
public class Son{
    @Id(autoincrement = true)
    private Long id;

    private float value;
    private float value2;
    private float value3;
    private String test1;
    private String test2;
    @Unique
    @NotNull
    private String test3;


    @Generated(hash = 1259336981)
    public Son() {
    }

    @Generated(hash = 1889135283)
    public Son(Long id, float value, float value2, float value3, String test1,
            String test2, @NotNull String test3) {
        this.id = id;
        this.value = value;
        this.value2 = value2;
        this.value3 = value3;
        this.test1 = test1;
        this.test2 = test2;
        this.test3 = test3;
    }

    public float getValue() {
        return this.value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public float getValue2() {
        return this.value2;
    }

    public void setValue2(float value2) {
        this.value2 = value2;
    }

    public float getValue3() {
        return this.value3;
    }

    public void setValue3(float value3) {
        this.value3 = value3;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTest1() {
        return this.test1;
    }

    public void setTest1(String test1) {
        this.test1 = test1;
    }

    public String getTest2() {
        return this.test2;
    }

    public void setTest2(String test2) {
        this.test2 = test2;
    }

    public String getTest3() {
        return this.test3;
    }

    public void setTest3(String test3) {
        this.test3 = test3;
    }
}
