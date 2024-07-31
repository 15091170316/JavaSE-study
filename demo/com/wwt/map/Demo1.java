package com.wwt.map;

import java.util.*;
import java.util.function.BiConsumer;

public class Demo1 {
    public static void main(String[] args) {
        Map<String, String> m1 = new HashMap<>();

        System.out.println(m1.put("key1", "value1"));
        System.out.println(m1.put("key2", "value2"));
        System.out.println(m1.put("key3", "value3"));
        System.out.println(m1.put("key1", "value4"));
        System.out.println(m1);

        System.out.println(m1.remove("key2"));
        System.out.println(m1);

        System.out.println(m1.containsKey("key1"));
        System.out.println(m1.containsValue("value1"));

        System.out.println(m1.isEmpty());

        System.out.println(m1.size());
        System.out.println(m1);

        m1.clear();
        System.out.println(m1);

        System.out.println("-----------------遍历map集合---------------------");

        Map<String, String> m2 = new HashMap<>();
        m2.put("key1", "value1");
        m2.put("key2", "value2");
        m2.put("key3", "value3");

        // 1、通过键找值（单列遍历键，通过get方法获取值）
        Set<String> keys = m2.keySet();
        for (String key : keys) {
            System.out.print(key + "=" + m2.get(key) + " ");
        }
        System.out.println();

        // 2、通过键值对遍历（还是单例遍历，将Entry键值对加入Set单例集合种，通过getKey和getValue方法来分别获取键值数据）
        Set<Map.Entry<String, String>> entries = m2.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.print(entry.getKey() + "=" + entry.getValue() + " ");
        }
        System.out.println();

        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> entry = iterator.next();
            System.out.print(entry.getKey() + "=" + entry.getValue() + " ");
        }
        System.out.println();

        // 3、通过forEach遍历（匿名内部类形式）
        m2.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.print(key + "=" + value + " ");
            }
        });
        System.out.println();

        // 3、通过forEach遍历（lambda表达式形式）
        m2.forEach((key, value) -> System.out.print(key + "=" + value + " "));
        System.out.println();


        // 遍历总结
//        m2.keySet();
//        m2.entrySet();

        System.out.println("--------------------------LinkedHashMap--------------------------");

        // 有序、无重复、无索引
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

        lhm.put("key1", 1);
        lhm.put("key3", 3);
        lhm.put("key2", 2);
        lhm.put("key2", 4);

        System.out.println(lhm);

        for (Map.Entry<String, Integer> entry : lhm.entrySet()) {
            System.out.print(entry.getKey() + "=" + entry.getValue() + " ");
        }
        System.out.println();

        System.out.println("--------------------------TreeMap--------------------------");
        // 可排序、无重复、无索引、红黑树结构（默认升序）
        // 升序排列（默认升序）
        TreeMap<Integer, String> tm1 = new TreeMap<>();
        tm1.put(2, "value1");
        tm1.put(4, "value2");
        tm1.put(1, "value3");
        tm1.put(3, "value4");
        System.out.println(tm1);

        // 降序排列（比较器）
        TreeMap<Integer, String> tm2 = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        tm2.put(2, "value1");
        tm2.put(4, "value2");
        tm2.put(1, "value3");
        tm2.put(3, "value4");
        System.out.println(tm2);


    }
}
