package Interfaces;


public class PrintArrayImpl1 implements PrintArray {

        @Override
        public void print(int[] array) {

            for(int i=0;i<array.length;i++) {

                System.out.println(array[i]); //left to right
            }

        }

    }

