package edu.ncl.csc1035.arrays;

public class ArraysExample1 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        int[] ages = {10,20,30,40,50};
        /*System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        int x = numbers.length;
        System.out.println(x);
                for (int i = 0; i < x; i++) {
            System.out.println("hello, world");
        }*/
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < ages.length; j++) {
                System.out.println("Numbers: " + numbers[i]);
                System.out.println("Ages: " + ages[j]);
            }
        }
    }
}
