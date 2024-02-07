package edu.ncl.csc1035.primitiveTypes;

public class TypeCasting {
    public static void main(String[] args){

        // widening casting i.e. int -> double
        int i = 9;
        double d = i;
        System.out.println(i);
        System.out.println(d);

        // narrowing casting i.e. double -> int
        d = 9.78;
        i = (int) d;
        // d = i;
        System.out.println(i);
        System.out.println(d);

        long l = 123456789123456789L;
        d = l;
        System.out.println(l);
        System.out.println(d);

    }
}