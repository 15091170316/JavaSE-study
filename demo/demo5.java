import java.util.Scanner;

public class demo5 {
    public static void main(String[] args) {
        // 键盘录入一个三位数，获取其中的个位 十位 百位
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 number:");
        int num = sc.nextInt();
        int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num / 100 % 10;
        System.out.println("ge： " + ge);
        System.out.println("shi： " + shi);
        System.out.println("bai： " + bai);
    }
}
