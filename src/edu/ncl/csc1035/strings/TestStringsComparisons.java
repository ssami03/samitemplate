package edu.ncl.csc1035.strings;

public class TestStringsComparisons {
    public static void main(String[] args) {

        String s1, s2, s3, s4, s5;
        s1 = "Anna";
        s2 = "John";
        s3 = "Anna ";
        s4 = " Anna";
        s5 = "anna";
        System.out.println(s1.compareTo(s2)); // prints -9
        System.out.println(s2.compareTo(s1)); // prints 9
        System.out.println(s1.compareTo(s3)); // prints -1
        System.out.println(s1.compareTo(s4)); // prints 33
        System.out.println(s1.compareTo(s5)); // prints -32

    }
}
