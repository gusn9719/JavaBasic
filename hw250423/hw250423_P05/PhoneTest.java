package hw250423_P05;

public class PhoneTest {
	public static void main(String[] args) {
		Phone[] phones = { new Phone("황진이"), new Telephone("길동이", "내일"), new Smartphone("민국이", "갤러그") };

		for (Phone p : phones) {
			if (p instanceof Smartphone) {
				((Smartphone) p).playGame();
			} else if (p instanceof Telephone) {
				((Telephone) p).autoAnswering();
			} else {
				p.talk();
			}

		}
	}
}


class Phone {
	protected String owner;
	
	public Phone(String owner) {
		this.owner = owner;
	}
	
	void talk() {
		System.out.println(owner + "가 통화 중이다.");
	}
}

class Telephone extends Phone {
	private String when;
	
	public Telephone(String owner, String when) {
		super(owner);
		this.when = when;
	}
	
	void autoAnswering() {
		System.out.println(owner + "가 없다. " + when + " 전화 줄래.");
	}
}

class Smartphone extends Telephone {
	private String game;
	
	public Smartphone(String owner, String game) {
		super(owner, game); // 부모 telephone이 when이 있어서 game이라는 값을 줘야함. 이거 나중에 해결하는 방법 찾아 봐야겠다..
		this.game = game;
	}
	
	void playGame() {
		System.out.println(owner + "가 " + game + "게임을 하는 중이다.");
	}
}



