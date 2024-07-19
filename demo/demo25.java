import java.util.ArrayList;

public class demo25 {
    public static void main(String[] args) {
        // 基本数据类型添加到集合中时，要先使用包装类才能添加基本数据类型

        // 创建集合
        ArrayList<Integer> list = new ArrayList<>();    // int的包装类是Integer， char的包装类是Character，其他的类型第一个字母大写就是它的包装类
        // 添加元素
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        // 遍历集合
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if(i < list.size() - 1) {
                System.out.print(list.get(i) + ", ");
            }else{
                System.out.print(list.get(i));
            }
        }
        System.out.println("]");
    }

}
