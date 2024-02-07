package edu.ncl.csc1035.java101;

public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        numbers[0] = 100;
        numbers[1] = 200;
        numbers[2] = 300;

        //int[] numbers = {100,200,300,400,500,600,700,800,900,1000};
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[9]);
        // Crash System.out.println(numbers[10]);
        // Crash System.out.println(numbers[-1]);

        System.out.println(numbers.length);

        char[] characters = new char[5];
        characters[0] = 'a';
        characters[1] = 'b';
    }
}
