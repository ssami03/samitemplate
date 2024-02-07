package edu.ncl.csc1035.composition;

import java.util.ArrayList;
import java.util.List;

public class Fridge {
    private String name;
    private List<Food> items;

    public Fridge() {
        items = new ArrayList<>();
    }

    public Fridge(List<Food> items) {
        this.items = items;
    }

    public boolean addToFridge(Food f) {
        return items.add(f);
    }

    public boolean removeFromFridge(Food f) {
        if (items.contains(f)) {
            return items.remove(f); // Could just have had this line
        }
        return false;
    }

    @Override
    public String toString() {
        return "Fridge{" +
                                "items=" + items +
                '}';
    }

    public static void main(String[] args) {
        Food f1 = new Food("Milk", 1);
        Food f2 = new Food("Apple Juice", 2);
        Food f3 = new Food("Cheese", 5);

        Fridge myFridge = new Fridge();
        myFridge.addToFridge(f1);
        myFridge.addToFridge(f2);
        myFridge.addToFridge(f3);

        System.out.println(myFridge);
        myFridge.removeFromFridge(f3);
        System.out.println(myFridge);
    }
}
