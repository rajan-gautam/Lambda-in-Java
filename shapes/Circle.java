package shapes;
import java.text.DecimalFormat;

import exceptions.ExceptionForCircle;

public class Circle implements Shape {
		private double radius;
		//private ShapeArea getArea;
				

	public Circle(double r) throws ExceptionForCircle{
		if(r > 0) {
			radius = r;
//			this.getArea =()->{
//				return Math.PI * this.getRadius();
//			};
//			
		}	
			else {
			throw new ExceptionForCircle();
		}
	}
	//setter
	public void setRadius(double radius) {this.radius = radius;	}
	
	public double getShapeArea() {
		ShapeArea getArea = () -> Math.PI * radius * radius;
		return getArea.area();
	}
	
	//getter
	public double getRadius() {	return this.radius;}
	
	@Override 
	public double perimeters() {return  2 * Math.PI * getRadius();}
	
	//toString
	 public String toString() {

		 DecimalFormat df = new DecimalFormat("###.###");
		 return "Circle {r=" + getRadius() + " Area:" + df.format(getShapeArea())+ "}";
		 
		// return "Circle {r=" + getRadius() + " Area:" + df.format(getShapeArea().area())+ "}";
	 	}

}
