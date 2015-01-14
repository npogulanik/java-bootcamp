package Ej6;
import java.util.Scanner;
public class MyComplexApp {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("-----My Complex App-----");
		System.out.println("Set the real part: ");
		double a = in.nextDouble();
		System.out.println("set the imag : ");
		double b = in.nextDouble();
		System.out.println("For the second number please set the real part: ");
		double c = in.nextDouble();
		System.out.println("set the imag: ");
		double d = in.nextDouble();
		
		MyComplex c1 = new MyComplex(a,b);
		MyComplex c2 = new MyComplex(c,d);
		System.out.println("the numbers are: "+ c1.toString()+" and "+c2.toString());
		
		System.out.println("1rst number is: " + c1.toString());
		
		if (c1.isReal()){
			System.out.println("this number is a pure real number");
			}else {
				System.out.println("this number is NOT a pure real number");
		}
		
		if (c1.getReal() == c2.getReal() & c1.getImag()==c2.getImag()) {
			System.out.println("the number "+c1.toString()+" and "+ c2.toString()+" are equals");
		}else{
			System.out.println("the number "+c1.toString()+" and "+ c2.toString()+" are NOT equals");
		}
		System.out.println("The product of the numbers is: "+c1.multiplyWith(c2));
		System.out.println("The conjugate number 1 is:"+(c1.conjugate()).toString() ); 
	}
}
