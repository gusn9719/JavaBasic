package day0408;

class Car {
	private String color;
	static private int count = 0;
	static private int countRed = 0;

	public Car(String color) {
		this.color = color;
		count++;
		if (color.equalsIgnoreCase("red"))
			countRed++;
	}

	public static int getNumOfCar() {
		return count;
	}

	public static int getNumOfRedCar() {
		return countRed;
	}
}

public class Program04 {

	public static void main(String[] args) {
		Car c1 = new Car("red");
		Car c2 = new Car("blue");
		Car c3 = new Car("Red");

		System.out.printf("자동차 수 : %d, 빨간색 자동차 수 : %d\n", Car.getNumOfCar(), Car.getNumOfRedCar());
	}
}
