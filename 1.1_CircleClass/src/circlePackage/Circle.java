package circlePackage;

public class Circle {
	
	private double radius;
	private String color;

	public Circle() {
		radius = 1.0;
		color = "red";
	}

	public Circle(double radius) {
		this.radius = radius;
		color = "red";
	}
	
	public Circle(double radius, String color){
		this.radius = radius;
		this.color = color;
	}

	public double getRadius() {
		return radius; 
	}
	
	public double getArea(){
		double area = Math.PI  *Math.pow(radius,2);
		return area;
	}
	
}

