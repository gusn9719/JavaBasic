package app;

import java.util.Scanner;

import account.Account;
import account.AccountService;

public class BankApplication {
	Scanner sc = new Scanner(System.in);
	AccountService as = new AccountService();

	public void controlMenu() {
		int menu;
		do {
			menu = selectMenu();
			switch (menu) {
			case 1:
				menuCreateAccount();
				break;
			case 2:
				menuAccountList();
				break;
			case 3:
				menuDepositAccount();
				break;
			case 4:
				menuWithdrawAccount();
				break;
			case 5:
				System.out.println("프로그램 종료");
				break;
			default:
				System.err.println("잘못된 입력입니다.");
			}
		} while (menu != 5);
	}

	private void menuWithdrawAccount() {
		System.out.println("--------------");
		System.out.println("출금");
		System.out.println("--------------");

		System.out.print("계좌번호: ");
		String accountNumber = sc.next();
		System.out.print("출금액: ");
		int balance = sc.nextInt();
		
		if (as.withdrawFromAccount(accountNumber, balance)) {
		    System.out.println("결과: 출금이 성공되었습니다.");
		} else {
		    System.out.println("결과: 출금 실패 (계좌가 없거나 잔고 부족)");
		}
	}

	private void menuDepositAccount() {
		System.out.println("--------------");
		System.out.println("예금");
		System.out.println("--------------");

		System.out.print("계좌번호: ");
		String accountNumber = sc.next();
		System.out.print("예금액: ");
		int balance = sc.nextInt();

		if (as.depositToAccount(accountNumber, balance)) {
		    System.out.println("결과: 예금이 성공되었습니다.");
		} else {
		    System.out.println("결과: 계좌를 찾을 수 없습니다.");
		}
	}

	private void menuAccountList() {
		Account[] list = as.getAccounts();
		int count = as.getCount();
		System.out.println("--------------");
		System.out.println("계좌목록");
		System.out.println("--------------");
		for (int i = 0; i < count; i++) {
			System.out.println(list[i].toString());
		}
	}

	private void menuCreateAccount() {
		System.out.println("계좌생성");
		System.out.println("--------------");
		System.out.print("계좌번호: ");
		String accountNumber = sc.next();
		if (!as.isValidAccount(accountNumber)) {
			System.out.println("결과: 중복된 계좌번호입니다.");
			return; 
		}

		System.out.print("계좌주: ");
		String accountHolder = sc.next();
		System.out.print("초기입금액: ");
		int balance = sc.nextInt();

		
		as.createAccount(accountNumber, accountHolder, balance);
		System.out.println("결과: 계좌가 생성되었습니다.");

	}

	private int selectMenu() {
		String[] menuList = { "계좌 생성", "계좌 목록", "예금", "출금", "종료" };
		int menu;
		System.out.println("------------------------------------------------");
		for (int i = 0; i < menuList.length; i++) {
			if (i == menuList.length - 1) {
				System.out.print((i + 1) + "." + menuList[i] + "\n");
			} else {
				System.out.print((i + 1) + "." + menuList[i] + " | ");

			}
		}
		System.out.println("------------------------------------------------");
		System.out.print("선택 > ");
		menu = sc.nextInt();

		return menu;

	}

	public static void main(String[] args) {
		BankApplication app = new BankApplication();
		app.controlMenu();
	}

}
