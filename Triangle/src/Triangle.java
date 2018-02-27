


public abstract class Triangle{
	
  private double side;

  public Triangle(double side)
  {
    this.side = side;
  }
  public double getSide(){
  	return side;
  }
  public abstract double getPerimeter();

  public abstract double getArea();

  public double getRatio()
  {
    return getArea()/getPerimeter();
  }

  public static void main(String[] args)
  {
    Triangle equilateralTr = new EquilateralTriangle("equilateral", 12);
    Triangle rightTr = new RightTriangle("right", 12);
    System.out.println("Equilateral " + equilateralTr.getRatio());
    System.out.println("Right isosceles " + rightTr.getRatio());
  }
}