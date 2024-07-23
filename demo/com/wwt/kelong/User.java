package com.wwt.kelong;

import com.google.gson.Gson;

public class User implements Cloneable{
    private String name;
    private int age;
    private char sex;
    public int[] arr;

    public User() {
    }

    public User(String name, int age, char sex, int[] arr) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.arr = arr;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 浅拷贝重写
        // return super.clone();

        // 深拷贝重写(使用第三方代码 Gson)
        Gson gson = new Gson();
        String json = gson.toJson(this);
        User uclone =  gson.fromJson(json, User.class);
        return uclone;
    }
}
