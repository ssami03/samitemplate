package edu.ncl.csc1035.inheritance;

public class UsingPerson2 {
    public static void main(String[] args) {
        Person a = new Person("Konrad Dabrowski" ,27);
        Person b = new Person("Konrad Dabrowski" ,27);
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(a.hashCode() == b.hashCode());

        System.out.println(a.toString());
        System.out.println(b.toString());
        // or simply
        System.out.println(a);
        System.out.println(b);
        System.out.println(Integer.toHexString(a.hashCode()));

        String str = "Konrad Dabrowski - 27";
        System.out.println(str.getClass());
        Person d = Person.valueOf(str);
        System.out.println(d.getClass());
        System.out.println(d.equals(a));
 /*       System.out.println(a.equals(b));



        System.out.println(a.equals(a));             // reflexive
        System.out.println(a.equals(null));          // test for null

        String name = new String("Konrad Dabrowski");
        System.out.println(a.equals(name));          // test for type

        System.out.println(a.equals(b));             // symmetric
        System.out.println(b.equals(a));

        Person c = new Person("Konrad Dabrowski", 27);
        System.out.println(a.equals(b));             // transitive
        System.out.println(b.equals(c));
        System.out.println(a.equals(c));

*/


        /* int p = 1;
        int q = 2;
        int max;
        if (p < q) {
            max = q;
        } else {
            max = p;
        }
        max = p<q ? q : p;*/
    }
}
