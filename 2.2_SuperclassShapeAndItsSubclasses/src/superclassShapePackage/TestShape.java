package superclassShapePackage;

public class TestShape {

	public static void main(String[] args) {
		
		Shape shape1  = new Shape();
		System.out.println(shape1.toString());
		
		Shape shape2  = new Shape("brown",false);
		System.out.println(shape2.toString());
		
		shape1.setFilled(false);
		shape2.setColor("blue");
		
		System.out.println(shape1.toString());
		System.out.println(shape2.toString());
		
		shape1.getColor();
		shape2.isFILLED();
		
	}

}
