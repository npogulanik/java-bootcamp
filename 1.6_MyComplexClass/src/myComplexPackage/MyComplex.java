package myComplexPackage;

public class MyComplex {
	double real;
	double imag;
	
	public MyComplex(double real, double imag){
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
	
	public void SetValue(double real, double imag){
		this.real = real;
		this.imag = imag;
	}
	
	public boolean isReal(){
		return(imag == 0);
	}
	
	public boolean isImaginary(){
		return(real == 0 );
	}
	
	public boolean equals( double real, double imag){
		return((this.real == real) && (this.imag == imag));
	}
	
	public boolean equals(MyComplex another){
		return((real == another.real)&& (imag == another.imag));
	}
	
	public double magnitude(){
		return (Math.sqrt(Math.pow(real, 2) * (Math.pow(imag,2))));
	}
	
	public double argumentInRadians(){
		double argument ;
		argument = Math.atan2(real,imag);
		return Math.toRadians(argument);
	}
	
	public int argumentInDegrees(){
		 double y = this.argumentInRadians();
		 int x = (int)((180 / Math.PI) * y);
		 return x;
	}
	
	public MyComplex conjugate(){
		MyComplex conjugated = new MyComplex(this.real, (-(this.imag)));
		return conjugated;
	}
	
	public MyComplex add(MyComplex another){
		MyComplex addition = new MyComplex(another.real, another.imag);
		addition.real = this.real + another.real;
		addition.imag = this.imag + another.imag;
		return addition;
	} 
	
	public String toString(){
		String label;
		label = "(" + real + " + "+ imag +"i)";
		return label;
	}
	
	public MyComplex multiplyWith(MyComplex another){
		this.real = (this.real * another.imag);
		this.imag = (this.imag * another.real);
		return this;		
	}
	
	public MyComplex divideBy(MyComplex another){
		if((another.real*2 +another.imag) != 0){
			this.real = (this.real * another.imag);
			this.imag = (this.imag * another.real);
			this.real = (another.real*2 +another.imag);
			this.real = (another.real*2 +another.imag);
			return this;
		}
		else{
			return null;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}	