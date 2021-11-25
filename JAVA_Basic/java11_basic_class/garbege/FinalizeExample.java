package java11_basic_class.garbege;

public class FinalizeExample {

	public static void main(String[] args) {
		
		Counter counter = null; //객체 생성
		
		for(int i=1; i<50; i++) {
			counter = new Counter(i);
			
			counter = null; // 객체를 쓰레기값으로 만듬
			
			System.gc();    // 가비지컬랙터 수동으로  호출
		}

	}

}
