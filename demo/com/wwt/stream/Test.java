package com.wwt.stream;

import java.util.*;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        // 单列集合的stream流处理
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("张大伟");
        list.add("李头字");
        list.add("张温习");
        list.add("张三丰");
        list.add("王大锤");
        list.add("李头字");
        list.add("张温习");
        list.add("张三丰");

        list.stream().filter(name -> name.startsWith("张")).filter(name -> name.length() == 3).forEach(name -> System.out.print(name + " "));
        System.out.println();

        // 双列集合是将双列集合转为单列集合再去获取stream流

        // 数组的stream流处理
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.stream(arr).forEach(num -> System.out.print(num + " "));
        System.out.println();

        // 零散数据获取stream流（必须是同种类型）
        Stream.of(1, 2, 3, 4).forEach(num -> System.out.print(num + " "));
        System.out.println();

        list.stream().limit(3).forEach(name -> System.out.print(name + " "));
        System.out.println();

        list.stream().skip(4).forEach(name -> System.out.print(name + " "));
        System.out.println();

        list.stream().limit(3).skip(2).forEach(name -> System.out.print(name + " "));
        System.out.println();

        list.stream().distinct().forEach(name -> System.out.print(name + " ")); // 去重
        System.out.println();

        Stream.concat(list.stream().limit(3), list.stream().skip(5)).forEach(name -> System.out.print(name + " "));
        System.out.println();

        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "王诗雨-22", "张宇航-24", "李天姿-23", "王诗韵-18");

        // map可以类型转换
        list2.stream().map(new Function<String, Object>() {
            @Override
            public Object apply(String s) {
                String[] person = s.split("-");
                String ageStr = person[1];
                int age = Integer.parseInt(ageStr);
                return age;
            }
        }).forEach(age -> System.out.print(age + " "));
        System.out.println();

        // map的lambda表达式形式
        list2.stream().map(s -> Integer.parseInt(s.split("-")[1])).forEach(age -> System.out.print(age + " "));
        System.out.println();

        System.out.println(list2.stream().count());

        // toArray方法默认收集到object类型的数组中
        Object[] array = list2.stream().skip(1).toArray();
        System.out.println(Arrays.toString(array));

        // 传递一个匿名内部类即可指定收集的数组类型
        String[] array1 = list2.stream().skip(1).toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });
        System.out.println(Arrays.toString(array1));

        // lambda表达式的写法
        String[] array2 = list2.stream().skip(1).toArray(value -> new String[value]);
        System.out.println(Arrays.toString(array2));
        System.out.println();

        // collect方法，收集stream流数据到集合中
        List<String> collect = list2.stream().limit(2).collect(Collectors.toList());
        System.out.println(collect);

        Set<String> collect1 = list2.stream().limit(2).collect(Collectors.toSet());
        System.out.println(collect1);
        System.out.println();

        // collect方法，收集数据到map集合
        Map<String, Integer> collect2 = list2.stream().collect(Collectors.toMap(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.split("-")[0];
            }
        }, new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s.split("-")[1]);
            }
        }));
        System.out.println(collect2);

        // lambda表达式的方式,收集数据到map集合
        Map<String, Integer> collect3 = list2.stream().collect(Collectors.toMap(s -> s.split("-")[0], s -> Integer.parseInt(s.split("-")[1])));
        System.out.println(collect3);
    }
}
