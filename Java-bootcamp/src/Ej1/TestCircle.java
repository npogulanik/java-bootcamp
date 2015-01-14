package Ej1;

public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare and allocate an instance of class Circle called c1
	      //  with default radius and color
	      Circle c1 = new Circle();
	      // Use the dot operator to invoke methods of instance c1.
	      System.out.println("The circle has radius of " 
	         + c1.getRadius() + " and area of " + c1.getArea());
	   
	      // Declare and allocate an instance of class circle called c2
	      //  with the given radius and default color
	      Circle c2 = new Circle(2.0);
	      // Use the dot operator to invoke methods of instance c2.
	      System.out.println("The circle has radius of " 
	         + c2.getRadius() + " and area of " + c2.getArea());
	    
	      Circle c3 = new Circle(3.0,"red");
	      // Use the dot operator to invoke methods of instance c2.
	      System.out.println("The circle has radius of " 
	         + c2.getRadius() + " and area of " + c2.getArea()+ " color: "+c3.getColor());
	      
	      // c3.color=blue; The field Circle.color is not visible
	      
	      c3.setColor("blue");
	      System.out.println("the new color is: "+ c3.getColor());
	      
	      //4 mod
	      Circle c4= new Circle();
	      c4.setRadius(1.5);
	      c4.setColor("green");
	      
	      System.out.println(c4.toString());
	      
	      System.out.println(c2.toString());  // explicit call
	      System.out.println(c2);             // println() calls toString() implicitly, same as above
	      System.out.println("Operator '+' invokes toString() too: " + c2);  // '+' invokes toString() too
	}
	

}
