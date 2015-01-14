package Ej5;

import Ej3.MyPoint;

public class MyTriangle {
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	private int x3;
	private int y3;
	
	private MyPoint v1;
	private MyPoint v2;
	private MyPoint v3;
	
	
	
	public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
	}

	public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
	}

	public MyPoint getV1() {
		return v1;
	}

	public void setV1(MyPoint v1) {
		this.v1 = v1;
	}

	public MyPoint getV2() {
		return v2;
	}

	public void setV2(MyPoint v2) {
		this.v2 = v2;
	}

	public MyPoint getV3() {
		return v3;
	}

	public void setV3(MyPoint v3) {
		this.v3 = v3;
	}
	
	public String toString(){
		return "Triangle @ ("+ this.getV1().getX()+", "+this.getV1().getY()+"), ("+this.getV2().getX()+", "+this.getV2().getY()+"), "+this.getV3().getX()+", "+this.getV3().getY()+")";
				
	}
	public double getPerimeter(){
		double a = v1.distance(v2);
		double b = v2.distance(v3);				
		double c = v3.distance(v1);
		return a+b+c;
	}
	public String printType(){
		double a = v1.distance(v2);
		double b = v2.distance(v3);				
		double c = v3.distance(v1);
		
		if (a==b & b==c )  {
			return "equilateral";
					
		}else {
			if (a!=b & a !=c) {
				return "scalene";
				
			}else return "isosceles";
			
		}
	}
	
}
