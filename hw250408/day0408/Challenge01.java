package day0408;

class Printer {
	int numOfPapers = 0;

	public void print(int amount) {
		System.out.println(numOfPapers - amount);
	}
}

public class Challenge01 {

	public static void main(String[] args) {
		Printer myPrint = new Printer();
		
		myPrint.numOfPapers = 100;
		myPrint.print(70);
	}

}
