package edu.ncl.csc1035.methods;

public class PersonMain {
    public static void main(String[] args) {
        Person.sayHello();
        Person.sayHello("Konrad");
        Person konrad = new Person("Konrad", "Lecturer", true);
        System.out.println(konrad.isBearded());
        konrad.shaveBeard();
        System.out.println(konrad.isBearded());
        boolean success = konrad.shaveBeard();
        System.out.println("Success: "+success);
        System.out.println(konrad.isBearded());
    }
}
