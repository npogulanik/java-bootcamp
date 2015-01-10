
public class Room {
	
	private String color;
	private double longDeep;
	private double width;
	
	public Room()
	{
		this.color = "White";
		this.longDeep = 1.0;
		this.width = 1.0;
	}
	
	public double getArea(){
		return this.longDeep * this.width;
	}
	
	public String toString(){
		return "Room: long = " + this.longDeep + "; width = " + this.width + "; color = " + this.color;
	}

	//Getters and setters
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getLongDeep() {
		return longDeep;
	}

	public void setLongDeep(double longDeep) {
		this.longDeep = longDeep;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
}
