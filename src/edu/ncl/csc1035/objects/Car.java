package edu.ncl.csc1035.objects;

public class Car {
    private String make;
    private String model;
    private int mileage;
    private int age;

    public Car() {
        System.out.println("Creating a car");
    }

    public Car(String make, String model, int mileage, int age) {
        this.make = make;
        this.model = model;
        this.mileage = mileage;
        this.age = age;
    }

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
