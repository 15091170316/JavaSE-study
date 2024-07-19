package com.wwt.jiekou;

public interface Swim {

    // public abstract void swimming();         // public abstract 可省略（默认添加的）
    void swimming();

    // 接口中的成员变量都是静态的常量类型
    // public static final ABC = 10；
    int ABC = 10;

    // 在JDK7以前（包含），接口中的成员方法只能是抽象方法！（无方法体，实现后必须被重写）(public abstract void method();)
    // jdk8：添加了默认方法 default关键字修饰默认方法！（有方法体，实现后可以被重写，也可以不被重写）(public default void method(){};)
    //      添加了静态方法 status关键字修饰静态方法！（有方法体，实现后不能被重写）(public status void method(){};)
    // jdk9：添加了私有方法 有普通的私有方法 private关键字修饰普通私有方法，有静态私有方法 private status关键字修饰静态私有方法 （有方法体，实现后不能被重写）
    //      （普通私有方法为默认方法提供私有封装，静态私有方法为静态方法提供私有封装，两两对应，不能混用）(private void methods(){};  private status void method(){};)
}
