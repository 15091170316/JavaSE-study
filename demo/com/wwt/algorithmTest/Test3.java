package com.wwt.algorithmTest;

public class Test3 {
    public static void main(String[] args) {
        /*
        * day10     1
        * day9      (day10 + 1)*2       4
        * day8      (day9 + 1)*2        10
        * */
        System.out.println(methods(1));
    }

    // 递归
    public static int methods(int day) {
        if(day >= 10){
            return 1;
        }
       return (methods(day + 1) + 1) * 2;
    }
}
