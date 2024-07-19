import java.util.StringJoiner;

public class demo23 {
    public static void main(String[] args) {
        // StringJoiner类型：主要用于处理字符串的拼接操作（JDK 8才开始支持的类）
        // 创建一个StringJoiner对象的数据（该类没有空的构造方法）
        StringJoiner sj = new StringJoiner("--");    // 一个构造参数时：指字符之间用 -- 拼接
        StringJoiner sj1 = new StringJoiner("--", "[", "]"); // 三个构造参数时：指字符之间用 -- 拼接，并且在开头拼接 [ 在结尾拼接 ]
        // add()： 添加数据
        sj1.add("123").add("456").add("789");
        // length()：获取长度(长度为拼接后的长度)
        System.out.println(sj1.length());
        // 转为String类型
        String str = sj1.toString();
        System.out.println(str);
    }
}
