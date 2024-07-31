package com.wwt.treeSet;

import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("wwt", 24);
        Student s2 = new Student("yqn", 23);
        Student s3 = new Student("wsy", 20);
        Student s4 = new Student("zhb", 24);

        TreeSet<Student> set = new TreeSet<>();
        System.out.println(set.add(s1));
        System.out.println(set.add(s2));
        System.out.println(set.add(s3));
        System.out.println(set.add(s4));

        System.out.println(set);
        System.out.println("------------------------------------");

        // 选择器排序
//        TreeSet<Student> set2 = new TreeSet<Student>(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        });

        // lambda的写法
        TreeSet<Student> set2 = new TreeSet<Student>((o1, o2) -> o2.getAge() - o1.getAge());
        System.out.println(set2.add(s1));
        System.out.println(set2.add(s2));
        System.out.println(set2.add(s3));
        System.out.println(set2.add(s4));

        System.out.println(set2);
    }
}
