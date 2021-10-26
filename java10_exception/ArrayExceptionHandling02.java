package java10_exception;

public class ArrayExceptionHandling02 {

	public static void main(String[] args) {

		int[] arr = new int[5];

		try { //예외가 발생할 수 있는 코드 부분 입력
			for(int i=0; i<=5; i++) { //exception 발생
				arr[i] = i;
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e){ //catch(처리할 예외 타입 e) 
			//try블록 안에 예외가 발생했을 때 예외를 처리 하는 부분
			System.out.print("예외 처리 부분: ");
			System.out.println(e); //오류정보 출력
		}
		System.out.println("프로그램 정상 종료");
	}
}
