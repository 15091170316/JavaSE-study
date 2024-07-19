public class demo14 {
    public static void main(String[] args) {
        // 参数方法求和
        getSum1(45,34);     // 无返回值的方法
        getSum1(23,23);

        // 有返回值的方法
        int result = getSum(10, 20);
        System.out.println(result + "!!!");
        System.out.println(getSum(45, 54) + "!!!");
    }

    // 求和方法（不带返回值）
    public static void getSum1(int num1, int num2){
        int sum = num1 + num2;
        System.out.println(sum);
    }

    // 求和方法(带返回值)
    public static int getSum(int num1, int num2) {
        // return num1 + num2;

        int sum = num1 + num2;
        return sum;
    }
}
