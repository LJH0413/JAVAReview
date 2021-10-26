package java10_exception.throwsEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException02 {
	
	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException { //Class 객체 Class class 
		FileInputStream fis = new FileInputStream(fileName); //클래스 전체 이름을 받아서 존재하는지 확인
		Class c = Class.forName(className); //클래스 전체 이름을 받아서 존재하는지 확인
		return c; //Class.forName(전체 클래스): 동적로딩이 지원됨.
				  // 동적로딩: 컴파일시 이름을확인하는 것이 아닌 실행시에 이름 확인.
	}

	public static void main(String[] args) {

		ThrowsException test = new ThrowsException();

		try {
			Class d = test.loadClass("a.txt", "java.lang.String");
			System.out.println(d.getClass());
			d.getClass();
		} catch (FileNotFoundException e) {
			System.out.println(e);
			System.out.println("파일이 없습니다");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
			System.out.println("클래스 파일이 없습니다");
		}
		System.out.println("프로그램 종료");
	}

}
