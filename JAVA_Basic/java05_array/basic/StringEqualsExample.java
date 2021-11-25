package java05_array.basic;

public class StringEqualsExample {

	public static void main(String[] args) {
		
		//String은 변수로 저장하는 것이 아님
		//String으로 선언하면 스택에 string 메모리가 생성되고
		//heap 메모리에 변수가 생성되어 참조하는 것
		//String name = "이준희";
		// 객체  	-> 참조	변수
		
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		
		//static strVar1 strVar2 
		//heap        신용권
		
		if(strVar1 == strVar2) { //주소값비교
			System.out.println("parameter: strVar1 = strVar2");
		}else System.out.println("parameter: strVar1 != strVar2");

		if(strVar1.equals(strVar2)) { //문자열비교
			System.out.println("literal: strVar1, strVar2 same String");
		}
		
		String strVar3 = new String("신민철");
		String strVar4 = new String("신민철");
		
		//static strVar3 strVar4
		//heap    신민철   신민철 
		// new는 스택이 아닌 힙에 생
		
		if(strVar3 == strVar4) { //주소 값 비교
			System.out.println("parameter: strVar3 = strVar4");
		}else System.out.println("parameter: strVar3 != strVar4");

		if(strVar3.equals(strVar4)) { //문자열 비교
			System.out.println("literal: strVar3, strVar4 same String");
		}
	}

}
