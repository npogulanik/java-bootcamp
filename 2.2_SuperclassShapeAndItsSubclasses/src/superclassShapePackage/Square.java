package superclassShapePackage;

public class Square extends Rectangle{
	
	public Square(double side) {
		   super(side, side);
	}
	
	@Override
	public String toString(){
		return("A Square with side = " + super.getWidth()+", which is a subclass of " + super.toString());
	}
	
	@Override
	public void setLength(double side){ 
		super.setWidth(side);
		super.setLength(side);
	}
	
	@Override
	public void setWidth(double side){
		super.setWidth(side);
		super.setLength(side);
	}
}
