package java11_basic_class.garbege;

public class Counter {
	private int no;
	
	public Counter(int no) {
		this.no = no;
	}

	//garbege collector 실행될때 사용되는 매소드는: finalize()	
	@Override
	protected void finalize() throws Throwable {
		System.out.println(no + "번째의 finalize() 가 실행됨 (객체 소멸됨)");
	}

		//garbege collector: 메모리 쓰레기 청소 System.gc();
		//java 가비지를 자동으로 청소
		//finalize(	) : 가비지 컬렉터가 청소하기 전 호출된는 메소드
		// 객체 소멸 직전에 호출되는 메소드
		// 객체 소멸자는 개체를 소멸하기 직전 finalize 매소드 호출
		
	}

