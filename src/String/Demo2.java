package String;

public class Demo2 {
    public static void main(String[] args) {

        String str1= "Lazana";
        String str2=new String("Lazana");
        System.out.println(str1.substring(0));//Lazana

        System.out.println(str1.substring(1));//azana

        System.out.println(str1.substring(4));//na

        //System.out.println(str1.substring(10)); //exception
        //compare 2 strings by contents

        System.out.println(str1.equals(str2));

    }
}
