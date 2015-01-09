

public class TestCircle {

	public static void main(String[] args) {
		
			      //Circle c1 = new Circle(3.0,"black");
			      
			      
			     // System.out.println("The circle has radius of " 
			       //  + c1.getRadius() + " and area of " + c1.getArea());
			   
			      
			      Circle c2 = new Circle(2.0);
			     
			     
			      System.out.println("The circle has radius of " 
			         + c2.getRadius() + " and area of " + c2.getArea());
				
			      
			    
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
			      System.out.println(c2);             
			      System.out.println("Operator '+' invokes toString() too: " + c2);  
			}

	}


