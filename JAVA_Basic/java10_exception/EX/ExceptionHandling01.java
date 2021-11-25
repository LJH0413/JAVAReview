package java10_exception.EX;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling01 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("c.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e);
			//e.printStackTrace();
			System.out.println("catch block 작동");
		} finally { //when call try block {} finally block run no except, no condition but optional.
			System.out.println("finally block 실행");
		}
		System.out.println("프로그램 종료");
		
	}

}
