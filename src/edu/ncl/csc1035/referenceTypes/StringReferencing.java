package edu.ncl.csc1035.referenceTypes;

public class StringReferencing {
    public static void main(String[] args) { // 1
        String i = new String("2");  // 2
        doSomethingWith(i);                  // 3
        System.out.println("Line 4: " + i);  // 4
    }                                        // 5
    static void doSomethingWith(String i) {  // 6
        System.out.println("Line 7: " + i);  // 7
        i = new String("2000");      // 8
        System.out.println("Line 9: " + i);  // 9
    }                                        // 10
}
