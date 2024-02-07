package edu.ncl.csc1035.inheritance;



public class Square extends Rectangle{

    public int getSide() {
        return getHeight();
    }
    public void setSide( int side ){
        super.setHeight(side);
        super.setWidth(side);
    }

    @Override
    public void setHeight(int height){
        setSide(height);
    }

    @Override
    public void setWidth(int width){
        setSide(width);
    }
}