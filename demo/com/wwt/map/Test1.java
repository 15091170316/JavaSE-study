package com.wwt.map;

import java.util.HashMap;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) {
        HashMap<Student, String> m1 = new HashMap<>();
        Student s1 = new Student("wwt", 24);
        Student s2 = new Student("zyh", 23);
        Student s3 = new Student("wsy", 23);
        Student s4 = new Student("wsy", 23);

        m1.put(s1, "陕西");
        m1.put(s2, "杭州");
        m1.put(s3, "西安");
        m1.put(s4, "美国");

        for (Map.Entry<Student, String> entry : m1.entrySet()) {
            System.out.print(entry.getKey() + " : " + entry.getValue() + "\n");
        }
        System.out.println();

    }
}
