import java.util.ArrayList;

public class demo24 {
    public static void main(String[] args) {
        // 集合(增add删remove改set查get)

        // 创建集合
        ArrayList<String> arrayList = new ArrayList<>();   // JDK7 之后的写法(新写法)
        ArrayList<String> arrayListTest = new ArrayList<String>();  // JDK7 以前的写法
        // 输出集合（已经处理过了，返回的是数据值）
        System.out.println(arrayList);

        // 添加元素add()
        arrayList.add("wwt");
        arrayList.add("csy");
        arrayList.add("zyh");
        System.out.println(arrayList);

        // 删除元素remove()（两种）
        System.out.println(arrayList.remove("wwt"));    // 删除指定值的元素，返回Boolean，是否删除成功
        System.out.println(arrayList);
        System.out.println(arrayList.remove(0));    // 删除指定索引的元素, 返回被删除元素
        System.out.println(arrayList);

        // 修改元素set()
        System.out.println(arrayList.set(0, "wwt"));    // 返回被修改的元素值
        System.out.println(arrayList);

        // 查询元素get()
        System.out.println(arrayList.get(0));

        // 集合长度size()
        System.out.println(arrayList.size());

        // 遍历集合
        arrayList.add("abc");
        arrayList.add("aaa");
        arrayList.add("bbb");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
    }
}
