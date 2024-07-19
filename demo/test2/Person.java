package test2;

public class Person {
    String name;
    int age;
    char gender;

    public Person() {
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void eat() {
        System.out.println(name + "能吃三碗大米饭！");
    }

    public void sleep() {
        System.out.println(name + "睡到12点也不起！");
    }
}
