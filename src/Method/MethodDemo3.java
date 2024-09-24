package Method;

public class MethodDemo3 {
    public static void main(String[] args) {

        int result=add(6, 9);// method calling
        System.out.println("result is " +result);

        MethodDemo3 MethodDemo3=new MethodDemo3();
        int mul=MethodDemo3.multiply(2, 3, 5);
        System.out.println("multiplication  is " +mul);
    }

    // method definition, you must need to call this method to execute
    static int add(int a, int b) {
        int c = a + b;
        return c; //result will be returned to caller method (main)

    }

    int multiply(int no1, int no2, int no3) { // non-static method
        int multiplication = no1 * no2 * no3;
        return multiplication;

    }
}
