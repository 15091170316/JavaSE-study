package com.wwt.kelong;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        User user1 = new User("wwt", 24, 'M', new int[]{1, 2, 3, 4, 5});
        User clone = (User) user1.clone();

        System.out.println(user1.toString());
        System.out.println(clone.toString());

        System.out.println(user1.arr);
        System.out.println(clone.arr);
        System.out.println(user1.arr.equals(clone.arr));
    }
}
