package edu.ncl.csc1035.methods;

public class MethodRecursion {

    public static int powerOf2(int n) {
        System.out.println("powerOf2("+n+") called");
        if (n == 1) {
            return 2;
        }
        return 2 * powerOf2(n-1);
    }

    public static void main(String[] args){
        System.out.println(powerOf2(2));
        System.out.println(powerOf2(4));
    }
}
