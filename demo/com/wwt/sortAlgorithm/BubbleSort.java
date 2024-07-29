package com.wwt.sortAlgorithm;

// 冒泡排序
// **算法说明**
//      冒泡排序（Bubble Sort）也是一种简单直观的排序算法。
//      它重复的遍历过要排序的数列，一次比较相邻的两个元素，如果他们的顺序错误就把他们交换过来。
//      这个算法的名字由来是因为越大的元素会经由交换慢慢"浮"到最后面。
//      当然，大家可以按照从大到小的方式进行排列。
// **算法步骤**
//      1. 相邻的元素两两比较，大的放右边，小的放左边
//      2. 第一轮比较完毕之后，最大值就已经确定，第二轮可以少循环一次，后面以此类推
//      3. 如果数组中有n个数据，总共我们只要执行n-1轮的代码就可以
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,6,3,11,22,26,9,15,27,10,4,8,25,21,10,5,11};
        bubbleSort(arr);
    }

    // 冒泡排序算法
    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j-1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        // 输出排序结果
        printArr(arr);
    }

    // 遍历输出数组
    private static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
