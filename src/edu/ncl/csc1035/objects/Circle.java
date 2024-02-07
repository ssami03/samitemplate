package edu.ncl.csc1035.objects;

public class Circle {
    private int x;
    private int y;
    private int r;

    public Circle(int x, int y, int r) {
        setX( x );
        setY( y );
        setRadius( r );
    }

    public Circle() {
    }

    public void setRadius(int r ){
        this.r = Math.abs( r );
    }

    public int getRadius() {
        return r;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getArea() {
        return r * r * Math.PI;
    }

    public String report() {
        return "Circle has coords (" + x + " " + y +
                ") with a radius of " + r + " and an area of " + getArea();
    }

    public void printReport(){
        System.out.println( report() );
    }
    public boolean overlaps( Circle c ){
        double sSq = Math.pow(x - c.x, 2) +
                Math.pow(y - c.y, 2);
        int sumR = r + c.r;
        return sumR > Math.pow(sSq,0.5);
    }
}
