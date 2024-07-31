package com.wwt.map;

import java.util.TreeMap;

public class Test2 {
    public static void main(String[] args) {
        Student s1 = new Student("wwt", 24);
        Student s2 = new Student("zyh", 20);
        Student s3 = new Student("yqn", 22);
        Student s4 = new Student("wsy", 22);

        TreeMap<Student, String> tm = new TreeMap<>();

        tm.put(s1, "陕西");
        tm.put(s2, "西安");
        tm.put(s3, "杭州");
        tm.put(s4, "北京");

        System.out.println(tm);
    }
}
