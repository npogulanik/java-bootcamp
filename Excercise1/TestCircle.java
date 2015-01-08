

public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				// Declare and allocate an instance of class Circle called c1
			      //  with default radius and color
			      //Circle c1 = new Circle(3.0,"black");
			      
			      // Use the dot operator to invoke methods of instance c1.
			     // System.out.println("The circle has radius of " 
			       //  + c1.getRadius() + " and area of " + c1.getArea());
			   
			      // Declare and allocate an instance of class circle called c2
			      //  with the given radius and default color
			      Circle c2 = new Circle(2.0);
			     
			      // Use the dot operator to invoke methods of instance c2.
			      System.out.println("The circle has radius of " 
			         + c2.getRadius() + " and area of " + c2.getArea());
				// TODO Auto-generated method stub
			      
			    
			      //System.out.println("The first circle is "+c1.getColor()+".");
			      //System.out.println("The second circle is "+c2.getColor()+".");
			      
			      Circle c3 = new Circle();   // construct an instance of Circle
			      c3.setRadius(5.0);          // change radius
			      c3.setColor("green");           // change color
			      
			      System.out.println("The circle has radius of " + c3.getRadius() + " and area of " + c3.getArea());
			      
			      System.out.println("The first circle is "+c3.getColor()+".");
			      
			     // Circle c1 = new Circle(5.0);
			     // System.out.println(c1.toString());
			      System.out.println(c2.toString());  // explicit call
			      System.out.println(c2);             // println() calls toString() implicitly, same as above
			      System.out.println("Operator '+' invokes toString() too: " + c2);  // '+' invokes toString() too
			}

	}


