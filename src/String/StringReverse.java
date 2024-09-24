package String;

public class StringReverse {
    public static void main(String[] args){
        String input= "Hello";
        String output= reverseString(input);
        System.out.println(output);
    }
    // Method to reverse a string
    public static String reverseString(String input) {
        // Using StringBuilder to reverse the string
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString(); // Reverse and convert back to string
    }
}
