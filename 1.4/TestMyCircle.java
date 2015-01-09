
public class TestMyCircle {
	/**
	 * @param args
	*  @author Gonzalo H. Mendoza
	 */
	public static void main(String[] args) {
		// Here I test my classes
		MyPoint point = new MyPoint(3,8);
		MyCircle aCircle = new MyCircle(point, 2);
		
		System.out.println(aCircle);
		System.out.println("Circle area: " + aCircle.getArea());
	}

}
