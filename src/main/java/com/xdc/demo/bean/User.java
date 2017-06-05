package com.xdc.demo.bean;

import java.util.Date;

/**
 * Created by Administrator on 2017/6/5.
 */
public class User {
    private String userId;
    private String username;
    private String age;
    private Date updateTime;

    //getter setter ......
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }


    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return username;
    }

    public String getAge() {
        return age;
    }

    public Date getUpdateTime() {
        return updateTime;
    }
}
