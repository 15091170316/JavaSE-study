package com.wwt.fanxing;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        ArrayList<PersianCat> list1 = new ArrayList<>();
        ArrayList<LiHuaCat> list2 = new ArrayList<>();
        ArrayList<TeddyDog> list3 = new ArrayList<>();
        ArrayList<HuskyDog> list4 = new ArrayList<>();

        keepPet(list1);
        keepPet(list2);
        keepPet1(list3);
        keepPet1(list4);
    }

    public static void keepPet(ArrayList<? extends Cat> list) {

    }

    public static void keepPet1(ArrayList<? extends Dog> list) {

    }
}
