import java.lang.String;

class DebitExceededException extends Exception {
	DebitExceededException() {
		super("Debit is greater than balance");
	}
}

class BankAccount {
	int balance;
	
	BankAccount() {
		// default balance
		balance = 100;
	}

	BankAccount(int bal) {
		balance = bal;
	}

	int withdraw(int debit) throws DebitExceededException {
		if (balance - debit < 0) {
			throw new DebitExceededException();
		} else {
			balance = balance - debit;
			System.out.println("Rs. " + debit + " successfully debited. Available balance is " + balance);
		}
		return 1;
	}
}

public class test {
	public static void main(String[] args) {
		BankAccount bank_account = new BankAccount(500);
		try {
			bank_account.withdraw(400);
			bank_account.withdraw(101); // -1
		} catch (Exception e) {
			System.out.println("Exception caught: " + e.getMessage());
		}
	}
}
