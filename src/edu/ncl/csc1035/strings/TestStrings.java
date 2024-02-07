package edu.ncl.csc1035.strings;

public class TestStrings {
    public static void main(String[] args) {

        String s1, s2;
        s1 = "";
        String s3 = "CSC1035";
        System.out.println(s1.length());
        System.out.println(s3.length());
        System.out.println(s3.charAt(1));
        System.out.println(s3.charAt(s3.length()-1));
        System.out.println(s3.substring(0,3));
        System.out.println(s3.substring(4,7));
        System.out.println(s3.substring(4,7).charAt(0));

        // Crash s2.length();
        // Crash System.out.println(s3.charAt(s3.length()));
        // Crash System.out.println(s3.charAt(-1));
        // Crash System.out.println(s3.substring(4,9));
    }
}
