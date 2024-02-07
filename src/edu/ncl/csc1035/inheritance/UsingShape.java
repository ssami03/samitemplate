package edu.ncl.csc1035.inheritance;

public class UsingShape{
    public static void main(String[] args){
        Shape sh = new Shape();

        Circle c = new Circle();
        c.setX( 10 );
        c.setRadius( 3 );

        Rectangle r = new Rectangle();
        r.setY( 2 );
        r.setWidth( 4 );

        Square s = new Square();
        s.setX( 4 );
        s.setHeight( 4 );

        System.out.println
                ( String.format( "Circle (%s, %s, %s)", c.getX(),
                        c.getY(), c.getRadius() ) );

        System.out.println
                ( String.format( "Rectangle (%s, %s, %s, %s)", r.getX(),
                        r.getY(), r.getWidth(), r.getHeight() ) );

        System.out.println
                ( String.format( "Square (%s, %s, %s, %s)", s.getX(),
                        s.getY(), s.getWidth(), s.getHeight() ) );
    }
}
