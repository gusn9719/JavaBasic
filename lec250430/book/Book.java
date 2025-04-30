package lec250430.book;

public class Book implements Comparable<Book>{
	int price;
	
	Book(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [price=" + price + "]";
	}
	
	@Override
	public int compareTo(Book b) {
		return this.price - b.price;
	}
	// 이거는 java.lang 에 있는 내장
	
}
