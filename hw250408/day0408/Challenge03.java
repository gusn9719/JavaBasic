package day0408;

import print.Printer;

public class Challenge03 {

	public static void main(String[] args) {
		Printer p = new Printer(20, true);
		
		p.print(25);
		p.setDuplex(false);
		p.print(10);
	}

}
