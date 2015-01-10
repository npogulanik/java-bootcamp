package myPointPackage;

public class MyPointDemo {

	public static void main(String[] args) {
		int i;
		MyPoint[] points = new MyPoint[10]; 
		
		for (i = 0; i < points.length; i++) {
		   points[i] = new MyPoint(i+1,i+1);    
		   System.out.println(points[i].getX()+","+points[i].getY());
		}
		
	}

}
