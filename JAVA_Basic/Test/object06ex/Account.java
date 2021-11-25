package Test.object06ex;

public class Account {
	
	
	final int MIN_BALANCE = 0;
	final int MAX_BALANCE = 1000000;
	
	private int balance; //10000원 300000원
	private int balance1; //-100원 20000000원
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(balance < MIN_BALANCE || balance > MAX_BALANCE) {
			balance1 = balance;
		} else this.balance = balance;
	}
	
}
