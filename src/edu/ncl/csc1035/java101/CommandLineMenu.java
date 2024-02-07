package edu.ncl.csc1035.java101;

import java.util.Scanner;
public class CommandLineMenu {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean quit = false;
        while (!quit) {
            String choice = s.nextLine();
            switch (choice) {
                case "1":
                    System.out.println("You have selected option 1");
                    //do something
                    break;
                case "2":
                    System.out.println("You have selected option 2");
                    //do something
                    break;
                case "3":
                    System.out.println("You have selected option 3");
                    //do something
                    break;
                case "4":
                    System.out.println("You have selected option 4");
                    //do something
                    break;
                case "5":
                    System.out.println("You have selected option 5");
                    //do something
                    break;
                case "6":
                    System.out.println("You have selected option 6");
                    System.out.println("Quitting program");
                    quit = true;
                    break;
                default:
                    System.out.println("Not a valid choice");
            }
        }
    }
}