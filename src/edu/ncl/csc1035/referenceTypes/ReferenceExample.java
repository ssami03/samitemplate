package edu.ncl.csc1035.referenceTypes;

public class ReferenceExample {
    String s;
    public static void main(String[] args) {
        ReferenceExample r = new ReferenceExample();
        System.out.println(r.s instanceof String);
        System.out.println(r.s);
        r.s = "Something";  // r.s = new String("Something");
        System.out.println(r.s instanceof String);
        System.out.println(r.s);
        r.s = "";
        System.out.println(r.s instanceof String);
        System.out.println(r.s);
        r.s = null;
        System.out.println(r.s instanceof String);
        System.out.println(r.s);
        r.s = "null";
        System.out.println(r.s instanceof String);
        System.out.println(r.s);

        Object o = new Object();
        System.out.println(o instanceof ReferenceExample);
        System.out.println(o instanceof String);
        System.out.println(r instanceof Object);
    }
}
