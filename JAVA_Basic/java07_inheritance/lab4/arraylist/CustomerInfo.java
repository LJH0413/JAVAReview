package java07_inheritance.lab4.arraylist;

import java.util.ArrayList;

public class CustomerInfo {

	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer lee = new Customer(10001, "Lee");
		Customer kim = new Customer(10002, "kim");
		Customer hong = new GoldCustomer(1001, "hong");
		Customer yul = new GoldCustomer(1002, "yul");
		Customer son = new VipCustomer(101, "son", 9999);

		customerList.add(lee);
		customerList.add(kim);
		customerList.add(hong);
		customerList.add(yul);
		customerList.add(son);
		
		System.out.println("=====고객정보 출력======");
		for(Customer c : customerList) {
			System.out.println(c.showCustomerInfo());
		}
		
		System.out.println();
		System.out.println("======보너스 포인트======");
		int price = 100000;
		
		for(Customer c1 : customerList) {
			int cost = c1.calPrice(price);
			System.out.println(c1.getName() + "님께서 " + cost + "원 지불");
			System.out.println(c1.getName() + "님의 보너스포인트: " + c1.bonusPoint);
		}
		
//		System.out.println(lee.showCustomerInfo());
//		
//		System.out.println(kim.showCustomerInfo());
//		
//		System.out.println(hong.showCustomerInfo());
//		
//		System.out.println(yul.showCustomerInfo());
//		
//		System.out.println(son.showCustomerInfo());
		
		
		
	}

}
