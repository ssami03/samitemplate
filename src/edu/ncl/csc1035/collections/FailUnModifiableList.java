package edu.ncl.csc1035.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class FailUnModifiableList{
    public static void main(String[] args){
        List<String> l = new ArrayList<String>();
        l.add( "a" );
        l.add( "b" );
        l.add( "c" );

        // Crash l = Collections.unmodifiableList( l );

        l.add( "d" );
    }
}