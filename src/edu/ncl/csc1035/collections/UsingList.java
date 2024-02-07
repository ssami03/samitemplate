package edu.ncl.csc1035.collections;

import java.util.ArrayList;
import java.util.List;

public class UsingList {
    public static void main(String[] args) {
        List<String> studentName = new ArrayList<>();

        studentName.add("John");
        String s = studentName.get(0);
        System.out.println(s);

        int[] numbersArray = new int[10];

        List<Integer> numbersList = new ArrayList<>();
        numbersList.add(5);
        System.out.println("Length is: " + numbersList.size());
        numbersList.add(10);
        numbersList.add(42);
        int i = numbersList.get(0);
        System.out.println(i);
        System.out.println("Length is: " + numbersList.size());
        for(int n: numbersList) {
            System.out.println(n);
        }
    }
}
