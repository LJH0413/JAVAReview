package Test;

public class BankAccount {

	//필드 
	private String ano;
	private String owner;
	private int balance;
	
	//생성자 
	public BankAccount(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}//public BankAccount
	
	
	//ano 
	public String getAno() {return ano;}

	public void setAno(String ano) {this.ano = ano;}

	//owner
	public String getOwner() {return owner;}

	public void setOwner(String owner) {this.owner = owner;}

	//balance
	public int getBalance() {return balance;}

	public void setBalance(int balance) {this.balance = balance;}
	

}
