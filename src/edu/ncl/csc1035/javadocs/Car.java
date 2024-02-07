package edu.ncl.csc1035.javadocs;

/**
 * This class represents a car. It has methods relating to the abstraction of a car and some its behaviours.
 *
 * @author Konrad
 */
public class Car {
    private String make;
    private String model;
    private int mileage;
    private int age;

    public Car() {
        System.out.println("Creating a car");
    }

    /**
     * This constructor sets up all of the internal fields of a Car object.
     * @param make represents the make of the car
     * @param model represents the model of the car
     * @param mileage represents the mileage of the car in miles
     * @param age represents the age of the car in years
     */
    public Car(String make, String model, int mileage, int age) {
        this.make = make;
        this.model = model;
        this.mileage = mileage;
        this.age = age;
    }
    /* This is a normal comment, not a javadoc comment
    * It has multiple lines */

    // This is a single-line comment. It is not a javadoc comment.

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
        mileage = 0;
        age = 0;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getMake() {
        return make;
    }

    /**
     * Returns a human-readable version of a Car object
     * @return String representation of the car
     */
    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", mileage=" + mileage +
                ", age=" + age +
                '}';
    }
}
