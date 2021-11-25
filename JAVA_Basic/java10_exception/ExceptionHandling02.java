package java10_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling02 {
	//catch {} 내에서 return => { } 을 빠져나옴
	//finally { }

	public static void main(String[] args) {

		FileInputStream fis = null;

		try {
			fis = new FileInputStream("c.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e);
			//e.printStackTrace();
			System.out.println("catch block 작동");
			return;
		} finally { //when call try block {} finally block run no except, no condition but optional.
			System.out.println("finally block 실행");
		}
		System.out.println("프로그램 종료");

	}

}
