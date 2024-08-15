package com.wwt.nochangeList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        System.out.println("*********************不可变集合**********************");
        List<String> list = List.of("张三", "李四", "王五");
        System.out.println(list.get(1));

//        list.add("赵六");     // 编译报错

        for (String s : list) {
            System.out.println(s);
        }

        Set<String> set = Set.of("不", "可", "变", "Set", "集合");
//        set.remove("Set");

        // map的不可变集合只能传递20个参数，即10个键值对
        Map<String, String> map = Map.of("key1", "value1", "key2", "value2", "key3", "value3", "key4", "value4");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        // 创建超过10个键值对的不可变map集合
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("key1", "value1");
        map2.put("key2", "value2");
        Map<String, String> map3 = Map.copyOf(map2);
        map3.put("key3", "value3");

    }
}
