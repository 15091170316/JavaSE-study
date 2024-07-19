import Utils.ArrayUtils;

public class demo26 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // 使用工具类打印数组
        String s = ArrayUtils.printArr(arr);
        System.out.println(s);

        // 使用工具类求数组平均数
        int intAverage = ArrayUtils.getIntAverage(arr);
        System.out.println(intAverage);
    }
}
