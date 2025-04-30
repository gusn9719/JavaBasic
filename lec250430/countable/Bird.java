package lec250430.countable;

public class Bird implements Countable {
	private String name;
	private int num;
	
	public Bird(String name, int num) {
		this.name = name;
		this.num = num;
	}
	
	public void fly() {
		System.out.printf("%d마리 %s가 날아간다.\n", num, name);
	}
	
	@Override
	public void count() {
		System.out.printf("%s가 %d마리 있다.\n", name, num);
	}
}
