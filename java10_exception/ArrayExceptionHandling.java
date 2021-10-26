package java10_exception;

public class ArrayExceptionHandling {
	
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		for(int i=0; i<=5; i++) { //exception발생, 배열의 방번호를 넘겨버림
			arr[i] = i;			  //ArrayIndexOutOfBoundsException: 배열의 방 번호를 넘었을 때 발생
			System.out.println(arr[i]);
		}
	}

}
