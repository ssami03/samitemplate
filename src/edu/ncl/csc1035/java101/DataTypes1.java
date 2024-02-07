package edu.ncl.csc1035.java101;

public class DataTypes1 {
    public static void main(String[] args) {
        int i = 26;
        double d = 3.14;
        char c = 'a';
        boolean b = true;

        System.out.println(i);
        System.out.println(d);
        System.out.println(c);
        System.out.println(b);

        String s = "Hello";
        System.out.println(s);
        foo(5);

        String name = "Konrad";
        int cards = 52;
        boolean happy = true;
        float change = 2.5f;
        System.out.println(name);
        System.out.println(cards);
        System.out.println(happy);
        System.out.println(change);
    }
    public static void foo(int x) {
        x++;
        System.out.println(x);
        int j;
    }
}
