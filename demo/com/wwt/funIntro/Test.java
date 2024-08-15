package com.wwt.funIntro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Integer[] arr = {3, 5, 1, 3, 2, 6, 0, 4, 8, 3};

        Arrays.sort(arr, Test::subtraction);

        System.out.println(Arrays.toString(arr));
        System.out.println();


        ArrayList<String> strings = new ArrayList<>();
        Collections.addAll(strings, "1", "2", "3", "4", "5", "6", "7", "8", "9");

        List<Integer> list = strings.stream().map(Integer::parseInt).toList();
        System.out.println(list);


    }

    public static int subtraction(int n1, int n2) {
        return n2 - n1;
    }
}
