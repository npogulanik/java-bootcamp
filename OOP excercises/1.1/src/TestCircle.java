
public class TestCircle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Point of entry program

		//Declare c1 as circle with the default constructor
		Circle c1 = new Circle();
		System.out.println("The circle c1 has radius of " + c1.getRadius() + " and an area of " + c1.getArea());
		
		//Declare c2 as circle with the other constructor
		Circle c2 = new Circle(2.0);
		System.out.println("The circle c2 has a radius of " + c2.getRadius() + " and an area of " + c2.getArea());
		System.out.println(c2.toString());
		
		//Declare c3 to test the other constructor and setters
		Circle c3 = new Circle(5.0,"Blue");
		c3.setColor("Yellow");
		System.out.println(c3); //In this case the toString method is called 
	}

}
