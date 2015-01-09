
public class TestMyPoint {

	public static void main(String[] args) {
		public static void main(String[] args) {
			
		MyPoint p1 = new MyPoint(3, 0);
		MyPoint p2 = new MyPoint(0, 4);
		
		// Testing the overloaded method distance()
		System.out.println(p1.distance(p2));    // which version?
		System.out.println(p1.distance(5, 6));  // which version?
		*/
		int i;
		MyPoint[] points = new MyPoint[10]; // Declare and allocate an array of MyPoint
		
		for (i = 0; i < points.length; i++) {
		   points[i] = new MyPoint(i+1,i+1);    // Allocate each of MyPoint instances
		   System.out.println(points[i].getX()+","+points[i].getY());
		}
		//ARREGLAR BUCLE, FALTA 10,10
		points[7].toString();

	}

}
