package day0408;

class Dice{
	private int face;
	
	public int roll() {
		face = (int)(Math.random()*6 + 1);
		return face;
	}
}

public class Program08 {
    public static void main(String[] args) {
    	Dice d = new Dice();
    	System.out.println(d.roll());
    }
}