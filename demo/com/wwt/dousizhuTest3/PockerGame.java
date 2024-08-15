package com.wwt.dousizhuTest3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class PockerGame {

    // 生成扑克牌
    static ArrayList<String> pokers = new ArrayList<>();
    static HashMap<String, Integer> weights = new HashMap<>();      // 存储牌的权重

    static {
        String[] colors = {"♠", "♣", "♦", "♥"};
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        for (String number : numbers) {
            for (String color : colors) {
                pokers.add(color + number);
            }
        }

        pokers.add("小王");
        pokers.add("大王");

        // 存储牌的权重，3-10牌面就是权重
        weights.put("J", 11);
        weights.put("Q", 12);
        weights.put("K", 13);
        weights.put("A", 14);
        weights.put("2", 15);
        weights.put("小王", 16);
        weights.put("大王", 17);
    }

    public PockerGame(){
        // 洗牌
        Collections.shuffle(pokers);

        // 发牌
        ArrayList<String> lord = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();

        for (int i = 0; i < pokers.size(); i++) {
            if(i <= 2){
                // 加入底牌
                lord.add(pokers.get(i));
                continue;
            }

            if(i % 3 == 0){
                player1.add(pokers.get(i));
            } else if(i % 3 == 1){
                player2.add(pokers.get(i));
            } else{
                player3.add(pokers.get(i));
            }
        }

        // 整理牌
        order(player1);
        order(player2);
        order(player3);
        order(lord);

        // 看牌
        lookPoker("底牌", lord);
        lookPoker("钢脑壳", player1);
        lookPoker("玩家", player2);
        lookPoker("蛋筒", player3);

    }

    private void lookPoker(String name, ArrayList<String> list) {
        String s = name + "：";
        for (String poker : list) {
            s += poker + " ";
        }
        System.out.println(s);
    }

    public void order(ArrayList<String> list){
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String color1 = o1.substring(0, 1);
                String color2 = o2.substring(0, 1);
                int value1 = getValue(o1);
                int value2 = getValue(o2);
                int value = value1 - value2;
                return value == 0 ? color1.compareTo(color2) : value;
            }
        });
    }

    public int getValue(String poker){
        String number = poker.substring(1);
        if(poker.equals("大王") || poker.equals("小王")){
            return weights.get(poker);
        }else if(weights.containsKey(number)){
            return weights.get(number);
        } else{
            return  Integer.parseInt(number);
        }
    }

}
