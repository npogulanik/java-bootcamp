package pontAndLinePackage;

public class LineSub extends Point {
	   
	   Point end;               
	   
	   public LineSub (int beginX, int beginY, int endX, int endY) {
	      super(beginX, beginY);             
	      this.end = new Point(endX, endY);  
	   }
	   
	   public LineSub (Point begin, Point end) { 
	      super(begin.getX(), begin.getY());     
	      this.end = end;
	   }
	   
	   public String toString() { 
		   return("The line starts at " + super.toString()+ " and ends at " + end.toString());
	   }

	  
	   public Point getBegin() {
		   Point aPoint = new Point(0,0);
		   aPoint.setX(super.getX());
		   aPoint.setY(super.getY());
		   return aPoint;
	   }
	   public Point getEnd() { 
		   return this;
	   }
	   
	   public void setBegin(int x, int y) { 
		   super.setX(x);
		   super.setY(y);
	   }
	   
	   public void setEnd(int x, int y) { 
		   this.setX(x);
		   this.setY(y);
	   }
	   
	   public int getBeginX() { 
		   return super.getX();
	   }
	   
	   public int getBeginY() { 
		   return super.getY();
	   }
	   
	   public int getEndX() {
		   return this.getX();
	   }
	   
	   public int getEndY() { 
		   return this.getY();
	   }
	   
	   public void setBeginX(int x) { 
		   super.setX(x);
	   }
	   
	   public void setBeginY(int y) {
		   super.setY(y);
	   }
	   
	   public void setBeginXY(int x, int y) {
		   super.setX(x);
		   super.setY(y);
	   }
	   
	   public void setEndX(int x) { 
		   this.setX(x);
	   }
	   
	   public void setEndY(int y) {
		   this.setY(y);
	   }
	   
	   public void setEndXY(int x, int y) { 
		   this.setX(x);
		   this.setY(y);
	   }
	   
	   public int getLength() { 
		   return (int)(Math.sqrt(Math.pow(super.getX() - super.getY(),2) + Math.pow(end.getX()-end.getY(), 2)));
	   }       
	   
	   public double getGradient() { 
		   return(Math.atan2(super.getX()-end.getX(), super.getY()-end.getY()));
	   }  
	   
}
