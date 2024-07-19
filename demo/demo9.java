import java.util.Scanner;

public class demo9 {
    public static void main(String[] args) {
//        回文数 12321 121 3443
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        int temp = num;
        int result = 0;
        while (num > 0){
            int ge = num % 10;
            result = result * 10 + ge;
            num = num / 10;
        }
        if(temp == result){
            System.out.println(temp + " is a 回文数！");
        }else{
            System.out.println(temp + " is not a 回文数！");
        }
    }
}
