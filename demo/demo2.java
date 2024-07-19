// 1、导包
import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        // 2、创建对象
        Scanner sc = new Scanner(System.in);
        // 3、接受数据(该方法只能输入整数数据！)
        System.out.println("Enter number:");
        int num = sc.nextInt();
        System.out.println(num);
    }
}
