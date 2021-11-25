package java07_inheritance.lab4;

public class Customer {	//고객정보를 나타내는 부모 클래스
	
	private int customerID; //고객 id
	private String name;	//고객 이름
	protected String grade;	//고객 등급
	int bonusPoint;
	double bonusRatio;
	
	public Customer( ) {
		grade = "Silver";
		bonusRatio = 0.01;
	}
	
	public int calPrice(int price) { //보너스 계산
		bonusPoint += price * bonusRatio;
		return price; 
	}
	
	public Customer(int customerID, String name) {
		this.customerID = customerID;
		this.name = name;
		grade = "Silver";
		bonusRatio = 0.01;
	}
	
	public String showCustomerInfo() {
		return name + "님의 등급은" + grade + "입니다. " + "보너스 포인트(" + bonusPoint + ")"; 
	}

	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
	
	

}
