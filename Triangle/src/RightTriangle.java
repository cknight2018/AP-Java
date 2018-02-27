/**
 * @(#)RightTriangle.java
 *
 *
 * @author 
 * @version 1.00 2018/2/26
 */


public class RightTriangle extends Triangle{

    public RightTriangle(double side){
    	super(side);
    }
    public double getPerimeter(){
    	return (2 + Math.sqrt(2.0)) * getSide();
    }
    public double getArea(){
    	return getSide() * getSide() / 2;
    }
}