package String;

public class Demo1 {
    public static void main(String[] args) {
        //way1 of creating string
        String str1= "Lazana";

        //way2 of creating string

        String str2= new String("Lazana");

        System.out.println(2 + 3); //5
        System.out.println("sooraj" + "lazana");//soorajlazana

        System.out.println(2+3+"sooraj");//5sooraj

        System.out.println(2+"sooraj");//2sooraj

        System.out.println(2+3+"sooraj"+2+3); //

        //length
        System.out.println(str1.length()); //6

        System.out.println(str1.charAt(0));//L
        System.out.println(str1.charAt(1));//a
        System.out.println(str1.charAt(5));//last character
        System.out.println(str1.charAt(str1.length()-1));//last character

    }
}
