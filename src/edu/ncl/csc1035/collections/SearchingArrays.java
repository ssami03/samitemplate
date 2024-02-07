package edu.ncl.csc1035.collections;

import java.util.Arrays;

public class SearchingArrays{
    public static void main(String[] args){

        int[] i = {47, 61, 37, 59, 31, 13, 29, 3,
                19, 5, 71, 43, 2, 67, 7, 23, 11,
                53, 41, 17};

        System.out.println( "Search 1: " + Arrays.binarySearch( i, 59 ) );

        Arrays.sort( i );
        System.out.println( Arrays.toString( i ) );

        System.out.println( "Search 2: " + Arrays.binarySearch( i, 59 ) );

    }
}