package hw250423_P03;

public class Point {
	private int x, y;
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Point[ x : " + x + ", y : " + y + "]";
	}
}

class MovablePoint extends Point {
	private int xSpeed, ySpeed;
	
	public int getXSpeed() {
		return xSpeed;
	}
	
	public int getYSpeed() {
		return ySpeed;
	}

	MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		super(x, y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	@Override
	public String toString() {
		return "MovablePoint [ x : " + getX() + ", y : " + getY() + ", xSpeed : " + xSpeed + ", ySpeed : " + ySpeed + "]";
	}
	
	
}
