package edu.ncl.csc1035.inheritance;

public class UsingPerson1 {
    public static void main(String[] args) {
        Person p = new Person("Fred", 21);
        Student s = new Student("Fiona", 20, "Newcastle", 1);
        // p.printDetails(); // calls _______ printDetails
        // s.printDetails(); // calls _______ printDetails
        System.out.println(p instanceof Student);
        System.out.println(p instanceof Person);
        p = s;
        System.out.println(p instanceof Student);
        System.out.println(p instanceof Person);
        System.out.println(s instanceof Student);
        System.out.println(s instanceof Person);
        if (p instanceof Student) {
            s = (Student) p;
        } else {/*do something else*/}
        // p.printDetails(); // calls _______ printDetails
        s.printDetails("Hello");
    }
}
