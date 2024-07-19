package com.wwt.chouxiang;

public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("名为" + name + "，年龄为" + age +"的狗吃骨头！");
    }


}
