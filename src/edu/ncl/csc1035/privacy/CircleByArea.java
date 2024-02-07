package edu.ncl.csc1035.privacy;

public class CircleByArea {
    private double area;

    public double getArea(){
        return area;
    }
    public void setArea( double area ){
        if( area < 0 ){
            throw new IllegalArgumentException( "Area cannot be negative" );
        }
        this.area = area;
    }
    public double getRadius(){
        return Math.pow( this.area/Math.PI, 0.5 );
    }
    public void setRadius( double r ){
        if( r < 0 ){
            throw new IllegalArgumentException( "Radius cannot be negative" );
        }
        this.area = Math.pow( r, 2 ) * Math.PI;
    }
}
