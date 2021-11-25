package java10_exception.auto_close;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2 { //autoClose 사용 객체 해제

	public static void main(String[] args) {

		//fileinputstream은 cloneable 인터페이스구현하고 있음

		try (FileInputStream fis = new FileInputStream("/Users/junhee/input.txt")){
//			System.out.println((char)fis.read());//한글자씩 read	
		} catch (FileNotFoundException e) {
			System.out.println(e);
			//			e.printStackTrace();
		} catch (IOException e ) {
			System.out.println(e);
		} 
		System.out.println("프로그램 종료");
		



	}

}
