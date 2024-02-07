package edu.ncl.csc1035.exceptions;

// Status: Crash

public class FailException{
    public static void main(String[] args){
        Object o = null;
        o.toString();
    }
}