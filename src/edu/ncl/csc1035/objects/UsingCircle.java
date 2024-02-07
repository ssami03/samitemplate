package edu.ncl.csc1035.objects;

public class UsingCircle {
    public static void main(String[] args) {
        Circle c = new Circle(1,0,2);
        /*c.setX(0);
        c.setY(0);

        c.setRadius(2);*/

        c.printReport();

        c.setRadius(-10);
        c.printReport();
        System.out.println(c.getRadius());
        Circle d = new Circle(0,1,1);
        /*d.setX( 0 );
        d.setY( 1 );
        d.setRadius( 1 );*/
        System.out.println( c.overlaps( d ) );
        System.out.println( new Circle( 2, 3, 4 ).
                overlaps( new Circle( 12, 13, 14 ) ) );

    }
}
