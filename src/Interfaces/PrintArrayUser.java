package Interfaces;

public class PrintArrayUser {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};

        PrintArray pa=new PrintArrayImpl1();
        pa.print(arr);

        System.out.println("now user need to print in reverse order");

        pa=new 	PrintArrayImpl2();
        pa.print(arr);


    }

}
