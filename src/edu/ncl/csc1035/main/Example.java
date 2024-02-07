package edu.ncl.csc1035.main;

public class Example {
    public static void main(String[] args) {
        /*for(String s: args) {
            System.out.println(s);
        }*/
        if (args.length > 0) {
            if (args[0].equals("Hello")) {
                System.out.println("Nice to meet you");
            } else {
                System.out.println("You need to say Hello");
            }
        } else {
            System.out.println("Add some commandline options");
        }
    }
}
