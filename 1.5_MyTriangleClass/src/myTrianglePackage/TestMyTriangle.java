package myTrianglePackage;

public class TestMyTriangle {

	public static void main(String[] args) {
		
		MyPoint p1 = new MyPoint(2,4);
		MyPoint p2 = new MyPoint(6,4);
		MyPoint p3 = new MyPoint(2,0);
		
		MyTriangle t1 = new MyTriangle( p1, p2, p3);
		System.out.println(t1.toString());
		System.out.println(t1.getPerimeter());
		System.out.println(t1.printType());
		
	}

}
