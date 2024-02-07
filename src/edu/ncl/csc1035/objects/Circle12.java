package edu.ncl.csc1035.objects;

public class Circle12{
    int x,y,r;
    public double area(){
        return r * r * Math.PI;
    }
    public String report(){
        return String.format( "C(x,y,r,area): (%d,%d,%d,%4f)", x, y, r, area() );
    }

    public void printReport(){
        System.out.println( report() );
    }
    public boolean overlaps( Circle12 c ){
        double sSq = Math.pow(x - c.x, 2) +
                Math.pow(y - c.y, 2);
        int sumR = r + c.r;
        return sumR > Math.pow(sSq,0.5);
    }

    public static void main(String[] args){
        Circle12 c = new Circle12();
        c.r = 1;

        Circle12 d = new Circle12();
        d.x = 1;
        d.y = 1;
        d.r = 1;

        Circle12 e = new Circle12();
        e.x = 10;
        e.y = 10;
        e.r = 1;
        /*c.printReport();
        d.printReport();*/
        System.out.println( c.overlaps( d ) );
        System.out.println( d.overlaps( e ) );

    }


}
