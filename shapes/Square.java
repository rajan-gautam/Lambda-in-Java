package shapes;

import java.text.DecimalFormat;

import exceptions.ExceptionForParellelogram;

public class Square extends Rectangle{
	
	private ShapeArea getArea;
	
	public Square(double s) throws ExceptionForParellelogram { 
		
		super(s, s);
		this.getArea = ()->{
			 return this.getSides() * this.getSides() ;};
	}
	
	//setters
	public void setSides(double sides) {
		super.setHeight(sides);
	} 

	//getters
	public double getSides() {
		return super.getHeight();
	}
	
	
	//do we need to override the parameter() method of the interface here?
	
	@Override 
	public double perimeters() {
		return getSides() * 4; 
		
		
	}
	@Override
	 public String toString() {
		DecimalFormat df = new DecimalFormat("###.###");
	        return "Square {s=" + getSides()+ " Area:" + df.format(getArea.area())+ "}";// " + "perimeter = " + perimeters();
	 }

	
}
