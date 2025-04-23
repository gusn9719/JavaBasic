package hw250423_P03;

public class PointTest {

	public static void main(String[] args) {
		Point p1 = new Point(10, 20);
		MovablePoint p2 = new MovablePoint(5, 10, 20, 50);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
	}
}
