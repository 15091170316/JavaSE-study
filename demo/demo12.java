import java.util.Random;

public class demo12 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[10];
        // 循环给数组存储随机数
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100) + 1;
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //求所有数据的和
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num += arr[i];
        }
        System.out.println("数组所有的和：" + num);
        
        // 求所有数据的平均数
        int pinjun = num / arr.length;
        System.out.println("数组的平均数：" + pinjun);
        
        // 求数组中比平均数小的元素个数
        int minCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < pinjun) {
                minCount++;
            }
        }
        System.out.println("数组中比平均数小的个数：" + minCount);
    }
}
