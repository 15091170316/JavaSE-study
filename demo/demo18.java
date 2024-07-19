public class demo18 {
    // 二维数组
    public static void main(String[] args) {
        // 定义二维数组
        int[][] arr = new int[][]{{12, 2, 23}, {5, 22, 14}, {32, 25, 21}};
        int[][] arr2 = {{12, 2, 23}, {5, 22, 14}, {32, 25, 21}};
        int[][] arr3 = new int[10][5];  // 动态创建二维数组

        // 二维数组访问和修改
        System.out.println(arr2[0][1]);
        System.out.println(arr[2][2]);
        arr[2][2] = 100;
        System.out.println(arr[2][2]);
        System.out.println();

        // 二维数组遍历
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
