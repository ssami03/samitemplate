package edu.ncl.csc1035.exceptions;

public class Circle22{
    private int r;
    public void setRadius( int r ){
        if( r < 0 ){
            throw new IllegalArgumentException("Radius must be positive");
        }
        this.r = r ;
    }

    public int getRadius(){
        return r;
    }

    public static void main(String[] args){
        Circle22 c = new Circle22();
        try {
            c.setRadius( -10 );
        }
        catch ( IllegalArgumentException iae ) {
            System.out.println("Caught exception first time");
        }
        try {
            c.setRadius( 10 );
        }
        catch ( IllegalArgumentException iae ) {
            System.out.println("Caught exception second time");
        }


        System.out.println( c.getRadius() );
    }
}
