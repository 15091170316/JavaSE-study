public class demo22 {
    public static void main(String[] args) {
        // StringBuilder用处：字符串拼接时、字符串反转时
        // StringBuilder 可以方便的处理字符串(注：它不是String类型，不能直接使用String中的成员方法)
        // 注：（这不是字符串类型，要使用字符串的方法时需要使用toString()方法将StringBuilder转为字符串）

        // 创建一个StringBuilder类型数据(也表示将String类型数据转为StringBuilder类型数据)
        StringBuilder sb = new StringBuilder("abc");

        // 添加数据 append()
        sb.append("def");   // StringBuidler可以直接添加进去，不像String不能改变已经创建的String数据。
        sb.append('g');
        sb.append(12.2);    // 什么类型都可以添加
        System.out.println(sb); // 内部已经做了处理，输出的是值，不是地址

        // 反转数据 reverse()
        sb.reverse();
        System.out.println(sb);

        // 获取长度(StringBuilder中也有获取长度的方法，也是length()方法)
        System.out.println(sb.length());

        // 将StringBuilder类型转为String类型(注：只有转为String类型后，才能使用String的一些方法)
        String str = sb.toString();
        System.out.println(sb);
        System.out.println(str);


        // 链式编程
        String str1 = "hello";
        String s1 = str1.substring(1, 3).replace('l', 'e');
        System.out.println(s1);
    }
}
