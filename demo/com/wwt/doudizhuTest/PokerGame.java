package com.wwt.doudizhuTest;

import java.util.ArrayList;
import java.util.Collections;

public class PokerGame {
    // 生成扑克牌
    static ArrayList<String> pokers = new ArrayList();

    // 使用静态代码块，保证里面的代码只会执行一边，即重复创建对象时只会生成一副扑克牌
    static {
        String[] colors = {"♠", "♣", "♦", "♥"};
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        for (String color : colors) {
            for (String number : numbers) {
                pokers.add(color + number);
            }
        }

        pokers.add("大王");
        pokers.add("小王");
    }

    public PokerGame(){
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


}
