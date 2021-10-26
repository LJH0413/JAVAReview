package java07_inheritance.lab4.arraylist;

public class GoldCustomer extends Customer{
	
	double saleRatio;
	
	public GoldCustomer() {
		super();
		initCustomerGold();
	}
	
	public GoldCustomer(int customerID, String name) {
		super(customerID, name);
		initCustomerGold();
		}
	
	private void initCustomerGold() {//고객등급을 초기화하는 매소드
		grade = "Gold";
		bonusRatio = 0.025;
		saleRatio = 0.05;
	}
	@Override
	public int calPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	

}
