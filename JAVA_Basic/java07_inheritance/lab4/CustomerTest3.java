package java07_inheritance.lab4;

public class CustomerTest3 {

	public static void main(String[] args) {
		
		int price = 100000;
		
		Customer customerLee = new Customer(10010, "이순신");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.getName() + "님의 지불금액 " 
				+ customerLee.calPrice(price));
		
		VipCustomer customerKim = new VipCustomer(100, "김유신", 9999);
		customerKim.bonusPoint = 20000;
		System.out.println(customerKim.getName() + "님의 지불금액 " 
				+ customerKim.calPrice(price));
		
		Customer vc = new VipCustomer(111, "홍길동", 2000);
		vc.bonusPoint = 100000;
		System.out.println(vc.getName() + "님의 지불금액 " + vc.calPrice(price));


	}

}
