package Ej1;

public class Circle {
    // save as "Circle.java"
		// private instance variable, not accessible from outside this class
		private double radius;
		private String color;
		
		// 1st constructor, which sets both radius and color to default
		public Circle() {
			radius = 1.0;
			color = "red";		}
		
		// 2nd constructor with given radius, but color default
		public Circle(double r) {
			radius = r;
			color = "red";
		}
		// Construtor to construct a new instance of Circle with the given radius and color
		public Circle (double r, String c) {
			radius = r;
			color = "red";
			}
		// A public method for retrieving the radius
		public double getRadius() {
			return radius; 
		}
		
		// A public method for computing the area of circle
		public double getArea() {
			return radius*radius*Math.PI;
		}
		public String getColor() {
			return color;

		}
		public void setRadius(double r) {
			   this.radius = r;
			}
		public void setColor(String c) {
			   this.color = c;
			}
		public String toString() {
			   return "Circle: radius=" + radius + " color=" + color;
			}
}
