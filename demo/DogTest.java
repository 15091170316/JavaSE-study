public class DogTest {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog("汪汪", 5);

        System.out.println(d2.getName());
        d2.setAge(10);
        System.out.println(d2.getAge());

        d1.call();

        d1.setAge(50);
        d1.setAge(30);
        System.out.println(d1.getAge());
    }
}
