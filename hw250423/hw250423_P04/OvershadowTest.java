package hw250423_P04;

public class OvershadowTest {
	public static void main(String[] args) {
		Parent p = new Child();
		System.out.println(p.name); // 필드는 컴파일 타입 기준
		System.out.println(p.getName()); // 메서드는 런타임 객체 기준
		p.print();
		
		// 궁금해서 둘 다 사도세자가 나오게 하려면? 을 시도해봤다. 
		
		
	}
}

//class Parent {
//	String name = "영조";
//	
//	void print() {
//		System.out.printf("나는 %s이다.", name);
//	}
//}
//
//class Child extends Parent {
//	String name = "사도세자";
//	
//	@Override
//	void print() {
//		System.out.printf("나는 %s이다.\n", name );
//	}
//}

class Parent {
	String name = "영조";
	
	String getName() {
		return name;
	}
	
	void print() {
		System.out.printf("나는 %s이다.\n", getName()); // 이렇게 하면 자식의 name을 불러옴
	}
}

class Child extends Parent {
	String name = "사도세자";

	@Override
	String getName() {
		return name;  
	}
}
