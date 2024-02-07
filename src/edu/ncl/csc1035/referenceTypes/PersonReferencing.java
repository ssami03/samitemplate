package edu.ncl.csc1035.referenceTypes;

public class PersonReferencing {
    public static void main(String[] args) {   // 1
        Person neil = new Person("Neil");// 2
        doSomethingWith(neil);                 // 3
        System.out.println("Line 4: " + neil); // 4
    }                                          // 5
    static void doSomethingWith(Person p) {    // 6
        System.out.println("Line 7: " + p);    // 7
        p.setName("Bob");                      // 8
        System.out.println("Line 9: " + p);    // 9
    }                                          // 10
}
