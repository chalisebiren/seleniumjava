public class Strings {
    int x = 5;
    float y = 3.5f;
    String z = "Hello All";
    int[] num  = {1, 2, 3, 4, 5};


    public static void main(String[] args){
        Strings intObj = new Strings();
        System.out.print(intObj.x);
        System.out.print("\n");
        System.out.print(intObj.y);
        System.out.print("\n" + intObj.z);
        String a = new String("Hello ");
        String b = "World";
        System.out.print("\n" + a + b);
        String trimStr = "       Trim White Space       ";
        System.out.println("\n" + trimStr);
        System.out.println(trimStr.trim());
        System.out.println(trimStr.equals(trimStr.trim()));
        System.out.println((a+b).toUpperCase());
        System.out.println((a+b).toLowerCase());
        System.out.println(trimStr.length());
        System.out.println(trimStr.isEmpty());





    }

}
