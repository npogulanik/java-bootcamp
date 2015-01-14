package Ej6;

public class MyComplex {
	private double real;
	private double imag;
	
	
	public MyComplex(double real, double imag) {
		super();
		this.real = real;
		this.imag = imag;
	}
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
		this.imag = imag;
		this.real = real;
	}
	public String toString(){
		return "("+this.real+" + "+this.imag+"i)";
	}
	public boolean isReal(){
		return (this.real==0);
	}
	public boolean isImaginary(){
		return (this.imag==0);
	}
	public boolean equals(double real, double imag){
		return (this.imag== imag & this.real==real);
	}
	public boolean equals(MyComplex another){
		return (this.imag==another.imag & this.real==another.real);
	}
	public double magnitude(){
		double mag = Math.sqrt(this.real+ this.imag) ;
		return mag;
	}
	public double argumenInRadians(){
		return Math.atan2(this.imag, this.real);
	}
	public double argumentInDegrees(){//COMPLETAR!!! en int
		return Math.atan2(this.imag, this.real);
	}
	public MyComplex conjugate(){
		return new MyComplex(real,-imag);
	}
	public MyComplex add(MyComplex another){
		return new MyComplex(this.real+another.real, this.imag+another.imag);
	}
	public MyComplex substract(MyComplex another){
		return new MyComplex(this.real-another.real, this.imag-another.imag);
	}
	public MyComplex multiplyWith(MyComplex another){
		return new MyComplex(
				((this.real*another.real)-(this.imag*another.imag)),
				((this.real*another.imag)+(this.imag*another.real))
				);
	}
	public MyComplex divideBy(MyComplex another){
		return new MyComplex (
				((this.real*another.real)-(this.imag*another.imag))/another.real*2,
				((this.real*another.imag)-(this.imag*another.real))/another.imag*2);
	}
	
	
}
