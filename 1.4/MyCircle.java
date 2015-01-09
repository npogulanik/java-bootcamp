/*
 * @autor Gonzalo H. Mendoza
 */
public class MyCircle {

	private MyPoint center;
	private int radius;
	
	//Making a default constructor
	public MyCircle()
	{
		this.center = new MyPoint(0,0);
		this.radius = 1;
	}
	
	//Create a constructor 
	public MyCircle(int x, int y, int radius){
		this.center = new MyPoint(x,y);
		this.radius = radius;
	}
	
	public MyCircle(MyPoint point, int radius){
		this.center = point;
		this.radius = radius;
	}

	//Setters and getters
	public MyPoint getCenter() {
		return this.center;
	}

	public void setCenter(MyPoint center) {
		this.center = center;
	}

	public int getRadius() {
		return this.radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	//My methods to access to circle center
	public int getCenterX()
	{
		return this.center.getX();
	}
	
	public int getCenterY()
	{
		return this.center.getY();
	}

	public void setCenterXY(int x, int y)
	{
		this.center.SetXY(x, y);
	}

	public String toString()
	{
		return "Circle: radius = " + this.radius + "; Center: x = " + this.center.getX() + ", y = " + this.center.getY();
	}

	//Returning an area
	public double getArea()
	{
		return this.radius * this.radius * Math.PI;
	}
}
