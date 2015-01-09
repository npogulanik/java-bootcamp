
public class TestTriangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// My code of triangle test
		MyPoint p1 = new MyPoint(3,4);
		MyPoint p2 = new MyPoint(5,6);
		MyPoint p3 = new MyPoint(1,5);
		MyTriangle tri = new MyTriangle(p1,p2,p3);
		MyTriangle tri2 = new MyTriangle(1,2,4,6,4,8);
		
		System.out.println(tri);
		System.out.println(tri2);
		
		//Computing the perimeter of triangles
		System.out.println("Perimeter of first triangle: " + tri.getPerimeter());
		System.out.println("Perimeter of second triangle: " + tri2.getPerimeter());
		
		//Show the triangle type
		System.out.println("The first triangle is : " + tri.printType());
		System.out.println("The second triangle is : " + tri2.printType());
	}

}
