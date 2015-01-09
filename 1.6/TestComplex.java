
public class TestComplex {

	/**
	 * @param args
	 * @autor Gonza
	 */
	public static void main(String[] args) {
		// Implements a test class
		MyComplex c1 = new MyComplex(1.1,2.2);
		MyComplex c2 = new MyComplex(3.3,4.4);
		
		//Compare if both numbers are pure real
		if(c1.isReal()){
			System.out.println(c1 + " is a pure real number");
		}
		else{
			System.out.println(c1 + " is NOT a pure real number");
		}
		
		if(c2.isReal()){
			System.out.println(c2 + " is a pure real number");
		}
		else{
			System.out.println(c2 + " is NOT a pure real number");
		}
		
		//Compare if both numbers are imaginaries
		if(c1.isImag()){
			System.out.println(c1 + " is a pure imaginary number");
		}
		else{
			System.out.println(c1 + " is NOT a pure imaginary number");
		}
		
		
		if(c2.isImag()){
			System.out.println(c2 + " is an imaginarie number");
		}
		else{
			System.out.println(c2 + " is NOT a pure imaginary number");
		}
		
		//Compare if both numbers are equals
		if(c1.equals(c2)){
			System.out.println(c1 + " is equal to " + c2);
		}
		else{
			System.out.println(c1 + "is NOT equal to " + c2);
		}
		
		//Show the add methods
		System.out.println(c1 + " + " + c2 + " = " + c1.add(c2));
		
		//Show the substract method
		System.out.println(c1 + " - " + c2 + " = " + c1.substract(c2));
	}

}
