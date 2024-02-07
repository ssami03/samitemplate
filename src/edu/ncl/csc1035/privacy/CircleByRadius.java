package edu.ncl.csc1035.privacy;

public class CircleByRadius {
    private double r;

    public void setRadius( double r ){
        if( r < 0 ){
            throw new IllegalArgumentException( "Radius cannot be negative" );
        }
        this.r = r;
    }
    public double getRadius(){
        return r;
    }
    public double getArea(){
        return Math.pow( r, 2 ) * Math.PI;
    }
    public void setArea( double area ){
        if( area < 0 ){
            throw new IllegalArgumentException( "Area cannot be negative" );
        }
        this.r = Math.pow( area/Math.PI, 0.5 );
    }
}
