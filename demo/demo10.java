public class demo10 {
    public static void main(String[] args) {
        int[] age = new int[] { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
        int[] age2 = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };

        String[] name = new String[] { "John", "Jane", "Doe" };
        String[] name2 = { "John", "Jane", "Doe" };

        double[] height = new double[] { 10.34, 20.23, 30.13, 40, 50, 60, 70.23, 80, 90.11 };
        double[] height2 = { 10.34, 20.23 };

        // 输出的其实是数组的地址值
        System.out.println(age);
        System.out.println(height);
        System.out.println(name);

        // 打印数组元素
        System.out.println(age[0]);
        System.out.println(height[1]);
        System.out.println(name[2]);

        // 改变数组元素
        name2[0] = "Johnsss";
        System.out.println(name2[0]);

        // 数组遍历(idea快捷方式：age.fori)
        for (int i = 0; i < age.length; i++) {
            System.out.println(age[i] + " " + i);
        }

        // 数组的动态初始化
        int[] d1 = new int[10];     // int 存储的都是 0
        boolean[] d2 = new boolean[10];     // 布尔类型 存储的都是 false
        String[] d3 = new String[5];        // 引用类型 存储的都是 null
        System.out.println(d1[0]);
        System.out.println(d2[0]);
        System.out.println(d3[0]);


    }
}
