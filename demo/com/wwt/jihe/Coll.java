package com.wwt.jihe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.function.Consumer;

public class Coll {
    public static void main(String[] args) {

        System.out.println("**************************Collection接口的基本方法******************************");
        ArrayList<String> list = new ArrayList<String>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        System.out.println(list);

        boolean c = list.remove("ccc");

        System.out.println(list);

        System.out.println(list.contains("ccc"));

        System.out.println(list.size());

        list.clear();
        System.out.println(list);

        System.out.println(list.isEmpty());

        System.out.println("****************************Collection集合遍历（3种）*******************************");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("aaa");
        list2.add("bbb");
        list2.add("ccc");
        list2.add("ddd");

        // 迭代器遍历
        Iterator<String> iterator = list2.iterator();
        while (iterator.hasNext()){
            String string = iterator.next();        // 获取指向的值并使指针下移
            System.out.print(string + " ");
        }
        System.out.println();

        // 增强for遍历（遍历过程中，修改遍历出来的变量时，是不能修改集合中的数据的）
        for (String s : list2) {
            System.out.print(s + " ");
        }
        System.out.println();

        // forEach遍历
        // 匿名内部类的写法
        list2.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.print(s + " ");
            }
        });
        System.out.println();

        // lambda表达式的写法
        list2.forEach((String s) -> {
            System.out.print(s + " ");
        });
        System.out.println();
        // lambda简写版
        list2.forEach(s -> System.out.print(s + " "));
        System.out.println();

        System.out.println("****************************List集合遍历（2种独有 + 3种继承）*******************************");
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);

        // 1、迭代器（如上）
        // 2、增强for（如上）
        // 3、forEach（如上）

        // 4、普通for循环遍历
        for (int i = 0; i < list3.size(); i++) {
            System.out.print(list3.get(i) + " ");
        }
        System.out.println();

        // 5、列表迭代器
        ListIterator<Integer> listIterator = list3.listIterator();
        while (listIterator.hasNext()){
            System.out.print(listIterator.next() + " ");
        }
        System.out.println();
    }
}
