package print;

public class Printer {
	private int numOfPapers;
	private boolean duplex;

	public Printer(int numOfPapers) {
		this.numOfPapers = numOfPapers;
	}

	public Printer(int numOfPapers, boolean duplex) {
		this.numOfPapers = numOfPapers;
		this.duplex = duplex;
	}

	public void setDuplex(boolean duplex) {
		this.duplex = duplex;
	}

	public boolean getDuplex() {
		return duplex;
	}

	public void print(int amount) {
		int duplexAmount = (amount + 1) / 2;
		if (duplex) {
			if (numOfPapers >= duplexAmount) {
				numOfPapers -= duplexAmount;
				System.out.printf("양면으로 %d장 출력했습니다. 현재 %d장 남아 있습니다.\n", duplexAmount, numOfPapers);
			} else if (numOfPapers == 0) {
				System.out.println("용지가 없습니다.");
			} else {
				System.out.printf("모두 출력하려면 용지가 %d매 부족합니다. %d장만 출력합니다.\n", duplexAmount - numOfPapers, numOfPapers);
				numOfPapers = 0;
			}
		}

		if (!duplex) {
			if (numOfPapers >= amount) {
				numOfPapers -= amount;
				System.out.printf("단면으로 %d장 출력했습니다. 현재 %d장 남아 있습니다.\n", amount, numOfPapers);
			} else if (numOfPapers == 0) {
				System.out.println("용지가 없습니다.");
			} else {
				System.out.printf("단면으로 모두 출력하려면 용지가 %d매 부족합니다. %d장만 출력합니다.\n", amount - numOfPapers, numOfPapers);
				numOfPapers = 0;
			}
		}

	}

	// 2번 문제 print
//	public void print(int amount) {
//		if (numOfPapers >= amount) {
//			numOfPapers -= amount;
//			System.out.printf("%d장 출력했습니다. 현재 %d장 남아 있습니다.\n", amount, numOfPapers);
//		} else if (numOfPapers == 0) {
//			System.out.println("용지가 없습니다.");
//		} else {
//			System.out.printf("모두 출력하려면 용지가 %d매 부족합니다. %d장만 출력합니다.\n", amount - numOfPapers, numOfPapers);
//			numOfPapers = 0;
//		}
//	}

}
