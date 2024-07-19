import java.util.Scanner;

public class demo20 {
    public static void main(String[] args) {
        // 输入字符串，统计 大小写，数字 出现的个数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.nextLine();
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        int otherCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                bigCount++;
            } else if (c >= 'a' && c <= 'z') {
                smallCount++;
            } else if (c >= '0' && c <= '9'){
                numberCount++;
            } else {
                otherCount++;
            }
        }
        System.out.println("大写字母有：" + bigCount + "个");
        System.out.println("小写字母有：" + smallCount + "个");
        System.out.println("数字有：" + numberCount + "个");
        System.out.println("其他字符有：" + otherCount + "个");
    }
}
