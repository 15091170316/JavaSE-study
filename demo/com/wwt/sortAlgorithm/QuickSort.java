package com.wwt.sortAlgorithm;

// 快速排序
// **算法解析**
//      快速排序是由东尼·霍尔所发展的一种排序算法。
//      快速排序又是一种分而治之思想在排序算法上的典型应用。
//      快速排序的名字起的是简单粗暴，因为一听到这个名字你就知道它存在的意义，就是快，而且效率高！
//      它是处理大数据最快的排序算法之一了。
// **算法步骤**
//      1. 从数列中挑出一个元素，一般都是左边第一个数字，称为 "基准数";
//      2. 创建两个指针，一个从前往后走，一个从后往前走
//      3. 先执行后面的指针，找出第一个比基准数小的数字
//      4. 再执行前面的指针，找出第一个比基准数大的数字
//      5. 交换两个指针指向的数字
//      6. 直到两个指针相遇
//      7. 将基准数跟指针指向位置的数字交换位置，称之为：基准数归位
//      8. 第一轮结束之后，基准数左边的数字都是比基准数小的，基准数右边的数字都是比基准数大的
//      9. 把基准数左边看做一个序列，把基准数右边看做一个序列，按照刚刚的规则递归排序
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {2, 6, 3, 11, 22, 26, 9, 15, 27, 10, 4, 8, 25, 21, 10, 5, 11};
        quickSort(arr, 0, arr.length - 1);

        // 输出排序结果
        printArr(arr);
    }

    // 快速排序递归方法
    public static void quickSort(int[] arr, int start, int end) {
        // 递归结束条件(部分排序已完成)
        if(start >= end) return;

        // 定义排序范围内第一个数为基准数
        int base = arr[start];
        // 定义前后两个指针
        int startPointer = start;
        int endPointer = end;

        while (startPointer != endPointer){
            // 后面的指针向前查找，找到小于基准数的数后停止(注：一定要后面的指针先往前移动，不能让前面的指针先往后移动)
            while(startPointer < endPointer && arr[endPointer] >= base){
                endPointer--;
            }

            // 前面的指针向后查找，找到大于基准数的数后停止
            while(startPointer < endPointer && arr[startPointer] <= base){
                startPointer++;
            }

            // 如果前后索引还没有相遇，则交换两个数的位置
            if(startPointer < endPointer){
                int temp = arr[startPointer];
                arr[startPointer] = arr[endPointer];
                arr[endPointer] = temp;
            } else {
                // 相遇后，就使基准数归位（交换指针相遇位置的数与基准数的位置）
                arr[start] = arr[endPointer];
                arr[endPointer] = base;
            }
        }

        // 若前后指针相等了，则一个基准数已经归位。再次递归调用这个基准数左右两边的数组列表（索引区分）
        quickSort(arr, start, startPointer - 1);
        quickSort(arr, endPointer + 1, end);

    }

    // 遍历输出数组
    private static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
