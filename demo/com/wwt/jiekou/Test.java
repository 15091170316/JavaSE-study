package com.wwt.jiekou;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("大黄", 10);
        System.out.println(dog.getName() + ", " + dog.getAge());
        dog.eat();
        dog.swimming();

        Frog frog = new Frog("小绿", 1);
        System.out.println(frog.getName() + ", " + frog.getAge());
        frog.eat();
        frog.swimming();

        Rabbit rabbit = new Rabbit("小白", 3);
        System.out.println(rabbit.getName() + ", " + rabbit.getAge());
        rabbit.eat();

    }
}
