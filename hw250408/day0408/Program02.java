package day0408;
import triangle.Triangle;
public class Program02 {

	public static void main(String[] args) {
		Triangle t1 = new Triangle(10.0, 5.0);
		Triangle t2 = new Triangle(5.0, 10.0);
		Triangle t3 = new Triangle(8.0, 58.0);
		
		System.out.println(t1.isSameArea(t2));
		System.out.println(t1.isSameArea(t3));
	}

}
