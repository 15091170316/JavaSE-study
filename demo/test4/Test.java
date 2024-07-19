package test4;

public class Test {
    public static void main(String[] args) {
//        Dog dog = new Dog(8, "黑色");
//        Cat cat = new Cat(2, "花色");
//        Person person = new Person("张三", 23);
//        person.keepPet(dog, "骨头");
//        person.keepPet(cat, "青花鱼");
//        dog.lookHome();
//        cat.catchMouse();


        // 多态调用
        Person person = new Person("李四", 28);
        Animal a1 = new Dog(6, "金色");
        // Dog a1 = new Dog(6, "金色");       // 一样的，使用Animal类是为了体现出父类的多态效果
        person.keepPet(a1, "骨头");
        Animal a2 = new Cat(1, "白色");
        // Cat a2 = new Cat(1, "白色");
        person.keepPet(a2, "鲨鱼");

        // 多态 强制类型转换
        Dog dog = (Dog) a1;
        dog.lookHome();
        Cat cat = (Cat) a2;
        cat.catchMouse();

    }
}
