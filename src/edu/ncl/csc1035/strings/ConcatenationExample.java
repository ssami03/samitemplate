package edu.ncl.csc1035.strings;


public class ConcatenationExample {
    public static void main(String[] args) {
        System.out.println("The concatenation is " + 12 + 13);
        System.out.println(("The concatenation is " + 12) + 13);
        System.out.println("The total is " + (12 + 13));
        System.out.println(12 + 13 + " is what?");
        System.out.println((12 + 13) + " is what?");
        System.out.println(12 + (13 + " is what?"));
        System.out.println(12 + "" + 13 + " is what?");
        System.out.println("" + 12 + 13 + " is what?");
    }
}
