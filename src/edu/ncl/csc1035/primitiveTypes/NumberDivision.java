package edu.ncl.csc1035.primitiveTypes;

public class NumberDivision {
    public static void main(String[] args){

        // floating-point / floating-point -> floating-point
        System.out.println( 4.0 / 2.0 );
        System.out.println( 2.0 / 4.0 );

        // floating-point / int -> floating-point
        System.out.println( 4.0 / 2 );
        System.out.println( 2.0 / 4 );

        // int / floating-point -> floating-point
        System.out.println( 4 / 2.0 );
        System.out.println( 2 / 4.0 );

        // int / int -> int
        System.out.println( 4 / 2 );
        System.out.println( 2 / 4 );

        System.out.println(3.0 / 2.0 / 3.0);
        System.out.println(3 / 2.0 / 3.0);
        System.out.println(3 / 2 / 3.0);
        System.out.println(1 / 3.0);
        System.out.println(3 / 2 / 3);
    }
}
