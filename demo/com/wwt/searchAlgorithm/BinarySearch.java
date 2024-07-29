package com.wwt.searchAlgorithm;

// 二分查找（折半查找）
// 说明：元素必须是有序的，从小到大，或者从大到小都是可以的。
// 如果是无序的，也可以先进行排序。但是排序之后，会改变原有数据的顺序，查找出来元素位置跟原来的元素可能是不一样的，所以排序之后再查找只能判断当前数据是否在容器当中，返回的索引无实际的意义。
//
//**基本思想**：也称为是折半查找，属于有序查找算法。用给定值先与中间结点比较。比较完之后有三种情况：
//* 相等
//  说明找到了
//* 要查找的数据比中间节点小
//  说明要查找的数字在中间节点左边
//* 要查找的数据比中间节点大
//  说明要查找的数字在中间节点右边
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {7, 23, 79, 81, 103, 127, 131, 147};

        System.out.println(binarySearch(arr, 80));
        System.out.println(binarySearch(arr, 81));
        System.out.println(binarySearch(arr, 7));
    }

    // 二分查找/折半查找方法
    private static int binarySearch(int[] arr, int target){
        // 定义要查找的索引范围区间
        int min = 0;
        int max = arr.length - 1;
        while (true){
            if(min > max){
                return -1;
            }
            // 取待查找的索引范围的中间索引
            int mid = (min + max) / 2;
            if(arr[mid] < target){
                min = mid + 1;
            }else if (arr[mid] > target){
                max = mid - 1;
            }else{
                return mid;
            }
        }
    }
}
