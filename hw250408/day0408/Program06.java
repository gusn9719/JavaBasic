package day0408;

class Complex {
	private double real, ima;

	public Complex(double real) {
		this.real = real;
	}

	public Complex(double real, double ima) {
		this.real = real;
		this.ima = ima;
	}

	public void print() {
		System.out.println(real + " + " + ima + "i");
	}
}

public class Program06 {
	public static void main(String[] args) {
		Complex c1 = new Complex(2.0);
		Complex c2 = new Complex(1.5, 2.0);

		c1.print();
		c2.print();
	}
}
