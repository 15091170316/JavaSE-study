package com.wwt.doudizhuTest2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;
import java.util.TreeSet;

public class PokerGame {
    // 生成扑克牌
    static TreeMap<Integer, String> tm = new TreeMap();
    static ArrayList<Integer> indexList = new ArrayList();

    // 使用静态代码块，保证里面的代码只会执行一边，即重复创建对象时只会生成一副扑克牌
    static {
        String[] colors = {"♠", "♣", "♦", "♥"};
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        int index = 1;

        for (String number : numbers) {
            for (String color : colors) {
                tm.put(index, color + number);
                // 将map集合中的键单独存放在list集合中
                indexList.add(index);
                index++;
            }
        }

        tm.put(index, "大王");
        indexList.add(index);
        index++;

        tm.put(index, "小王");
        indexList.add(index);

    }

    public PokerGame() {
        // 洗牌(只用洗map集合中的键而已)
        Collections.shuffle(indexList);

        // 发牌(使用treeSet集合，可以自动根据存储的内容排序)
        TreeSet<Integer> lord = new TreeSet<>();
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();

        for (int i = 0; i < indexList.size(); i++) {
            if(i <= 2){
                lord.add(indexList.get(i));
                continue;
            }
            if(i % 3 == 0){
                player1.add(indexList.get(i));
            } else if (i % 3 == 1){
                player2.add(indexList.get(i));
            } else {
                player3.add(indexList.get(i));
            }
        }

        // 看牌
        lookPoker("底牌", lord);
        lookPoker("钢脑壳", player1);
        lookPoker("玩家", player2);
        lookPoker("蛋筒", player3);
    }

    private void lookPoker(String name, TreeSet<Integer> set) {
        String s = name + "：";
        for (Integer i : set) {
            s += tm.get(i) + " ";
        }
        System.out.println(s);
    }
}
