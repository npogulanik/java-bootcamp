package superclassShapePackage;

public class Rectangle extends Shape {
	
	private double width;
	private double length;
	
	public Rectangle(){
		width = 1.0;
		length = 1.0;		
	}
	
	public Rectangle(double width, double length){
		this.length = length;
		this.width = width;	
	}
	
	public Rectangle(double width, double length, boolean filled){
		this.length = length;
		this.width = width;	
		super.setFilled(filled);
	}
	
	public double getArea(){ 
		return( width * length);
    }
	
	public double getPerimeter(){
		return(2 * width + 2 * length);
	}
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public String toString(){
		return ("A Rectangle with width = " + width + "and length = "+ length +" , which is a subclass of " + super.toString());
	}
	

}
