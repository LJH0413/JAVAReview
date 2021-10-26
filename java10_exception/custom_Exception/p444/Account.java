package java10_exception.custom_Exception.p444;

public class Account {

	private long balance;
	
	public Account() {}

	public long getBalance() {
		return balance;
	}

	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) throws BalanceInsufficeientException{
		if(balance < money) {
			throw new BalanceInsufficeientException("잔고부족: " + (money-balance)+ "원 부족");
		}
		balance -= money;
	}
	
	
}
