package java10_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling03 {
	
	public static void main(String[] args) { //finally{} 블락에 객체를 종료시

			FileInputStream fis = null;

			try {
				fis = new FileInputStream("e.txt");
			} catch (FileNotFoundException e) {
				System.out.println(e);
				//e.printStackTrace();
				System.out.println("catch block 작동");
				return;
			} finally { //when call try block {} finally block run no except, no condition but optional.
				System.out.println("finally block 실행");
				
				/*if(fis != null) {
					try {
						fis.close(); //객체를 메모리에서 제거
						System.out.println("객체 정상 메모리에서 제거");
					} catch (IOException e) {
						System.out.println("객체 정상 메모리에서 제거 안됨 (Null)");
						e.printStackTrace();
					} 
				} */
 				
			}
			System.out.println("프로그램 종료");

	}

}
