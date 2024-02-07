package edu.ncl.csc1035.objects;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car("Hyundai", "i20", 65000, 10);
        Car car2 = new Car("Fiat", "Punto", 100000, 21);
        System.out.println(car2.getMake());
        car2.setMake("Hyundai");
        System.out.println(car2.getMake());
        Car car3 = new Car();
        Car car4 = new Car("Ford", "Galaxy");
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4.toString());
    }
}
