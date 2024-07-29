package com.wwt;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        // 获取当前时间的毫秒数
        // System.out.println(System.currentTimeMillis());
        // System.exit(0);  // 停止jvm虚拟机（0表示正常停止，其他参数标识异常停止）

        // System.out.println(Runtime.getRuntime().availableProcessors()); // 获取cpu的线程数
        // System.out.println(Runtime.getRuntime().maxMemory() / 1024 / 1024); // 获取虚拟机可获取的总内存大小
        // System.out.println(Runtime.getRuntime().totalMemory() / 1024 / 1024); // 获取虚拟机已使用内存大小


        // BigDecimal
        // 在构造方法中直接传递小数创建的BigDecimal对象也是不精确的！！！
        BigDecimal bigDecimal1 = new BigDecimal(0.01);
        BigDecimal bigDecimal2 = new BigDecimal(0.09);
        System.out.println(bigDecimal1);
        System.out.println(bigDecimal2);

        // 整数超过long类型，小数超过double类型时，使用构造方法 new BigDecimal("") 来创建BigDecimal对象（注意：构造参数要写字符串类型，才是精确的 BigDecimal 类型）
        BigDecimal bigDecimal3 = new BigDecimal("0.01");
        BigDecimal bigDecimal4 = new BigDecimal("0.09");
        System.out.println(bigDecimal3);
        System.out.println(bigDecimal4);

        System.out.println(bigDecimal1.add(bigDecimal2));
        System.out.println(bigDecimal3.add(bigDecimal4));

        // 整数不超过long类型，小数不超过double类型时，使用静态方法 BigDecimal.valueOf() 来创建BigDecimal对象
        BigDecimal bigDecimal5 = BigDecimal.valueOf(10);
        BigDecimal bigDecimal6 = BigDecimal.valueOf(10.001);
        System.out.println(bigDecimal5);
        System.out.println(bigDecimal6);

        System.out.println("--------------------------------------------");


        // 包装类
        String str = "123";
        int i = Integer.parseInt(str);      // 字符串转整数
        System.out.println(i);
        System.out.println(Integer.toBinaryString(10));     // 十进制转二进制
        System.out.println(Integer.toOctalString(10));      // 十进制转八进制
        System.out.println(Integer.toHexString(10));        // 十进制转十六进制

        System.out.println(Double.parseDouble("123.123"));      // 字符串转小数


        String str2 = "true";
        boolean b = Boolean.parseBoolean(str2);
        System.out.println(b);

        System.out.println("----------------------Arrays----------------------");

        int[] arr = {2, 6, 3, 11, 22, 26, 9, 15, 27, 10, 4, 8, 25, 21, 10, 5, 11};
        System.out.println(Arrays.toString(arr));
        int[] ints = Arrays.copyOf(arr, 10);
        System.out.println(Arrays.toString(ints));
        int[] ints2 = Arrays.copyOf(arr, 20);
        System.out.println(Arrays.toString(ints2));
        int[] ints1 = Arrays.copyOfRange(arr, 3, 10);
        System.out.println(Arrays.toString(ints1));
        int[] ints3 = Arrays.copyOfRange(arr, 10, 30);
        System.out.println(Arrays.toString(ints3));

        Arrays.fill(ints3, 100);
        System.out.println(Arrays.toString(ints3));

//        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        Integer[] arr1 = {2, 6, 3, 11, 22, 26, 9, 15, 27, 10, 4, 8, 25, 21, 10, 5, 11};

        Arrays.sort(arr1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(Arrays.toString(arr1));

        Arrays.sort(arr1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        System.out.println(Arrays.toString(arr1));

        int i1 = Arrays.binarySearch(arr1, 10);
        System.out.println(i1);
        int i2 = Arrays.binarySearch(arr1, 27);
        System.out.println(i2);
        int i3 = Arrays.binarySearch(arr1, 30);
        System.out.println(i3);

//        System.out.println(Arrays.binarySearch(arr, 10));


    }
}
