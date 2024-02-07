package edu.ncl.csc1035.input;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        System.out.println("hello, world");
        Scanner sc = new Scanner(System.in);
        /*try {
            int i = sc.nextInt();
            System.out.println(i);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        }*/
        /*if (sc.hasNextInt()) {
            int i = sc.nextInt();
            System.out.println(i);
        } else {
            System.out.println("Invalid input");
        }*/
        String myNextString = sc.next();
        //sc.nextLine();
        System.out.println(myNextString);
        //myNextString = sc.next();
        //System.out.println(myNextString);
        String myNextLine = sc.nextLine();
        System.out.println(myNextLine);
        System.out.println("Finished");
    }
}
