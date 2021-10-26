package java05_array.basic;

public class ForEachLoop {

	public static void main(String[] args) {
		
		String[] strarr = {"Java", "Android", "C", "JavScript", "Python"};
		
		
		for (int i = 0; i < 3; i++) { //조건을 사용해서 특정범위까지 출력
			System.out.println(strarr[i]);
		}
		
		System.out.println("=====Enhanced For=====");
		//향상된 for문  배열을 처음부터 끝까지 순환하면서 값을 출력할 경우
		for (String lang : strarr) {  
			System.out.println(lang);
		}
	}

}
