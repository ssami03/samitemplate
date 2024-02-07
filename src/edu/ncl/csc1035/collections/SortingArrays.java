package edu.ncl.csc1035.collections;

import java.util.Arrays;

public class SortingArrays{
    public static void main(String[] args){
        String[] students = {"John", "Paul", "George", "Ringo"};

        System.out.println( "Before: " + Arrays.toString( students ) );

        String[] sortedStudents = Arrays.copyOf(students, students.length);
        Arrays.sort( sortedStudents );

        System.out.println( "After:  " + Arrays.toString( students ) );
        System.out.println( "Copy:   " + Arrays.toString(sortedStudents));
    }
}