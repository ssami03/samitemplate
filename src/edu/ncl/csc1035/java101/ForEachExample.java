package edu.ncl.csc1035.java101;


public class ForEachExample {
    public static void main(String[] args) {
        String[] days = {"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};

        for(int i = 0; i < days.length; i++) {
            System.out.println(days[i]);
        }

        for(String day: days) {
            System.out.println(day);
        }
    }
}
