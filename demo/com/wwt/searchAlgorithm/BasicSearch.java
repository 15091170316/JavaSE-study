package com.wwt.searchAlgorithm;

// 顺序查找（基本查找）
// 顺序查找也称为线形查找，属于无序查找算法。从数据结构线的一端开始，顺序扫描，依次将遍历到的结点与要查找的值相比较，若相等则表示查找成功；若遍历结束仍没有找到相同的，表示查找失败。
public class BasicSearch {
    public static void main(String[] args) {
        int[] arr = {131, 127, 147, 81, 103, 23, 7, 79};

        System.out.println(basicSearch(arr, 82));
        System.out.println(basicSearch(arr, 81));

    }

    // 顺序查找/基本查找方法
    private static int basicSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
