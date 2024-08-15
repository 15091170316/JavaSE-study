package com.wwt.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class practise3 {
    public static void main(String[] args) {
        ArrayList<String> men = new ArrayList<>();
        ArrayList<String> women = new ArrayList<>();

        Collections.addAll(men, "张三,23", "王大锤,33", "李四,27", "赵德猪,24", "杨大鹏,23", "王小平,49");
        Collections.addAll(women, "赵红,32", "杨晓霞,18", "杨意意,20", "赵大汝,21", "王诗韵,13", "杨蕊,32");

        Stream<String> menStream = men.stream().filter(s -> s.split(",")[0].length() == 3).limit(2);
        Stream<String> womenStream = women.stream().filter(s -> s.split(",")[0].startsWith("杨")).skip(1);

        Stream<String> concat = Stream.concat(menStream, womenStream);

        List<Actor> collectList = concat.map(new Function<String, Actor>() {
            @Override
            public Actor apply(String s) {
                String name = s.split(",")[0];
                int age = Integer.parseInt(s.split(",")[1]);
                return new Actor(name, age);
            }
        }).collect(Collectors.toList());

        System.out.println(collectList);
    }
}
