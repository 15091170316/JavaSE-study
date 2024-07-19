package com.wwt.chouxiang;

public class Frog extends Animal {
    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("名为" + name + "，年龄为" + age +"的青蛙吃虫子！");
    }

}
