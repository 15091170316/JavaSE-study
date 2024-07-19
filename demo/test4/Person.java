package test4;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
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
        this.age = age;
    }

    /**
    // 饲养狗
    public void keepPet(Dog dog, String something) {
        System.out.println("年龄为" + age + "岁的" + name + "养了一只" + dog.getColor() + "颜色的" + dog.getAge() + "岁的狗");
        dog.eat(something);
    }

    // 饲养猫
    public void keepPet(Cat cat, String something){
        System.out.println("年龄为" + age + "岁的" + name + "养了一只" + cat.getColor() + "颜色的" + cat.getAge() + "岁的猫");
        cat.eat(something);
    }
     **/

    // 多态：
    // 想要一个方法，能接收所有的动物，包括猫和狗
    // 方法的形参，可以写这些动物类的父类 Animal
    public void keepPet(Animal a, String something){
        // instanceof 既可以用来判断类型，也可以用来强制转换类型（若 a 的类型是Dog类或包含Dog类，则返回true；若再带一个参数，则表示为true时将Animal a 强转为 Dog dog）
        // a instanceof Dog         (判断类型)
        // a instanceof Dog dog     (判断类型 + 强制类型转换)
        if(a instanceof Dog dog){
            System.out.println("年龄为" + age + "岁的" + name + "养了一只" + dog.getColor() + "颜色的" + dog.getAge() + "岁的狗");
            dog.eat(something);
        } else if(a instanceof Cat cat) {
            System.out.println("年龄为" + age + "岁的" + name + "养了一只" + cat.getColor() + "颜色的" + cat.getAge() + "岁的猫");
            cat.eat(something);
        }else{
            System.out.println("年龄为" + age + "岁的" + name + "养了一只" + a.getColor() + "颜色的" + a.getAge() + "岁的动物");
        }
    }
}
