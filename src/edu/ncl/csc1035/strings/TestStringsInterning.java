package edu.ncl.csc1035.strings;

public class TestStringsInterning {
    public static void main(String[] args) {

        String s1, s2, s3, s4, s5;
        s1 = "Anna";
        s2 = "Anna";
        s3 = new String("John");
        s4 = new String("John");
        s5 = "A";
        System.out.println(s1==s2);                       //prints true
        System.out.println(s1.equals(s2));                //prints true
        s2 = "Maria";
        System.out.println(s1==s2);                       //prints false
        System.out.println(s1.equals(s2));                //prints false
        System.out.println(s3==s4);                       //prints false
        System.out.println(s3.equals(s4));                //prints true
        System.out.println(s1.substring(0,1)==s5);        //prints false
        System.out.println(s1.substring(0,1).equals(s5)); //prints true
    }
}
