package java06_object.static_ex;

public class TelevisionExample {

	public static void main(String[] args) {

		
		System.out.println(Television.info);
		System.out.println();
		
		Television tel = new Television(); //기본생성자 
		System.out.println(tel.info);
	}

}
