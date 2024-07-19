package com.wwt.utils;

import java.util.Random;

public class CodeUtil {
    public static String getCode() {
        char[] base = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        String code = "";
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int randomInt = random.nextInt(base.length);
            code += base[randomInt];
        }
        return code;
    }
}
