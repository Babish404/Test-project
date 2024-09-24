package Array;
//create a method printing all elements of array
public class ArrayDemo4 {
    //sum of all elements
    public static void main(String[] args) {

        /*
         * int[] nums = {2,5,3,6,7}; int sum=0;
         *
         * for(int i=0;i<5;i++) {
         *
         * sum=sum+ nums[i]; }
         *
         * System.out.println("sum is " +sum);
         */
        int[] nums = {2,5,3,6,7};
        arraySum(nums);

    }


    static void arraySum(int[] arr){

        int sum=0;
        for(int i=0;i<5;i++) {

            sum=sum+ arr[i];
        }
        System.out.println("sum is " +sum);

    }

}