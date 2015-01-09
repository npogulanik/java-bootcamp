public class MyCircle {
	private MyPoint center;
	private int radius;
	
	public MyCircle(MyPoint center, int radius){
		this.center = center;
		this.radius = radius;
	}
	
	//public MyCircle(MyPoint.x center, MyPoint.y radius)
	
	public MyPoint getCenter(){
		return center;
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
		return "Circle @ (" + center.x +"," + center.y + ") radius =" + radius;
	}
	
}