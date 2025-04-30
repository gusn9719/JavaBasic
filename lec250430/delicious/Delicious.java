package lec250430.delicious;

public interface Delicious extends Edible, Sweetable{
	
}

interface Edible {
	void eat();
}

interface Sweetable {
	void sweet();
}