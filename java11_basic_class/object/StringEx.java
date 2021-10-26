package java11_basic_class.object;

public class StringEx {
	
	public static void main(String[] args) {
		
		String str1 = new String("lee");
		String str2 = new String("lee");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1 == str2); //객체 비교시 객체의 번지를 비교
		System.out.println(str1.equals(str2)); // 값을 비교(문자열이 같은지)	
		
		String str3 = "son";
		String str4 = "son";
		
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
	}
}
