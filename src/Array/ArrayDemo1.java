package Array;

public class ArrayDemo1 {
    public static void main(String[] args) {

        //int num=20;//here num can store ony one value

        int[] num = {2,5,3,6,7};
        //print first element
        System.out.println(num[0]);
        //print last element
        System.out.println(num[4]);




        String[] weekDays= {"monday","tuesday","wednesday","thursday","friday"};

        //print last element
        System.out.println(weekDays[4]);

        //print length of array(here 5)

        System.out.println(weekDays.length);//5

        //print last element again
        System.out.println(weekDays[weekDays.length-1]);//friday


        //printing all elemnts of array

        for(int i=0;i<5 ;i++ ) { //i=0,1,2,3,4

            System.out.println(weekDays[i]);

        }



    }

}
