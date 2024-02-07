package edu.ncl.csc1035.java101;

public class LoopExample {
    public static void main(String[] args) {
        // For loop
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        // While loop
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }

        // Do while loop
        // Executes code, before checking condition
        int j = 0;
        do {
            System.out.println(j);
            j++;
        }
        while (j < 10);
    }

}
