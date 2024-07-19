package test3;

public class Test {
    public static void main(String[] args) {

        System.out.println("----------哈士奇----------");
        HSQ hsq = new HSQ();
        hsq.eat();
        hsq.drink();
        hsq.see();
        hsq.chajia();

        System.out.println("----------沙皮狗----------");
        SPG spg = new SPG();
        spg.eat();
        spg.drink();
        spg.see();

        System.out.println("----------田园犬----------");
        TYQ tyq = new TYQ();
        tyq.eat();
        tyq.drink();
        tyq.see();
    }
}
