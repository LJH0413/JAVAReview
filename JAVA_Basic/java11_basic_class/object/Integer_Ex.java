package java11_basic_class.object;

public class Integer_Ex {
	
	public static void main(String[] args) {

		//객체화 저장
		Integer i1 = new Integer (100);
		Integer i2 = new Integer (200);
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i1 == i2);
		
		//객체화 미실시 저장
		Integer i3 = 300;
		Integer i4 = 300;
		
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i3 == i4);
		
		
	}

}
