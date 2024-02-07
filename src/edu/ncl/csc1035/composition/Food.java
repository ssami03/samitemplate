package edu.ncl.csc1035.composition;

public class Food {
    private String name;
    private int amount;

    public Food(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }
}
