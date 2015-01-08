

/*
 * @author Gonzalo H. Mendoza
 * Implementation of the Circle class
 */

public class Circle {

	//Attributes
	
	private double radius;
	private String color;
	
	//Making a constructor
	public Circle(){
		this.setRadius(1.0);
		this.setColor("Red");
	}

	public Circle(double p_radius){
		this.setRadius(p_radius);
		this.setColor("");
	}
	
	public Circle(double p_radius, String p_color){
		this.setRadius(p_radius);
		this.setColor(p_color);
	}
	//Making a setter and getter
	public void setRadius(double p_radius){
		if(p_radius > 0)
		{
			this.radius = p_radius;
		}
		else
		{
			this.radius = 1.0;
		}
	}
	
	public void setColor(String p_color){
		if(!p_color.isEmpty())
		{
			this.color = p_color;
		}
		else
		{
			this.color = "Red";
		}
	}
	
	public double getRadius(){
		return this.radius;
	}
	
	public String getColor(){
		return this.color;
	}
	
	//Computing the Circle area
	public double getArea(){
		return this.getRadius() * this.getRadius() * Math.PI;
	}
	
	//Override the toString method
	public String toString(){
		return "Circle: radius = " + this.getRadius() + "; color = " + this.getColor();
	}
}
