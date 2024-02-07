package edu.ncl.csc1035.exceptions;

// Status: Crash

import java.util.List;
import java.util.ArrayList;

public class FailException2{
    public static void main(String[] args){
        List l = new ArrayList();
        l.add( new String() );

        remove( l );
    }

    public static void remove(List<Integer> l){
        int i = l.get( 0 );
    }
}