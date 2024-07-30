public class Lambda {
    public static void main(String[] args) {

        // 匿名内部类
        method(new Swim() {
            @Override
            public void swimming() {
                System.out.println("正在游泳~~~~~~");
            }
        });

        // 匿名内部类的lambda表达式写法
        method(() -> {
            System.out.println("正在游泳~~~~~~");
        });
    }

    public static void method(Swim s){
        s.swimming();
    }
}

@FunctionalInterface
interface Swim {
    public abstract void swimming();
//    public abstract void swimming2();     // 使用lambda表达式时，内部类必须时接口的形式，且只能有一个抽象方法（函数式接口）
}
