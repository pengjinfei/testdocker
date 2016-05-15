package com.pengjinfei.po;

import java.io.Serializable;

/**
 * Created by Pengjinfei on 16/5/15.
 * Description:
 */
public class User implements Serializable {

    private int age;
    private String name;

    public User() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "com.pengjinfei.po.User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
