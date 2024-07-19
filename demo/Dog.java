public class Dog {
    private String name;
    private int age;

    // 空参构造方法
    public Dog() {
    }
    // 有参数的构造方法
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0 || age > 35){
            System.out.println("非法参数！");
        }else{
            this.age = age;
        }
    }

    public void call() {
        System.out.println("狗叫！！！");
    }
}
