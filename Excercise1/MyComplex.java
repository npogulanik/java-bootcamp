public class MyComplex {
	double real;
	double imag;
	
	public void  MyComplex(double real, double imag){
		this.real = real;
		this.imag = imag;
		
	}
	
	public void setReal(double real){
		this.real = real;
	}
	
	public double getReal(){
		return real;
	}
	
	public void setImag(double imag){
		this.imag = imag;
	}

	public double getImag(){
		return imag;
	}
	
	public String toString(){
		return "(" + real + " + "+ imag +"i)";
	}
}
