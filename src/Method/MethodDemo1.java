public class MethodDemo1 {
    public static void main(String[] args) {
        multi(9, 13, 4);
        multi(6, 10, 33); //method calling
    }

    static void multi(int a, int b, int c) {
        int x = a * b * c;
        System.out.println(x); //using the values above in this function.
    }
}