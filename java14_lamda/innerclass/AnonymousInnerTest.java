package java14_lamda.innerclass;

class Outer2 {
	
	Runnable getRunnable(int i) { //익명 내부클래스, 메소드 내에서 클래스 이름이 생략된 내부클래스 
		int num = 100;
		return new Runnable() {

			@Override
			public void run() {
				System.out.println(i);
				System.out.println(num);
			}
		};
	}
	
	Runnable runner = new Runnable() {
		@Override
		public void run() {
			System.out.println("Runnable이 구현된 익명 클래스 변수");
		}
	};
}

public class AnonymousInnerTest {
	
	public static void main(String[] args) {
		
		Outer2 o = new Outer2();
		
		Runnable ra = o.getRunnable(10);
		ra.run();
		
		o.runner.run();
	}

}
