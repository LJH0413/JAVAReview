package java10_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileNotFoundExcep {
	//예외처리
	//1. throws로 처리(예외를 미루는 것)
	//2. try/catch로 처리(

	public static void main(String[] args) { //1.throws: throws FileNotFoundException{
		
		FileInputStream fis = null;
		
		//2.try/catch
		try {
			fis = new FileInputStream("b.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e); //오류정보를 출력: 간략하게
			e.printStackTrace(); //오류정보를 출력: 아주 자세하게
			System.out.println("catch block 호출");
		}
		System.out.println("프로그램 종료");
		
	}
}

