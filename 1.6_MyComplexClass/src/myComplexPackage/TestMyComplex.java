package myComplexPackage;

public class TestMyComplex {

	public static void main(String[] args) {
		
		
		MyComplex aComplex = new MyComplex(2.2, 3.2);
		MyComplex anotherComplex = new MyComplex(9,0);
		MyComplex zeroComplex = new MyComplex(0,0);
		
		System.out.println( aComplex.multiplyWith(anotherComplex));
		System.out.println(aComplex.divideBy(anotherComplex));
		System.out.println(anotherComplex.divideBy(zeroComplex));
	
		
	}

}
