public class MyClomplex {
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
	
	public boolean equals( double real, imag real){
		return((this.real == real) && (this.imag == imag));
	}
	
	public boolean equals(MyComplex another){
		return((real == MyComplex.real)&& (imag == MyComplex.imag));
	}
	
	public double magnitude(){
		return(Math.sqrt(Math.pow(real, 2) * (Math.pow(imag, 2)));
	}
	
	public double argumentInRadians(){
		double argument ;
		argument = Math.atan2(real,imag);
		return Math.toRadians(argument);
	}
	
	public int argumentInDegrees(){
		 double y = this.argumentInRadians();
		 int x = (int)(360 / (2 * Math.PI))  y;
		 return x;
	}
	
	public MyComplex conjugate(){
		MyComplex conjugated = new MyComplex(this.real, (- this.imag));
		return conjugated;
	}
	
	public MyComplex add(MyComplex anoter){
		MyComplex addition = new MyComplex;
		addition.real = this.real + another.real;
		addition.imag = this.imag + another.imag;
		return addition;
	} 
	
	public String toString(){
		return "(" + real + " + "+ imag +"i)";
	}
}