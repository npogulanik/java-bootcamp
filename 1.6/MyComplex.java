/*
 * Implements a Complex Number
 */
public class MyComplex {

	private double real;
	private double imag;
	
	//A Constructor simple
	public MyComplex(double real, double imag){
		this.real = real;
		this.imag = imag;
	}

	//Again: setters and getters
	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImag() {
		return imag;
	}

	public void setImag(double imag) {
		this.imag = imag;
	}
	
	public void setValue(double real, double imag){
		this.real = real;
		this.imag = imag;
	}
	
	public String toString(){
		return "(" + this.real + " + " + this.imag +"i)";
	}
	
	public boolean isReal(){
		return this.imag == 0;
	}
	
	public boolean isImag(){
		return this.real == 0;
	}
	
	public boolean equals(double real, double imag){
		return (this.real == real && this.imag == imag);
	}
	
	public boolean equals(MyComplex another){
		double real = another.getReal();
		double imag = another.getImag();
		return (this.real == real && this.imag == imag);
	}

	public double magnitude(){
		return Math.sqrt(this.real + this.imag); 
	}
	
	public double argumentInRadians(){
		return Math.atan2(this.imag, this.real);
	}
	
	public int argumentInDegrees(){
		double argument = this.argumentInRadians();
		return (int)((360/(2*Math.PI)) * argument);
	}
	
	public MyComplex conjugate(){
		return new MyComplex(this.real, -1 * this.imag);
	}
	
	public MyComplex add(MyComplex another){
		return new MyComplex(this.real + another.getReal(), this.imag + another.getImag());
	}
	
	public MyComplex substract(MyComplex another){
		return new MyComplex(this.real - another.getReal(), this.imag - another.getImag());
	}
	
	public MyComplex multiplyWith(MyComplex another){
		this.real = this.real * another.getReal() - this.imag * another.getImag();
		this.imag = this.real * another.getImag() + this.imag * another.getReal();
		return this;
	}
	
	public MyComplex divideBy(MyComplex another){
		double denominator = another.getReal() * another.getReal() + another.getImag() * another.getImag();
		this.real = (this.real * another.getReal() + this.imag * another.getImag()) / denominator;
		this.imag = (this.imag * another.getReal() - this.real * another.getImag())/denominator;
		return this;
	}
}
