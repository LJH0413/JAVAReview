package Lamda;

@FunctionalInterface
interface Cal {
	public int min (int x, int y);
}

public class Lamda_Basic {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			public void run() {
				System.out.println("traditional disposable thread");
			}
		}).start();
		
		new Thread(() -> {
			System.out.println("lamda disposable thread");
		}).start();
		
		//추상 메소드의 구현
		Cal mn = (x, y) -> x > y? x : y;
		//함수형 인터페이스 사용
		System.out.println(mn.min(3, 4));
		System.out.println(mn.min(4, 5));
	}

}
