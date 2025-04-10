package triangle;

public class Triangle {
	private double bottom;
	private double height;

	public Triangle(double bottom, double heigth) {
		this.bottom = bottom;
		this.height = heigth;
	}

	public double findrea() {
		double result;
		result = (bottom * height) / 2;

		return result;
	}

	public String isSameArea(Triangle t) {
		double area = t.findrea();
		double area2 = this.findrea();

		if (area == area2)
			return "넓이가 같은 삼각형입니다.";
		else
			return "넓이가 다른 삼각형입니다!";

	}
}
