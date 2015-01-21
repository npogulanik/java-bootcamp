package pontAndLinePackage;

public class TestLineSub {

	public static void main(String[] args) {
		
		LineSub l1 = new LineSub(0, 0, 3, 4);
	      System.out.println(l1);
	      System.out.println("Length: "+l1.getLength());
	      System.out.println("Gradient: " + l1.getGradient());
	   
	      Point p1 = new Point(30,50);
	      Point p2 = new Point(0,5);
	      Line l2 = new Line(p1, p2);
	      System.out.println(l2);
	      System.out.println("Length: "+l2.getLength());
	      System.out.println("Gradient: " + l2.getGradient());

	}

}
