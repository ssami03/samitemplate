package edu.ncl.csc1035.methods;

public class Person {
    String name;
    String job;
    boolean bearded;

    public Person(String name, String job, boolean bearded) {
        this.name = name;
        this.job = job;
        this.bearded = bearded;
    }

    public static void sayHello(){
        System.out.println("hello, world");
    }

    public static void sayHello(String something){
        System.out.println("Howdy, "+something);
    }

    public boolean isBearded() {
        return bearded;
    }

    public boolean shaveBeard() {
        if (bearded == true) {
            bearded = false;
            return true;
        } else {
            //System.out.println("No beard found");
            return false;
        }
    }


}
