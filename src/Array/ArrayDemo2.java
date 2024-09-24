package Array;

public class ArrayDemo2 {
    public static void main(String[] args){
        int[] nums = {2,5,3,6,7};
        int sum=0;
        for(int i=0; i<5; i++){
            sum= sum+nums[i];
            System.out.println(sum);
        }
        //print outside the for loop to get the final sum only
    }
}
