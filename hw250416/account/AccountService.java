package account;

public class AccountService {
	private Account[] accountList = new Account[100];
	private int count = 0;

	public boolean createAccount(String accountNumber, String accountHolder, int balance) {
		if (count >= 100)
			return false;
		accountList[count++] = new Account(accountNumber, accountHolder, balance);
		return true;
	}
	
	public boolean isValidAccount(String accountNumber) {
	    return selectAccount(accountNumber) == null;
	}


	public Account[] getAccounts() {
		return accountList;
	}

	public int getCount() {
		return count;
	}

	public Account selectAccount(String number) {
		for (int i = 0; i < count; i++) {
			if (accountList[i].getAccountNumber().equals(number)) {
				return accountList[i];
			}
		}
		return null;
	}

	public boolean depositToAccount(String number, int balance) {
	    Account acc = selectAccount(number);
	    if (acc != null) {
	        acc.deposit(balance);
	        return true;
	    }
	    return false;
	}
	
	public boolean withdrawFromAccount(String number, int amount) {
	    Account acc = selectAccount(number);
	    if (acc != null) {
	        return acc.withdraw(amount);  
	    }
	    return false;
	}
}
