package edu.ncl.csc1035.privacy;

public class UsingCircle {
    public static void main(String[] args){
        CircleByRadius c = new CircleByRadius();
        c.setRadius( 10 );

        CircleByArea d = new CircleByArea();
        d.setRadius( 10 );
        print( c, d );

        c.setArea( 10 );
        d.setArea( 10 );
        print( c, d );

    }

    public static void print( CircleByRadius c, CircleByArea d ){

        System.out.println( String.format( "Radius, Area: c(%s,%s); d(%s,%s)",
                c.getRadius(), c.getArea(),
                d.getRadius(), d.getArea() ) );
    }
}
