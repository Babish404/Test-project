package Method;

public class MethodDemoFirst {
    public static void main(String[] args) {
        //call ashish for adding two numbers
        MethodDemoFirst ob=new MethodDemoFirst() ; //creating object of class MethodDemoFirst
        ob.ashish(10, 20);//calling method ashish()

        //now main wants to add three numbers
        ob.sadaf(10, 3, 30);

        //now main wants to subtract two numbers
        int result=ob.pemba(30,10);
        System.out.println(result);
        //now main wants get hello before a given string
        String name=ob.prabhat("surendra");
        System.out.println(name);
    }

    void ashish(int a, int b){ //void means the result isn't being returned. Ashish is directly printing it.
        int result=a+b;
        System.out.println(result);
    }

    void sadaf(int a, int b,int c){
        int result=a+b+c;
        System.out.println(result);
    }

    int pemba(int a, int b){ //here method pemba is computing the result and returning it to the method(main) which then prints out the output.
        int result =a-b;
        return result;
    }

    String prabhat(String s){
        return "hello "+s;
    }
}
