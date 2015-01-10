package Ej7;
public class TestMyPolynomial {
	public static void main(String[] args) {		
		MyPolinomial p1 = new MyPolinomial(1.1, 2.2, 3.3);
		double[] coeffs = {1.2, 3.4, 5.6, 7.8};
		MyPolinomial p2 = new MyPolinomial(coeffs);		
		System.out.println(p1.toString());
		System.out.println(p2.toString());		
		p1.multiply(p2);
	}
}
