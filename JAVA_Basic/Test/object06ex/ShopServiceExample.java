package Test.object06ex;

import java06_object.singleton.Singleton;

public class ShopServiceExample {

	public static void main(String[] args) {
		
		ShopService shopService1 = ShopService.getInstance();
		ShopService shopService2 = ShopService.getInstance();		
		
		if(shopService1 == shopService2) {
			System.out.println("같은 shopService 객체입니다.");
		}else System.out.println("다른 shopService 객체입니다.");
	}

	}


