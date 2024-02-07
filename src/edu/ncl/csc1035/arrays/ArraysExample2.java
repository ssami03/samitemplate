package edu.ncl.csc1035.arrays;

public class ArraysExample2 {
    public static void main(String[] args) {
        String hi = "hello, world";
        char[] chars = hi.toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    System.out.println("Match found: " + chars[i] + " and " + chars[j] + " at " + i + " and " + j);
                    count++;
                }
            }
        }
        System.out.println("Number of matches found: " + count);
    }
}
