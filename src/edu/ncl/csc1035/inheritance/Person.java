package edu.ncl.csc1035.inheritance;

import java.util.Objects;

public class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this(name,0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*@Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }*/
    public String toString() {
        return name + " - " + age;
    }

    public static Person valueOf(String person) {
        final String[] parts = person.split(" - ");
        final String name = parts[0].equals("null") ? null : parts[0];
        final int age = Integer.parseInt(parts[1]);
        return new Person(name, age);
    }

    public void printDetails(){
        // Prints information
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public void printDetails(String parameter){
        System.out.println("Parameter: " + parameter);
        // Prints information
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public boolean equals(Object rhs) {
        if (this == rhs) return true;
        if (!(rhs instanceof Person)) return false;
        Person p = (Person) rhs;
        return age == p.age && (name == null ? p.name == null : name.equals(p.name));
    }
    public int hashCode() {
        int hc = 17;
        hc = 37 * hc + (name == null ? 0 : name.hashCode());
        return 37 * hc + age;
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }*/
}
