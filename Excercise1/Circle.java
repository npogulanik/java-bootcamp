
public class Circle {
	// save as "Circle.java"
	// private instance variable, not accessible from outside this class
	private double radius;
	private String color;

	// 1st constructor, which sets both radius and color to default
	public Circle() {
		radius = 1.0;
		color = "red";
	}

	// 2nd constructor with given radius, but color default
	public Circle(double radius) {
		this.radius = radius;
		color = "red";
	}
	
	//3rd constructor with given radius and color
	public Circle(double radius, String color){
		this.radius = radius;
		this.color = color;
	}

	// A public method for retrieving the radius
	public double getRadius() {
		return radius; 
	}

	// A public method for computing the area of circle
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	//A public method to set the circle color
	public String getColor(){
		return color;
	}
	
	//A public method to modify the circle radius
	public void setRadius(double radius){
		this.radius = radius;
	}
	
	//A public method to modify the circle color
	public void setColor(String color){
		this.color = color;
	}
	
	public String toString() {
		  return "Circle: radius=" + radius + " color=" + color;
	}
}
