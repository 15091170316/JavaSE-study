package com.wwt.algorithmTest;

import java.util.Arrays;
import java.util.Comparator;

public class Test1 {
    public static void main(String[] args) {

        GirlFriend girlFriend = new GirlFriend("wangshiyun", 18, 1.62);
        GirlFriend girlFriend1 = new GirlFriend("zhanghanbing", 20, 1.72);
        GirlFriend girlFriend2 = new GirlFriend("zhangyuhang", 20, 1.74);
        GirlFriend girlFriend3 = new GirlFriend("wangmengyao", 20, 1.75);
        GirlFriend girlFriend4 = new GirlFriend("yangqianni", 24, 1.70);

        GirlFriend[] arr = {girlFriend2, girlFriend1, girlFriend3, girlFriend, girlFriend4};

        // 匿名内部类写法（升序）
        Arrays.sort(arr, new Comparator<GirlFriend>() {
            @Override
            public int compare(GirlFriend o1, GirlFriend o2) {
                double i = o1.getAge() - o2.getAge();
                i = i == 0 ? o1.getHeight() - o2.getHeight() : i;
                i = i == 0 ? o1.getName().compareTo(o2.getName()) : i;
                if(i > 0) {
                    return 1;
                } else if(i < 0){
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println(Arrays.toString(arr));

        // lambda表达式写法(降序)
        Arrays.sort(arr, (o1, o2) -> {
            double i = o2.getAge() - o1.getAge();
            i = i == 0 ? o2.getHeight() - o1.getHeight() : i;
            i = i == 0 ? o2.getName().compareTo(o1.getName()) : i;
            if(i > 0) {
                return 1;
            } else if(i < 0){
                return -1;
            } else {
                return 0;
            }
        });
        System.out.println(Arrays.toString(arr));

    }
}

class GirlFriend{
    private String name;
    private int age;
    private double height;


    public GirlFriend() {
    }

    public GirlFriend(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return height
     */
    public double getHeight() {
        return height;
    }

    /**
     * 设置
     * @param height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    public String toString() {
        return "GirlFriend{name = " + name + ", age = " + age + ", height = " + height + "}";
    }
}
