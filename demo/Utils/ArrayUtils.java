package Utils;

// 数组工具类
public class ArrayUtils {

    // 工具类需要私有化构造方法，不需要外部去创建工具类的对象，直接使用静态方法调用就行
    private ArrayUtils() {
    }

    // 打印整数数组方法（公共的静态方法：可以使用类名直接调用）
    public static String printArr(int[] arr){
        String str = "[";
        StringBuilder sb = new StringBuilder(str);  // 使用StringBuilder类型来拼接字符串，提高拼接效率
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if(i != arr.length-1){
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();   // 返回时要将StringBuilder类型转为String类型
    }

    // 求整数数组平均数方法
    public static int getIntAverage(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum/arr.length;
    }

}
