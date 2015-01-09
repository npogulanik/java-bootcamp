/*
 * Modeling an triangle
 * @author Gonza
 */
public class MyTriangle {

	private MyPoint v1;
	private MyPoint v2;
	private MyPoint v3;
	
	//Making a large Constructor
	public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3){
		this.v1 = new MyPoint(x1,y1);
		this.v2 = new MyPoint(x2,y2);
		this.v3 = new MyPoint(x3,y3);
	}
	
	public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3){
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
	}
	
	public String toString(){
		return "MyTriangle: Point 1 = " + this.v1 + ", Point 2 = " + this.v2 + ", Point 3 = " + this.v3;
	}
	
	public double getPerimeter(){
		double d1 = this.v1.distance(this.v2);
		double d2 = this.v1.distance(this.v3);
		double d3 = this.v2.distance(this.v3);
		return d1+d2+d3;
	}
	
	public String printType()
	{
		String output = "";
		double d1 = this.v1.distance(this.v2);
		double d2 = this.v1.distance(this.v3);
		double d3 = this.v2.distance(this.v3);
		if(d1 == d2 && d1 == d3){
			output = "equilateral";
		}
		else{
			if(d1 == d2 || d1 == d3 || d2 == d3){
				output = "isosceles";
			}
			else{
				output = "escalene";
			}
		}
		return output;
	}
}
