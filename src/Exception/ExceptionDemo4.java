package Exception;

public class ExceptionDemo4 {public static void main(String[] args) {
    int num1=100;
    int num2=5;
    int num3=0;
    int num4=20;

    try {
        System.out.println(num1/num2);	//20

        System.out.println(num1/0); //ArithmeticException

        System.out.println("i will be executed only when exception is not thrown by above code");

    }
    //nothing should be here
    catch(NullPointerException ex) { //in this case exception will not be executed
        System.out.println("exception handled");
        ex.printStackTrace();//will print details of exception

    }
    finally {
        System.out.println("i will execute always");

    }

    System.out.println(num1/num4);

}

}
