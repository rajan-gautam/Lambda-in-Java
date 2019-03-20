package shapes;
import exceptions.*;
import java.io.*;


public class Main {

	public static void main(String args[]) {
		
		/*-----------------------------------------------------------------------------------------------*/

		System.out.println("------->JAC 444 Assignment 1<-------");
		System.out.println("------->Task 1 ... <-------");

		String s;
		
		int shapesCreated = 0;
		Shape []shapeArray = new Shape[40];

		//reads file
		try (BufferedReader br = new BufferedReader(new FileReader(new File(args[0])))) {

			int i = 0;
			while ((s = br.readLine()) != null)

			{ String[] tokens = s.split(",");

			try {
				if(tokens[0].equals("Circle")) { //looks for circle; two fields
					if(tokens.length == 2) {

						double radius = Double.parseDouble(tokens[1]);
						//System.out.println(tokens[0] + ", " + radius);
						if(true) {
							shapeArray[i] = new Circle(radius);	
							i++;
							shapesCreated++;
						}
					}
				}

				if(tokens[0].equals("Parallelogram")) {
					if(tokens.length == 3) {
						double length = Double.parseDouble(tokens[1]);
						double width = Double.parseDouble(tokens[2]);
						shapeArray[i] = new Parellelogram(length, width);
						i++;
						shapesCreated++;
					}
				}

				if(tokens[0].equals("Rectangle")) {
					if(tokens.length == 3) {
						double length = Double.parseDouble(tokens[1]);
						double width = Double.parseDouble(tokens[2]);
						shapeArray[i] = new Rectangle(length, width);
						i++;
						shapesCreated++;
					}
				}
				if(tokens[0].equals("Square")){
					if(tokens.length == 2) {
						double length = Double.parseDouble(tokens[1]);
						if(true) {
							shapeArray[i] = new Square(length);
							i++;
							shapesCreated++;
						}
				}
				}if(tokens[0].equals("Triangle")) {
					if(tokens.length == 4) {
						double length = Double.parseDouble(tokens[1]);
						double width = Double.parseDouble(tokens[2]);
						double length1 = Double.parseDouble(tokens[3]);
						shapeArray[i]= new Traingle(length, width, length1);
						i++;
						shapesCreated++;
					}
				}

					} catch(ExceptionForCircle ex ) {
						System.out.println(ex.getMessage());
						continue;
						
					}catch(ExceptionForParellelogram ex) {
						System.out.println(ex.getMessage());
						continue;
					
					}catch(ExceptionForTriangle ex) {
						System.out.println(ex.getMessage());
						continue;
						}
				}
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}

		System.out.println( "\n" + shapesCreated + " shapes were created:\n");

		for( Shape arr : shapeArray) {
			if(arr != null)
				System.out.printf("%s perimeter = %.6g\n\n",arr, arr.perimeters()); 
		}

		System.out.println("**************************\n");
		System.out.println("------->Task 2 ... <-------\n");
		
		double maximunCirclePerim = 0.0;
		double minimumTrianglePerim = 0.0;
		
		for(Shape shape : shapeArray)
			if(shape instanceof Traingle) {
				minimumTrianglePerim = shape.perimeters();
				break;
			}
		
		//finding minimum and maximum perimeter
		//
		for( int i = 0; i < shapeArray.length; i++) {
			
			if(shapeArray[i] != null && shapeArray[i] instanceof Circle){
					if(shapeArray[i].perimeters() > maximunCirclePerim) 
						maximunCirclePerim = shapeArray[i].perimeters();
				}
			else if(shapeArray[i] != null && shapeArray[i] instanceof Traingle){
				if(shapeArray[i].perimeters() < minimumTrianglePerim) 
					minimumTrianglePerim = shapeArray[i].perimeters();
			}			
		}
		
		//deleting shapes with max and min perimeter.
		//
		for(int i = 0; i < shapeArray.length; i++) {
			if(shapeArray[i] != null) {
				if(shapeArray[i] instanceof Circle && shapeArray[i].perimeters() == maximunCirclePerim)
					shapeArray[i] = null; //deletion
					
			else if(shapeArray[i] instanceof Traingle && shapeArray[i].perimeters() == minimumTrianglePerim)
				shapeArray[i] = null; //deletion
			}
		}

			for(Shape arr : shapeArray) {
			if(arr != null)
				System.out.printf("%s perimeter = %.6g\n\n",arr, arr.perimeters()); //use g instead of f
		}
		
		//Total Perimeter of Parellelogram
		//Total Perimeter of Triangle
		System.out.println("*****************************\n");
		System.out.println("------->Task 3 ... <-------\n");
		
		double totalPerimeterOfParellelogram = 0.0;
		double totalPerimeterOfTriangle = 0.0;
		
		for(int i = 0; i < shapeArray.length; i++) {
			
			if(shapeArray[i] != null) {
				if (shapeArray[i] instanceof Parellelogram && !(shapeArray[i] instanceof Rectangle) && !(shapeArray[i] instanceof Square)) 
					totalPerimeterOfParellelogram += shapeArray[i].perimeters();											
				else if(shapeArray[i] instanceof Traingle)// && shapeArray[i].perimeters() > minimumTrianglePerim)
					totalPerimeterOfTriangle +=shapeArray[i].perimeters();
			}

		}
		
		System.out.println("Total perimeter of Parallelogram is: "+ totalPerimeterOfParellelogram); 
		System.out.println("Total perimeter of Triangle is: "+ totalPerimeterOfTriangle); 
	
		
		//lab 7
		//lamda	
		System.out.println("\n\n****Lab 7*************\n------->Task 4 ... <-------\n");
			
	
		for(Shape temp: shapeArray)	
			if(temp != null)
				System.out.println((temp + "\n"));
					
	}
	
}

	
	

