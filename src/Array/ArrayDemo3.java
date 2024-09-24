package Array;

public class ArrayDemo3 {
    public static  void main(String[] args){

        int[] nums = {5,8,4,7,99,2};
        int largest = nums[0];
        for (int i=0; i<nums.length; i++) {
            if (largest < nums[i]) {
                largest = nums[i];
            }
        }
            System.out.println(largest);
    }
}
