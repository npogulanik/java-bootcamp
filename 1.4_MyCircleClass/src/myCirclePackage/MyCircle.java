package myCirclePackage;
import myCirclePackage.MyPoint;

public class MyCircle {
	
	private MyPoint center;
	private int radius;
	
	public MyCircle(MyPoint center, int radius){
		this.center = center;
		this.radius = radius;
	}
	
	public MyCircle(int centerX, int centerY, int radius){
		setCenterXY(centerX,centerY);
		this.radius = radius;
	}
	
	public MyPoint getCenter(){
		return center;
	}
	
	public int getCenterX(){
		return center.x;
	}
	
	public int getCenterY(){
		return center.y;
	}
	
	public void setCenter(MyPoint center){
		this.center = center;
	}
	
	public void setCenterXY(int x, int y){
		center.setX(x);
		center.setY(y);
	}
	
	public int getRadius(){
		return radius;
	}
	
	public void setRadius(int radius){
		this.radius = radius;
	}
	
	public String toString(){		
		return ("Circle @ (" + center.x +"," + center.y + ") radius = " + radius + ".");
	}
	
	public double getArea(){	
		return (Math.PI  *Math.pow(radius,2));
	}

}
