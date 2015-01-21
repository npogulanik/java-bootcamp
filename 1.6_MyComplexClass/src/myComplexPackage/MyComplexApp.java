package myComplexPackage;
import javax.swing.JOptionPane;

public class MyComplexApp {

	public static void main(String[] args) {
		
		String r1;
		String i1;
		String r2;
		String i2;
		
		r1 = JOptionPane.showInputDialog("Enter complex number 1 (real and imaginary part): e.g. 1.1 2.2"); 
		double real1 = Double.parseDouble(r1);
		i1 = JOptionPane.showInputDialog(" ");
		double imag1 = Double.parseDouble(i1);
		
		r2 = JOptionPane.showInputDialog("Enter complex number 2 (real and imaginary part): e.g. 3.3 4.4"); 
		double real2 = Double.parseDouble(r2);
		i2 = JOptionPane.showInputDialog(" ");
		double imag2 = Double.parseDouble(i2);
		
		MyComplex firstComplex = new MyComplex(real1,imag1);

		MyComplex secondComplex = new MyComplex(real2,imag2);
		
		System.out.println("Number 1 is: ");
		if(firstComplex.isReal()){
			System.out.println(firstComplex.toString()+ " is a pure real number");		
		}
		if(firstComplex.isImaginary()){
			System.out.println(firstComplex.toString()+ " is a pure imaginary number");
		}
		else{
			System.out.println(firstComplex.toString()+ " is NOT a pure real number");
			System.out.println(firstComplex.toString()+ " is NOT a pure imaginary number");
			
		}
		
		System.out.println("Number 2 is: ");
		if(secondComplex.isReal()){
			System.out.println(secondComplex.toString()+ " is a pure real number");		
		}
		if(secondComplex.isImaginary()){
			System.out.println(secondComplex.toString()+ " is a pure imaginary number");
		}
		else{
			System.out.println(secondComplex.toString()+ " is NOT a pure real number");
			System.out.println(secondComplex.toString()+ " is NOT a pure imaginary number");
		}
		
		if(firstComplex.equals(secondComplex)){
			System.out.println(firstComplex.toString()+ " is equal to" + secondComplex.toString());
		}
		else{
			System.out.println(firstComplex.toString()+ " is NOT equal to" + secondComplex.toString());
		}
		
		
	}

}
