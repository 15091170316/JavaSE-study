public class Cat {
    private String name;
    private int age;
    private char gender;

    // ptg插件生成javaBean：安装ptg插件后，在类中右键选择 ptg to JavaBean 自动生成JavaBean

    public Cat() {
    }

    public Cat(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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
     * @return gender
     */
    public char getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(char gender) {
        this.gender = gender;
    }

    public String toString() {
        return "Cat{name = " + name + ", age = " + age + ", gender = " + gender + "}";
    }

}
