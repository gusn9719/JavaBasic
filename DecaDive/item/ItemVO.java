package item;

public class ItemVO {

	private int itemCode; // 자동 생성 PK
	private String name; // 상품명
	private String decade; // "80s" | "90s" | "00s"
	private String category; // "WALL" | "DESK" | "TECH" | "COMICS" | "FASHION"
	private int price; // 가격(원)

	// --- 생성자 (DAO가 코드 부여) ---
	public ItemVO(String name, String decade, String category, int price) {
		this.name = name;
		this.decade = decade;
		this.category = category;
		this.price = price;
	}

	// --- getter / setter ---
	public int getItemCode() {
		return itemCode;
	}

	public String getName() {
		return name;
	}

	public String getDecade() {
		return decade;
	}

	public String getCategory() {
		return category;
	}

	public int getPrice() {
		return price;
	}

	public void setItemCode(int code) {
		this.itemCode = code;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDecade(String decade) {
		this.decade = decade;
	}

	public void setCategory(String cat) {
		this.category = cat;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return String.format("[%d] %s (%s | %s) - %,d원", itemCode, name, decade, category, price);
	}
}
