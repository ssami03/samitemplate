package edu.ncl.csc1035.collections;


import java.util.Arrays;

public class UsingArrays {
    public static void main(String[] args) {
        int[] x = new int[10];
        Arrays.fill(x, 5);

        System.out.println(x);
        System.out.println(Arrays.toString(x));
    }
}
