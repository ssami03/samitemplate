package edu.ncl.csc1035.referenceTypes;

public class UsingButton {
    static Button b;
    public static void main(String[] args) {
        System.out.println(b);
        b = new Button();
        System.out.println(b);
        System.out.println(b.label);
        b.setLabel("No");
        System.out.println(b);
        System.out.println(b.label);

        Button a = new Button("Yes");
        Button b = new Button("Yes");
        Button c = b;
        System.out.println("a==b: " + (a==b));
        System.out.println("a==c: " + (a==c));
        System.out.println("b==c: " + (b==c));
        a = c;
        System.out.println("a==b: " + (a==b));
        System.out.println("a==c: " + (a==c));
        System.out.println("b==c: " + (b==c));
    }
}
