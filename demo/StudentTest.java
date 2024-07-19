public class StudentTest {
    public static void main(String[] args) {
        // 创建一个学生对象
        Student s1 = new Student();
        s1.name = "张三";
        s1.age = 18;
        s1.height = 181.23;
        System.out.println("我叫" + s1.name);
        s1.study();
        s1.playGame();

        // 还可以继续创建其他的学生对象
        Student s2 = new Student();
        s2.name = "李四";
        s2.age = 21;
        System.out.println(s2.name + "-" + s2.age);
    }
}
