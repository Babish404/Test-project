package com.encapsulatiomn;

public class ChangeMail {
    public static void main(String[] args) {

        Employee emp1=new Employee();
        //System.out.println(emp1.email);//error

        System.out.println(emp1.getEmail());//pemba@gmail.com
        //i want to modify email
        emp1.setEmail("benji@gmail.com");
        System.out.println(emp1.getEmail());//benji@gmail.com

        emp1.setId(101);
        emp1.setName("benji");

        System.out.println(emp1);//it internally calls toString()

        Employee emp3=new Employee(111, "frank", "freank@gmail.com", "passkey");

    }

}

