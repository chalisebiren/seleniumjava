package Package1;

public class FinalTest {
    final  int MIN = 5;
    int MAX =10;

    public static void main(String[] args) {
        FinalTest a =  new FinalTest();
        a.MAX = a.MIN + a.MAX;
        System.out.println(a.MAX);
        System.out.println(a.MIN);
    }

}
