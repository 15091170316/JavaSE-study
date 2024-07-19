package com.wwt.chouxiang;

public class Sheep extends Animal{
    public Sheep() {
    }

    public Sheep(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("名为" + name + "，年龄为" + age +"的山羊吃草！");
    }
}
