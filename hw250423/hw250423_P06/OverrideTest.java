package hw250423_P06;

public class OverrideTest {
	public static void main(String[] args) {
		Car c = new Car("파랑", 200, 1000, 5);
		c.show();

		System.out.println();
		Vehicle v = c;
		v.show();
	}
}

class Vehicle {
	static String color;
	static int speed;

	public Vehicle(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}

	static void show() {
		System.out.println("Vehicle{" + "color=" + color + ", speed=" + speed + '}');
	}
}

class Car extends Vehicle {
	static int displacement;
	static int gears;

	public Car(String color, int speed, int displacement, int gears) {
		super(color, speed);
		this.displacement = displacement;
		this.gears = gears;
	}

	static void show() {
		System.out.println("Car{" + "color=" + color + ", speed=" + speed + ", displacement=" + displacement
				+ ", gears=" + gears + '}');
	}
}