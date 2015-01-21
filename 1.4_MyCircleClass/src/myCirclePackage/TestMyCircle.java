package myCirclePackage;

public class TestMyCircle {

	public static void main(String[] args) {
		
		MyPoint p1 = new MyPoint(3,5);
		MyCircle c1 = new MyCircle(p1,6);
		System.out.println(c1);
		
		MyCircle c2 = new MyCircle(p1.getX(), p1.getY(),9);
		System.out.println(c2);
		
		
		
		
		
	}

}
