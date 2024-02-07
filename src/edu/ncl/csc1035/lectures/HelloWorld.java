package edu.ncl.csc1035.lectures;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        System.out.println(3*2-1);
        System.out.println(5*2-2*3);
        System.out.println(1-2*3);
        System.out.println(3*(2-1));
        int a = 2;
        a += 3; // a = a +3;
        int b;
        a += b = 2;
        // a += 1 = b = 2; //Crash
        System.out.println(a);
        System.out.println(b);
        //System.out.println(24 / (2 / 3)); // Crash
        System.out.println(24.0 / (2 / 3));
        System.out.println(24 / (2.0 / 3));
        System.out.println((int)(24 / (2.0 / 3)));

        System.out.println("Hello " + "Konrad\nDabrowski");
        System.out.println("Konrad" + 2 +2);
        System.out.println(2 + 2 + "" +2 +2);

        System.out.println(2 + 2  +2 +2);
        System.out.println(2 + 2 +2 +2 +"");
        System.out.println(""+2 + 2 +2 +2);
    }
}

