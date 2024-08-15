package com.wwt.exception;

import java.util.Scanner;

public class practise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GirlFriend girlFriend = new GirlFriend();
        while (true){
            try {
                System.out.println("请输入女朋友的名字：");
                String nameStr = scanner.nextLine();
                girlFriend.setName(nameStr);
                System.out.println("请输入女朋友的年龄：");
                String ageStr = scanner.nextLine();
                int age = Integer.parseInt(ageStr);
                girlFriend.setAge(age);
                break;
            } catch (NumberFormatException e){
                e.printStackTrace();
            } catch (RuntimeException e) {
                e.printStackTrace();
            }
        }

        System.out.println(girlFriend.getName() + ": " + girlFriend.getAge());
    }
}
