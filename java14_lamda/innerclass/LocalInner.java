package java14_lamda.innerclass;

class Outer {//외부 클래스(인스턴스)
	
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {
		int num = 100;
		
		class MyRunnable implements Runnable {
			int localNum = 10;

			@Override
			public void run() {
				System.out.println("i = " + i);
				System.out.println("num = " + num);
				System.out.println("localNum = " + localNum);
				
				System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스)");
				System.out.println("Outter.sNum = " + Outer.sNum + "(외부 클래스 정적변수)");
			}
				
			}
			return new MyRunnable();

	}
	
}

public class LocalInner {
//지역 내부 클래스: 익명 내부클래스 기반
	// 매소드 내에서 클래스를 정의 
	// 매소드가 호출될 때 사용, 호출끝나면 제거
	// 익명 내부 클래스: 지역 내부 클래스에서 클래스 이름을 생략한 것
	
	
	public static void main(String[] args) {
		
		Outer out = new Outer();
		Runnable runner = out.getRunnable(10);
		runner.run();
		
		
	}
}
