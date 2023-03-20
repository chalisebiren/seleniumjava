package Package2;

import Package1.Access1;

public class Access3 extends Access1 {
    public static void main(String[] args) {
        Access1 Obj = new Access1();
        System.out.println(Obj.hour);
        System.out.println(Obj.minutes);

        Access3 Obj2 = new Access3();
        System.out.println(Obj2.hour2);
        System.out.println(Obj2.minutes2);
    }
}
