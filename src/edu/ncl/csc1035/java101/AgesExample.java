package edu.ncl.csc1035.java101;


public class AgesExample {
    public static void main(String[] args) {

        int[] ages = {24, 31, 29, 40, 18, 20, 42, 50}; // Just some ages, now what?

        for (int i = 0; i < ages.length; i++) {
            System.out.println("Ages: " + ages[i]);
        }

        for (int age: ages) {
            System.out.println(age);
        }

        double total = 0;
        for (int i = 0; i < ages.length; i++) {
            total += ages[i];
        }
        System.out.println("Total is: " + total);
    }
}
