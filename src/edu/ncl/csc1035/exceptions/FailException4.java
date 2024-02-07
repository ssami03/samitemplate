package edu.ncl.csc1035.exceptions;

// Status: Crash

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class FailException4{
    public static void main(String[] args){
        List<String> l = new ArrayList<>();

        l = Collections.unmodifiableList( l );
        l.add( "Hello" );
    }
}
