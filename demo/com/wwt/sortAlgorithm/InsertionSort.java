package com.wwt.sortAlgorithm;

// 插入排序
// **算法解析**
//      插入排序的代码实现虽然没有冒泡排序和选择排序那么简单粗暴，但它的原理应该是最容易理解的了，因为只要打过扑克牌的人都应该能够秒懂。
//      插入排序是一种最简单直观的排序算法，它的工作原理是通过创建有序序列和无序序列，然后再遍历无序序列得到里面每一个数字，把每一个数字插入到有序序列中正确的位置。
//      插入排序在插入的时候，有优化算法，在遍历无序序列找正确位置时，可以采取二分查找.
// **算法步骤**
//      将0索引的元素到N索引的元素看做是有序的，把N+1索引的元素到最后一个当成是无序的。
//      遍历无序的数据，将遍历到的元素插入有序序列中适当的位置，如遇到相同数据，插在后面。
//      N的范围：0~最大索引
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {2,6,3,11,22,26,9,15,27,10,4,8,25,21,10,5,11};
        insertionSort(arr);
    }

    // 插入排序方法
    private static void insertionSort(int[] arr) {
        // 先确定从哪个索引开始变成了无序的数据
        int startIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > arr[i+1]){
                startIndex = i + 1;
                break;
            }
        }

        // 逐个遍历无序列表中的数据，将其逐个插入前面的有序列表中，从后往前两两交换插入即可（优化算法，查找插入位置时，可以使用二分算法查找）
        for (int i = startIndex; i < arr.length; i++){
            // 记录待交换的索引
            int j = i;
            while(arr[j] < arr[j-1]) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
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
