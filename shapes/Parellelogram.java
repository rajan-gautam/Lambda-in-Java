package shapes;

import java.text.DecimalFormat;

import exceptions.ExceptionForParellelogram;

public class Parellelogram implements Shape{
	
	private double height; 
	private double width;
//	private ShapeArea getArea;
	
	public Parellelogram(double h, double w) throws ExceptionForParellelogram {
		
		if((h > 0) && (w > 0)) {
			this.height = h;
			this.width = w;
			
			//workshop 7
			
				 
//			lambda = (double height, double width)->{ return (height * width);};
		}
		else {
			throw new ExceptionForParellelogram();
		}
	} 
	
	
	//setter height
	public void setHeight(double height) {this.height = height;	}
	
	//setter width
	public void setWidth(double width) {this.width = width;}
		
	//getter
	public double getHeight() {	return height;}
	
	//getter
	public double getWidth() {return width;}
	
	/*****lab 7******/
		
	@Override
	public double perimeters() {
		return (2 * getWidth() )+ (2 * getHeight()); //4L
	}
	
	@Override
	 public String toString() {
		 
//		 lambda = (rad1, rad2)->{
//			 return (Math.PI *(rad1 * rad2));
//			 };
			DecimalFormat df = new DecimalFormat("###.###");
		 
	        return "Parellelogram {w=" + getHeight()+ ", h=" + getWidth() + " perimeter=" + df.format(perimeters()) + "}";
	 }
}
