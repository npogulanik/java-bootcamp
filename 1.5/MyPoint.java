/*
 * @author Gonzalo H. Mendoza
 */

public class MyPoint {

	private int x;
	private int y;
	
	//Making a default constructor
	public MyPoint(){
		x = 0;
		y = 0;
	}
	
	//Making another constructor
	public MyPoint(int x, int y){
		this.x = x;
		this.y = y;
	}

	
	//Getters and setters
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	//Setting a point with the two params
	public void SetXY(int x, int y){
		this.setX(x);
		this.setY(y);
	}
	
	public String toString(){
		return "Point: x = " + this.getX() + "; y = " + this.getY();
	}
	
	//Computing the distance between points with a coord param
	public double distance(int x, int y){
		int xDiff = this.x - x;
		int yDiff = this.y - y;
		return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
	}
	
	//Computing the distance between another point object
	public double distance(MyPoint point){
		int xDiff = this.x - point.getX();
		int yDiff = this.y - point.getY();
		return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
	}
}
