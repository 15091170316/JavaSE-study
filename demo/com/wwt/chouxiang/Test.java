package com.wwt.chouxiang;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("大黄", 8);
        System.out.println(dog.getName() + dog.getAge());
        dog.eat();
        dog.drink();

        Frog frog = new Frog("小绿", 1);
        System.out.println(frog.getName() + frog.getAge());
        frog.eat();
        frog.drink();

        Sheep sheep = new Sheep("小白", 2);
        System.out.println(sheep.getName() + sheep.getAge());
        sheep.eat();
        sheep.drink();

    }
}
