package edu.ncl.csc1035.primitiveTypes;

public class OutOfRangeError {
    public static void main(String[] args){

        byte b = (byte) 127;
        System.out.println(b);
        b++;
        System.out.println(b);
        b++;
        System.out.println(b);
    }
}