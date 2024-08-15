package com.wwt.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

public class practise2 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        Collections.addAll(strings, "zhangsan, 23", "lisi, 24", "wangwu, 25");

        Map<String, Integer> collect = strings.stream()
                .filter(s -> Integer.parseInt(s.split(", ")[1]) >= 24)
                .collect(Collectors.toMap(s -> s.split(", ")[0], s -> Integer.parseInt(s.split(", ")[1])));

        System.out.println(collect);
    }
}
