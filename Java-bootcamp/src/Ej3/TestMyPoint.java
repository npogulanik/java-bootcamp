package Ej3;

public class TestMyPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint p1=new MyPoint(5,5);
		MyPoint p2=new MyPoint(7,8);
		MyPoint p3=new MyPoint(8,8);
		MyPoint p4=new MyPoint(5,6);
		MyPoint p5=new MyPoint(7,9);
		MyPoint p6=new MyPoint(7,8);
		MyPoint p7=new MyPoint(9,8);
		MyPoint p8=new MyPoint(1,5);
		MyPoint p9=new MyPoint(2,3);
		MyPoint p10=new MyPoint(1,1);
		
		MyPoint[] points = new MyPoint[10]; // Declare and allocate an array of MyPoint
		
		for (int i = 0; i<10;i++) {
		   points[i] = new MyPoint(i+1,i+1);    // Allocate each of MyPoint instances
		}
		for (int i = 0; i<10;i++) {
			System.out.println(points[i].toString()); 
			
		}
		

	}

}
