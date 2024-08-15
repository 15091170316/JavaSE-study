package com.wwt.exception;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        try {
            System.out.println(arr[5]);
            System.out.println(2/0);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("出现了数组角标越界异常：" + e.toString());
        }
        System.out.println("我执行了吗");
        throw new NullPointerException();
    }
}
