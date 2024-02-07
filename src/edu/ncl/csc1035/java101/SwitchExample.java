package edu.ncl.csc1035.java101;

public class SwitchExample {
    public static void main(String[] args) {
        int input = 4;
        switch(input) {
            case 1:
                System.out.println("A partridge in a pear tree");
                break;
            case 2:
                System.out.println("Two turtle doves");
                break;
            case 3:
                System.out.println("Three French hens");
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }
}
