package java07_inheritance.lab4;

public class VipCustomer extends Customer {
	
	private int agentID;
	double saleRatio;
	
	public VipCustomer() { //기본 생성자
		//super(); //부모클래스의 생성자를 호출하는 
		grade = "VIP";
		bonusRatio = 0.05;  
		saleRatio = 0.1;
	}
	public VipCustomer(int customerID, String name, int agentID) { //
		super(customerID, name);
		grade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	
	public int calPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
		
	}
	public int getAgentID() {
		return agentID;
	}
	
}
