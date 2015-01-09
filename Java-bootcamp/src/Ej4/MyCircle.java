package Ej4;

import Ej3.MyPoint;

public class MyCircle {
	
	private int x = 0;
	private int y = 0;
	
	private MyPoint center;
	private int radius = 1;
	
	public MyCircle(int x,int y, int radius) {
		this.radius = radius;
	}
	
	public MyCircle(MyPoint center, int radius) {
		this.center = center;
		this.radius = radius;
	}
	public MyPoint getCenter() {
		return center;
	}
	public void setCenter(MyPoint center) {
		this.center = center;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
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
	
	public String toString(){
		return "Circle @ "+this.center.getX()+this.center.getY()+" radius "+this.radius;
		
	}
	public double getArea(){
		return Math.PI * Math.pow(this.radius, 2);
		
	}

}
