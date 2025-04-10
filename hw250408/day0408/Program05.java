package day0408;

class Line {
	private int N;
	
	public Line(int N) {
		this.N = N;
	}
	
	public int getLine() {
		return N;
	}
	
	public boolean isSameLine(Line l) {
		return N == l.getLine();
	}
}

public class Program05 {
	public static void main(String[] args) {
		Line a = new Line(1);
		Line b = new Line(1);
		
		System.out.println(a.isSameLine(b));
		System.out.println(a==b);
	}
	
}
