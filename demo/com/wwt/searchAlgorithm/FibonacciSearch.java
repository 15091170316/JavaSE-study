package com.wwt.searchAlgorithm;

import java.util.Arrays;

// 斐波那契查找（二分查找的改进版）
// **主要区别**
//      改进每次计算的中间的mid点的位置，使其不再是每次都在最中间取mid点，
//      而是根据黄金分割的比例，即斐波那契额数列来查找mid点。
// **约束**
//      数组或集合必须要是按顺序排列的.
// **基本思想**
//      也是二分查找的一种提升算法，通过运用黄金比例的概念在数列中选择查找点进行查找，提高查找效率。同样地，斐波那契查找也属于一种有序查找算法。
public class FibonacciSearch {
    public static final int MAX_SIZE = 20;

    public static void main(String[] args) {
        int[] arr = {7, 23, 79, 81, 103, 127, 131, 147};

        System.out.println(fibonacciSearch(arr, 80));
        System.out.println(fibonacciSearch(arr, 81));
        System.out.println(fibonacciSearch(arr, 7));
    }

    // 定义斐波那契查找的方法
    private static int fibonacciSearch(int[] arr, int target) {
        // 定义要查找的索引范围区间
        int min = 0;
        int max = arr.length - 1;
        // 定义斐波那契数列分割数的下标
        int index = 0;

        // 获取斐波那契数列
        int[] fibonacci = getFibonacci();
        //获取斐波那契分割数值的下标
        while (max > (fibonacci[index] - 1)){
            index ++;
        }
        //因为fibonacci[index]值可能大于arr的长度，因此需要使用Arrays工具类，构造一个新法数组，并指向temp[],不足的部分会使用0补齐
        int temp[] = Arrays.copyOf(arr, fibonacci[index]);
        //实际需要使用arr数组的最后一个数来填充不足的部分
        for (int i = max + 1; i < temp.length; i++) {
            temp[i] = arr[max];
        }

        // 使用while循环，找到target值
        while (min <= max){
            int mid = min + fibonacci[index - 1] - 1;
            if(temp[mid] > target){
                max = mid - 1;
                index--;
            } else if(temp[mid] < target){
                min = mid + 1;
                index -= 2;
            } else{ // 找到了
                //需要确定返回的是哪个下标
                if (mid <= max) {
                    return mid;
                } else {
                    return max;
                }
            }
        }
        return -1;
    }

    // 获取斐波那契数列
    private static int[] getFibonacci() {
        int[] fibonacci = new int[MAX_SIZE];
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        for (int i = 2; i < MAX_SIZE; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        return fibonacci;
    }
}
