package java01_datatype;

public class CharType {

	public static void main(String[] args) {
		char c1 = 'A', c2 = 65, c3 = 0B1000001;
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);		
		
		char c4 ='나';
		char c5 = '가';
		System.out.println("c4: " + c4);
		System.out.println("c4코드:" + (int)c4);
		System.out.println("c5:" + c5);
		System.out.println("c5코드:" +(int)c5);
		
		char c6 = 'ㄴ';
		char c7 = 'ㅏ';
		System.out.println("c6:" + c6);
		System.out.println("c6코드:" +(int)c6);
		System.out.println("c7:" + c7);
		System.out.println("c7코드:" +(int)c7);		
	}
	
}
