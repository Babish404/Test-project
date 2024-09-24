package Exception;

public class ExceptionDemo6 {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str);
            System.out.println("will be executed if above exception is not thrown");

        } catch (ArithmeticException ex) {
            System.out.println("exception handled");
            ex.printStackTrace();
        }
    }
}