package com.wwt.algorithm;

import java.util.ArrayList;
import java.util.Scanner;

// 需求：键盘录入一些1~100之间的整数，并添加到集合中。直到集合中所有数据和超过200为止。
public class Practise1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        while (sum <= 200){
            System.out.println("请输入 1 - 100 之间的整数：");
            String s = scanner.nextLine();
            if(!s.matches("[1-9]\\d?0?")){
                System.out.println("你输入的数字有误，请重新输入！");
                continue;
            }
            int i = Integer.parseInt(s);
            list.add(i);
            sum += i;
        }
        toStringList(list);
        System.out.println("集合总数为：" + sum);
    }

    // 打印集合
    private static void toStringList(ArrayList<Integer> list){
        System.out.print("你输入的集合为：");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
