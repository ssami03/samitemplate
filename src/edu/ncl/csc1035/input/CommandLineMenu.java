package edu.ncl.csc1035.input;

import java.util.Scanner;

public class CommandLineMenu {
    public void menu() {
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        while (!quit) {
            System.out.println("Select option 1 or 2, or 3 to quit");
            while(!sc.hasNextInt()) {
                System.out.println("Not an integer");
                System.out.println("Select option 1 or 2, or 3 to quit");
                sc.nextLine();
            }
            int i = sc.nextInt();
            sc.nextLine();

            switch (i) {
                case 1:
                    System.out.println("Option 1 selected");
                    break;
                case 2:
                    System.out.println("Option 2 selected");
                    break;
                case 3:
                    System.out.println("Option 3 selected, quitting program");
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        CommandLineMenu clm = new CommandLineMenu();
        clm.menu();
    }
}
