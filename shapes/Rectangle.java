package shapes;

import java.text.DecimalFormat;

import exceptions.ExceptionForParellelogram;

public class Rectangle extends Parellelogram {
	
	
		public Rectangle(double height, double width) throws ExceptionForParellelogram {
			super(height, width);
		}
		
		public double getShapeArea() {
			
			ShapeArea shapeArea = () -> getWidth() * getHeight();
				
			return shapeArea.area();
		}
		
			@Override
		public String toString() {
				DecimalFormat df = new DecimalFormat("###.###");
		        return "Rectangle {w=" + getHeight()+ ", h= " + getWidth() + " Area:" + df.format(getShapeArea())+"}";
		 }
}
