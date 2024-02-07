package edu.ncl.csc1035.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConvenienceList{
    public static void main(String[] args){
        List<String> l = new ArrayList<>();
        l.add( "a" );
        l.add( "b" );
        l.add( "c" );
        l.add( "d" );
        l.add( "e" );

        System.out.println( "List:\t\t" + l );
        System.out.println( "SubList:\t" + l.subList( 0, 2 ) );

        Collections.reverse( l );
        System.out.println( "Reverse:\t" + l );

        Collections.shuffle( l );
        System.out.println( "Shuffle:\t" + l );

        Collections.sort( l );
        System.out.println( "Sort:\t\t" + l );

        Collections.rotate( l, 3 );
        System.out.println( "Rotate:\t\t" + l );

        System.out.println( "Max:\t\t" + Collections.max( l ) );
    }
}
