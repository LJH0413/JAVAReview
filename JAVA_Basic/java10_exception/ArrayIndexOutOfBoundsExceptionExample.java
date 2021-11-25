package java10_exception;

public class ArrayIndexOutOfBoundsExceptionExample {

	public static void main(String[] args) {
		
		
		try {
			String data1 = args[0];
			String data2 = args[1];
			
			System.out.println("args[0]: " +data1);
			System.out.println("args[1]: " +data2);
			
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.print("예외 처리 부분: ");
			System.out.println(e); //오류정보 출력
			System.out.println("catch 작동");
		}
		System.out.println("프로그램 정상종료");
		
		
	}
}

