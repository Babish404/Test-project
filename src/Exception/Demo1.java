package Exception;

public class Demo1 {
    public static void main(String[] args){
        int num1= 100;
        int num2 = 5;
        int num3 = 0;
        int num4 =30;
        try {
            System.out.println(num1 / num2);
            System.out.println(num1 / num3);  //this is arithmetic exception
            System.out.println("i will be executed only when exception is not thrown by above code");
        }
        catch(Exception ex){
            System.out.println("exception handled");
            ex.printStackTrace();//will print details of exception
        }
        System.out.println(num1/num4);
    }
}
