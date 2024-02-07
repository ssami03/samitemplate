package edu.ncl.csc1035.primitiveTypes;

public class PrecedenceExample {
    public static void main(String[] args) {
        int i = 7 - 1 * 2;
        System.out.println(i);
        int j = (7 - 1) * 2;
        System.out.println(j);
    }
}
