package Ej3;

public class MyPoint {
	
	private int x = 0;
	private int y = 0;
	
	
	
	public MyPoint(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public double distance(int x, int y){
		int xDiff = this.x -x;
		int yDiff = this.y - y;
		return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
		
	}
	public double distance(MyPoint another) {
			int xDiff = another.getX() - x;
			int yDiff = another.getY() - y;
		   return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
		}
	 
	 public String toString(){
		 return "("+this.x+","+this.y+")";
	 }
	
	
	 
}
