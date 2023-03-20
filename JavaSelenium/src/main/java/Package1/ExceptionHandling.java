package Package1;

public class ExceptionHandling {
    public static void main(String[] args) {
        String[] zoo={"Tiger", "Lion", "Zoo"};
        try {
            System.out.println(zoo[3]);
        } catch(Exception e){
            System.out.println("Animal not found");
        }
    }
}
