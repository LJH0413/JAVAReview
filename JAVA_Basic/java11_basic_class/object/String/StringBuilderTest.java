package java11_basic_class.object.String;

public class StringBuilderTest {

	public static void main(String[] args) {
		
		//StringBuilder :단일쓰레드 환경에서 대량으로 문자열을 연결할 때 사용
		// 객체.append() 로 사용
		
		String str1 = new String("java");
		System.out.println("str1 문자열 주소: " + System.identityHashCode(str1));
		
		StringBuilder buffer = new StringBuilder(str1);
		System.out.println("연산전 buffer 메모리 주소:" + System.identityHashCode(buffer));
		//buffer 데이터를 다른 곳으로 전송하는 동안 보관하고 있는 메모리
		buffer.append(" and");
		buffer.append(" android");
		buffer.append(" Programming is fun!");
		
		System.out.println("연산 후 buffer 메모리 주소: " + System.identityHashCode(buffer));
		
		str1 = buffer.toString(); //buffer의 문자열 연결한 값을 str1 에 할
		System.out.println(str1);
		System.out.println("연결된 str1 문자열 주소: " + System.identityHashCode(str1) ); 
		
		buffer.append(" LJH");
		str1 = buffer.toString();
		System.out.println(str1);

	}

}
