import java.util.Scanner;

public class demo8 {
    public static void main(String[] args) {
        // switch
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期：");
        int n = sc.nextInt();
        switch (n){
            case 1,2,3,4,5:
                System.out.println("工作日");
                break;
            case 6, 7:
                System.out.println("休息日");
                break;
            default:
                System.out.println("无效的日期");
                break;
        }

//      JDK12以后新增了一种新的写法(自带break，不需要再写了)
        switch(n){
            case 1, 2, 3, 4, 5 -> System.out.println("工作日");
            case 6, 7 -> {
                System.out.println("休息日");
            }
            default -> System.out.println("无效的日期");
        }
    }
}
