package com.wwt.searchAlgorithm;

// 插值查找（二分查找的改进版本）
// **主要区别**
//      改进每次计算的中间的mid点的位置，使其不再是每次都在最中间取mid点，
//      而是根据target目标数值在整个区间数值中的比例，来按比例查找较为靠近目标点位的mid点.
// **约束**
//      数组或集合必须要是按顺序排列的.
// **细节**
//      对于表长较大，而关键字分布又比较均匀的查找表来说，插值查找算法的平均性能比折半查找要好的多。反之，数组中如果分布非常不均匀，那么插值查找未必是很合适的选择。
public class InterpolationSearch {
    public static void main(String[] args) {
        int[] arr = {7, 23, 79, 81, 103, 127, 131, 147};

        System.out.println(interpolationSearch(arr, 80));
        System.out.println(interpolationSearch(arr, 81));
        System.out.println(interpolationSearch(arr, 7));
    }

    private static int interpolationSearch(int[] arr, int target){
        // 定义要查找的索引范围区间
        int min = 0;
        int max = arr.length -1;
        while (true){
            if(min > max){
                return -1;
            }
            // 根据比例算出中间的mid点位的索引
            int mid = min + (target - arr[min])/(arr[max] - arr[min]) * (max - min);
            if(arr[mid] < target){
                min = mid + 1;
            } else if(arr[mid] > target) {
                max = mid - 1;
            } else {
                return mid;
            }
        }
    }
}
