package Package1;

public class StaticTest {
    int a=100;
    static int b = 200;

    public static void main(String[] args) {
        int b=1;
        StaticTest c = new StaticTest();
        System.out.println(c.a);
        System.out.println(b);
    }
}
