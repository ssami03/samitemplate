package edu.ncl.csc1035.referenceTypes;

public class DefaultValues {

    // fields
    int i;
    byte b;
    short s;
    long l;
    double d;
    float f;
    boolean bool;
    char c;
    String str;

    // main
    public static void main(String[] args){

        // create object
        DefaultValues v = new DefaultValues();

        // integer types
        System.out.println(v.i);
        System.out.println(v.b);
        System.out.println(v.s);
        System.out.println(v.l);

        // floating-point types
        System.out.println(v.d);
        System.out.println(v.f);

        // other types
        System.out.println(v.bool);
        // prints null character i.e. \u0000
        System.out.println(v.c);
        System.out.println(v.str);
    }
}
