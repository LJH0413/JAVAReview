package java10_exception.auto_close;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest1 { //autoClose 없이 객체 해제

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("/Users/junhee/input.txt");
			System.out.println((char)fis.read());//한글자씩 read	
			System.out.println((char)fis.read());//한글자씩 read	
			System.out.println((char)fis.read());//한글자씩 read	
		} catch (FileNotFoundException e) {
			System.out.println(e);
//			e.printStackTrace();
		} finally {
			try {
			fis.close();
			} catch (IOException e) {
				System.out.println(e);
			} catch (NullPointerException e) {
				System.out.println(e);
			}
		}

	}

}
