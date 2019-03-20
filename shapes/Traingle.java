package shapes;

import java.text.DecimalFormat;

import exceptions.ExceptionForTriangle;

public class Traingle implements Shape {
	
	private double side1;
	private double side2;
	private double base;
	
	public Traingle (double side1, double side2, double base) throws ExceptionForTriangle{
	//public Traingle (double side1, double side2, double base) throws IllegalArgumentException{
		if((side1 > 0) && (side2 > 0) && (base > 0) && (side1 < side2 + base) && (side2 < side1 + base) && (base < side1 + side2)) {
			
			
			//if(side1+ side2 > ) {
		this.side1 = side1;
		this.side2 = side2;
		this.base = base;
		}
		
		else 
	//		System.out.println("Invalid Side(s)");
		//{ throw new IllegalArgumentException ("Invalid Side(s)!");}
		throw new ExceptionForTriangle ();
	}
	
	//setters
	
	public void setSide1(double side1) {
		if(side1 > 0)
		this.side1= side1;
	}
	
	
	public void setSide2(double side2) {
		if(side2 > 0) {
		this.side2 = side2;
		}
	}
	
	//getters
	
	public double getSide2() {
		return side2;
	}
	
	public double getSide1() {
		return side1;
	}
	
	public double getBase() {
		return base;
	}
	
	
	//perimeter from Shape interface.
	@Override
	public double perimeters() { //???????????
		return ( getSide1() + getSide2() + getBase()); 
		
	}
	
	//tosTring Method
	 public String toString() {
		 DecimalFormat df = new DecimalFormat("###.###");
	        return "Triangle {s1= " + getSide1() + ", " + "s2=" + getSide2() + ", " + "s3=" +getBase() + " perimeter= " + df.format(perimeters()) + "}";// " + "perimeter = " + perimeters(); 
	 }

}
