/**
 * @(#)EquilateralTriangle.java
 *
 *
 * @author 
 * @version 1.00 2018/2/26
 */


public class EquilateralTriangle extends Triangle{

    public EquilateralTriangle(double side) {
    	super(side);
    }
    public double getPerimeter(){
    	return 3 * getSide();
    }
    public double getArea(){
    	return Math.sqrt(3) / 4 * getSide() * getSide();
    }
    
    
    
}