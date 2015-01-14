package Ej4;

import Ej3.MyPoint;

public class TestMyCircle {
	public static void main(String[] args) {
		
		MyPoint p1 = new MyPoint(1,1);
		
		MyCircle c1=new MyCircle(p1, 3);
		System.out.println("Area: "+c1.getArea());
		System.out.println(c1.toString());
		c1.setRadius(99);
		
		System.out.println("Area: "+c1.getArea());
		System.out.println(c1.toString());
	}
}
