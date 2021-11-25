package java07_inheritance.lab4;

public class CustomerTest1 {

	public static void main(String[] args) {
//		Customer customerLee = new Customer(); //부모객체(customer)생성
//		customerLee.setCustomerID(10010);
//		customerLee.setName("이순신");
//		customerLee.bonusPoint = 1000;
//		System.out.println(customerLee.showCustomerInfo());

		System.out.println();

		VipCustomer customerKim = new VipCustomer(); //자식객체(VIP) 생성
		customerKim.setCustomerID(100);
		customerKim.setName("김유신");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
		System.out.println();
		
		VipCustomer customerHong = new VipCustomer(101, "홍", 999);
		System.out.println(customerHong.showCustomerInfo());
		
	}

}
