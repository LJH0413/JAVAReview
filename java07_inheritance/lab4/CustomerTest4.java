package java07_inheritance.lab4;

public class CustomerTest4 { //업캐스팅 

	public static void main(String[] args) {
		
		Customer vc = new VipCustomer(300, "홍길동", 9998);
		vc.bonusPoint = 30000;
		
		System.out.println(vc.getName() + "님의 지불금액 " + 
							vc.calPrice(10000) + "입니다.");
		

	}

}
