package edu.ncl.csc1035.inheritance;

public class UsingPerson {
    public static void main(String[] args) {
        Person p = new Person("Konrad", 18);
        UniversityPerson up = new UniversityPerson("Fred", 23, "Newcastle University");
        Student s = new Student("Jenny", 20, "Newcastle University", 1);
        Lecturer l = new Lecturer("Konrad", 19, "Newcastle University", "School of Computing");

        System.out.println(p);
        System.out.println(up);
        System.out.println(s);
        System.out.println(l);
    }
}
