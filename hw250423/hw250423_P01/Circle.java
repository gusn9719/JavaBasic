package hw250423_P01;

public class Circle {
	int radius;

	void show() {
		System.out.printf("반지름이 %d인 원이다.\n", radius);
	}

	Circle(int radius) {
		this.radius = radius;
	}
}

class ColoredCircle extends Circle {
	String color;

	@Override
	void show() {
		System.out.printf("반지름이 %d인 %s 원이다.\n", radius, color);
	}

	ColoredCircle(int radius, String color) {
		super(radius);
		this.color = color;
	}
}
