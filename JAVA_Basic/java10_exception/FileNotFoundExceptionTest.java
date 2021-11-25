package java10_exception;

import java.io.FileInputStream;

public class FileNotFoundExceptionTest {

	public static void main(String[] args) {
		//파일에서 데이터를 가져오거나 읽거나 저장하는 유틸
		FileInputStream fis = null;
		
		try {
		fis = new FileInputStream("a.txt");
		} 
		catch(Exception e) {
			System.out.println(e); //오류정보를 출력
			System.out.println("예외 발생");
		}
		System.out.println("프로그램 정상 종료");
	}
}
