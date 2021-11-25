package java07_inheritance.lab4.arraylist;

public class VipCustomer extends Customer {
	
	private int agentID;
	double saleRatio;
	
	public VipCustomer() { //기본 생성자
		super(); //부모클래스의 생성자를 호출하는 
		initCustomerVIP();
	}
	
	public VipCustomer(int customerID, String name, int agentID) { //
		super(customerID, name);
		initCustomerVIP();
		this.agentID = agentID;
	}
	

	private void initCustomerVIP() {//고객등급을 초기화하는 매소드
		grade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	
	@Override
	public int calPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
		
	}
	public int getAgentID() {
		return agentID;
	}
	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}
	
	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo()+ " / (담당상담원: " + agentID + ")";
	}
	
	
}
