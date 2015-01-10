package Ej7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyPolinomial {
	private double[] coeffs;
	private double[] otros;

	public MyPolinomial(double... coeffs) {
		this.coeffs = coeffs;
	}
	public int getDegree(){
		 int degree = this.coeffs.length;
		 return degree;
		}
	public MyPolinomial(String filename) {
		   Scanner in = null;
		   try {
		      in = new Scanner(new File(filename));  // open file
		   } catch (FileNotFoundException e) {
		      e.printStackTrace();
		   }
		   int degree = in.nextInt();      // read the degree
		   coeffs = new double[degree+1];  // allocate the array
		   for (int i=0; i<coeffs.length; ++i) {
		      coeffs[i] = in.nextDouble();
		   }
		} 
	public String toString(){
		String a = "";
		int num = this.coeffs.length;
		for (int i=0; i < this.coeffs.length; i++ ){
			a = a+ this.coeffs[i]+"x^"+(num-i)+" + ";
						
		}
		return a;		
	}
	public double evaluate(double x){ //No la Entiendo		
		double eva=0.0;
		return eva;
	}
	public MyPolinomial add(MyPolinomial another){
		otros = null;
		for (int i=0; i<coeffs.length; ++i) {
			otros[i]= this.coeffs[i]+another.coeffs[i];
			}
		MyPolinomial poly = new MyPolinomial (otros);
		return poly;		
	}
	
	public MyPolinomial multiply(MyPolinomial another){
		int length = 0;
		if (this.coeffs.length>another.coeffs.length) {
			length = this.coeffs.length;
		}else{
			length = another.coeffs.length;
		}
		for (int i=0; i<coeffs.length; ++i) {
			for (int j=0;j<coeffs.length; ++j) {
			otros[i]= this.coeffs[i]+another.coeffs[j];
		}}	
		MyPolinomial poly = new MyPolinomial (otros);
		return poly;
		}
}
