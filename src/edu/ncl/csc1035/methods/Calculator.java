package edu.ncl.csc1035.methods;

public class Calculator {
    public static int add(int x, int y) {
        return x + y;
    }

    public static int add(int x, int y, int z){
        return x + y + z;

    }

    /*public static void something(String x, int y){}
    public static void something(int x, String y){}*/

    public static int subtract(int x, int y) {
        return x - y;
    }
    public static void main(String[] args) {
        int answer = add(5,19);
        System.out.println(answer);
        answer = add(answer, 5);
        System.out.println(answer);
        answer = add(answer, answer, answer);
        System.out.println(answer);
    }
}
