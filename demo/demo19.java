import java.util.Scanner;

public class demo19 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "ABC";

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));    // 忽略大小写比较

        // 键盘输入字符串，遍历字符
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            System.out.printf(c + " ");
        }
    }
}
