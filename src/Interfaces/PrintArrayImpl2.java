package Interfaces;

public class PrintArrayImpl2 implements PrintArray{

    @Override
    public void print(int[] array) {

        for(int i=array.length-1;i>=0;i--) {

            System.out.println(array[i]); // right to left
        }



    }

}

