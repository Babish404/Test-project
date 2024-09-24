package Method;

public class MethodDemo {
    public static void main(String[] args) { //this is the min method.
        MethodDemo ob=new MethodDemo(); //this is creating object
            ob.newmethod(11,22,33); //input of parameters.

            int result=ob.returnmethod(2,3,4);
            System.out.println(result); //the returned result from (returnmethod) comes here and gets printed.

    }
void newmethod(int a, int b, int c){
        int multiple = a*b*c;
        System.out.println("The multiple is " + multiple); //here it is only printing the results and not returning result to main method.
}
int returnmethod(int a, int b, int c){
        int result= a*b*c;
        return result; //the output is being return to the main method.
}
}
