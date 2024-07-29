package com.wwt.algorithm;

import java.util.Scanner;

// 需求：自己实现parseInt方法的效果，将字符串形式的数据转成整数。要求:字符串中只能是数字不能有其他字符最少一位，最多9位，0不能开头
public class Practise2 {
    public static void main(String[] args) {
        System.out.println("请输入一个最大9位的整数：");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if(!s.matches("[1-9]\\d{0,8}")){
            System.out.println("你输入的数字有误，请按要求输入！");
            return;
        }
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int num = s.charAt(i) - '0';        // 使用‘1’的ascall值来减去‘0’的ascell值，得到数字 1
            sum = sum * 10 + num;
        }
        System.out.println("转为整数后为：" + sum);
        System.out.println(sum);
        System.out.println(sum + 1);
    }
}
