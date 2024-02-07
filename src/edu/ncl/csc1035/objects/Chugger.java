package edu.ncl.csc1035.objects;

public class Chugger {
    public String name;
    public String colour;
    public String engine;
    public String type;
    public String role;

    public static void main(String[] args){
        Chugger wilson = new Chugger();
        wilson.name = "wilson";
        wilson.colour = "red";
        wilson.engine = "diesel";
        wilson.type = "EMD F3";
        wilson.role = "Trainee";

        Chugger brewster = new Chugger();
        brewster.name = "brewster";
        brewster.colour = "blue";
        brewster.engine = "diesel";
        brewster.type = "BR Class 55";
        brewster.role = "Trainee";

        Chugger koko = new Chugger();
        koko.name = "koko";
        koko.colour = "green";
        koko.engine = "electric";
        koko.type = "0 Series Shinkansen";
        koko.role = "Trainee";

        System.out.println(wilson);
    }
}
