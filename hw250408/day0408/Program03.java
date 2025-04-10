package day0408;

class Member {
	private String name, ID, password;
	private int age;

	public Member(String name, String ID, String password, int age) {
		this.name = name;
		this.ID = ID;
		this.password = password;
		this.age = age;
	}

	public void setMember(String name, String ID, String password, int age) {
		this.name = name;
		this.ID = ID;
		this.password = password;
		this.age = age;
	}

	public void getMember() {
		System.out.printf("이름은 %s, 아이디는 %s, 비밀번호는 %s, 나이는 %d \n", name, ID, password, age);
	}
}

public class Program03 {
	public static void main(String[] args) {
		Member Chulsu = new Member("현우", "gusn", "qlqjs19", 27);
		Chulsu.getMember();

		Chulsu.setMember("임현우", "gusn97", "qlqjs11", 28);
		Chulsu.getMember();
	}

}
