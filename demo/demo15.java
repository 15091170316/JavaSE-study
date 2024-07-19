public class demo15 {
    public static void main(String[] args) {
        compare((byte)3, (byte)4);
        compare(20, 20);
        compare((long)934322432, (long)734342334);
    }

    public static void compare(byte b1, byte b2) {
        System.out.println(b1 == b2);
    }
    public static void compare(short s1, short s2) {
        System.out.println(s1 == s2);
    }
    public static void compare(int i1, int i2) {
        System.out.println(i1 == i2);
    }
    public static void compare(long l1, long l2) {
        System.out.println(l1 == l2);
    }
}
