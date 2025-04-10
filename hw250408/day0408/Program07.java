package day0408;

class GolfClub {
    private int num;
    private String name;

    public GolfClub() {
        this.num = 7;
        this.name = "아이언";
    }

    public GolfClub(int num) {
        this.num = num;
        this.name = "아이언";
    }

    public GolfClub(String name) {
        this.name = name;
        this.num = -1;
    }

    public void print() {
    	if(num != -1) System.out.print(num + "번 "); 
    	System.out.println(name + "입니다.");
    }
}

public class Program07 {
    public static void main(String[] args) {
        GolfClub g1 = new GolfClub();
        g1.print();
        
        GolfClub g2 = new GolfClub(8);
        g2.print();
        
        GolfClub g3 = new GolfClub("퍼터");
        g3.print();
    }
}