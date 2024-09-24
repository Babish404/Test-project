package Method;

public class MethodDemo2 {
    public static void main(String[] args) {
        int[] numbers = {20, 30, 10, 45,90 };

		//System.out.println("print all elements using for each loop");
		for( int num : numbers) {
			System.out.println(num);
		}
        printArrayElements(numbers);
        addAllElements(numbers);
    }

    static void printArrayElements(int[] arr) {
        System.out.println("print all elements using for each loop");
        for (int num : arr) {
            System.out.println(num);
        }
    }

    static void addAllElements(int[] array) {
        int sum=0;
        for(int i=0;i<array.length-1;i++) {
            sum=sum+array[i];
        }
        System.out.println("sum of all elements is "+sum);
    }
}
