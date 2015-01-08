
<<<<<<< HEAD

=======
>>>>>>> ec710b9541f4cf25b134fa66b010e0cfa24239c1
/*
 * @author Gonzalo H. Mendoza
 * Implementation of the Circle class
 */

public class Circle {

	//Attributes
	
	private double radius;
	private String color;
	
	//Making a constructor
<<<<<<< HEAD
	public Circle(){
=======
	public Circle()
	{
>>>>>>> ec710b9541f4cf25b134fa66b010e0cfa24239c1
		this.setRadius(1.0);
		this.setColor("Red");
	}

<<<<<<< HEAD
	public Circle(double p_radius){
=======
	public Circle(double p_radius)
	{
>>>>>>> ec710b9541f4cf25b134fa66b010e0cfa24239c1
		this.setRadius(p_radius);
		this.setColor("");
	}
	
<<<<<<< HEAD
	public Circle(double p_radius, String p_color){
=======
	public Circle(double p_radius, String p_color)
	{
>>>>>>> ec710b9541f4cf25b134fa66b010e0cfa24239c1
		this.setRadius(p_radius);
		this.setColor(p_color);
	}
	//Making a setter and getter
<<<<<<< HEAD
	public void setRadius(double p_radius){
=======
	public void setRadius(double p_radius)
	{
>>>>>>> ec710b9541f4cf25b134fa66b010e0cfa24239c1
		if(p_radius > 0)
		{
			this.radius = p_radius;
		}
		else
		{
			this.radius = 1.0;
		}
	}
	
<<<<<<< HEAD
	public void setColor(String p_color){
=======
	public void setColor(String p_color)
	{
>>>>>>> ec710b9541f4cf25b134fa66b010e0cfa24239c1
		if(!p_color.isEmpty())
		{
			this.color = p_color;
		}
		else
		{
			this.color = "Red";
		}
	}
	
<<<<<<< HEAD
	public double getRadius(){
		return this.radius;
	}
	
	public String getColor(){
=======
	public double getRadius()
	{
		return this.radius;
	}
	
	public String getColor()
	{
>>>>>>> ec710b9541f4cf25b134fa66b010e0cfa24239c1
		return this.color;
	}
	
	//Computing the Circle area
<<<<<<< HEAD
	public double getArea(){
=======
	public double getArea()
	{
>>>>>>> ec710b9541f4cf25b134fa66b010e0cfa24239c1
		return this.getRadius() * this.getRadius() * Math.PI;
	}
	
	//Override the toString method
<<<<<<< HEAD
	public String toString(){
=======
	public String toString()
	{
>>>>>>> ec710b9541f4cf25b134fa66b010e0cfa24239c1
		return "Circle: radius = " + this.getRadius() + "; color = " + this.getColor();
	}
}
