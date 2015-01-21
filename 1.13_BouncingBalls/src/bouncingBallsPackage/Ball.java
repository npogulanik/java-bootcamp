package bouncingBallsPackage;

public class Ball {
	
	private float x;
	private float y;
	private float xDelta;
	private float yDelta;
	
	private int radius;
		
	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public float getxDelta() {
		return xDelta;
	}

	public void setxDelta(float xDelta) {
		this.xDelta = xDelta;
	}

	public float getyDelta() {
		return yDelta;
	}

	public void setyDelta(float yDelta) {
		this.yDelta = yDelta;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void setXY(float x, float y) {
		this.x = x;
		this.y = y;
	}

	public Ball(float x, float y, int radius, float direction, float speed){
		this.x = x;
		this.y = y;
		if ((-180 <= direction) && (direction <= 180)){
			xDelta = (float) (speed * Math.cos(direction));
			yDelta = (float) (- speed * Math.sin(direction));
		}
	}
	
	public void move(){
		x += xDelta;
		y += yDelta;
	}
	
	public void reflectHorizontal(){
		xDelta = -xDelta;
	}
	
	public void reflectVertical(){
		yDelta = -yDelta;
	}
	
	public String toString() {
		return ("Ball at ("+x+","+ y+") of velocity ("+xDelta+","+ yDelta+")");
	}
	
}

