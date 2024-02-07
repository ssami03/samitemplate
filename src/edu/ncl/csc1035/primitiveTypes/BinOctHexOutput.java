package edu.ncl.csc1035.primitiveTypes;

public class BinOctHexOutput {
    public static void main(String[] args) {
        int x = 10;

        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toOctalString(x));
        System.out.println(Integer.toHexString(x));
        System.out.println(Integer.toString(x,7));
    }
}
