package java14_lamda.innerclass;

class Outer3 {//외부 클래스(인스턴스)
	
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {
		int num = 100;
		
		return new Runnable(){
			int localNum = 10;

			@Override
			public void run() {
				System.out.println("i = " + i);
				System.out.println("num = " + num);
				System.out.println("localNum = " + localNum);
				
				System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스)");
				System.out.println("Outter.sNum = " + Outer4.sNum + "(외부 클래스 정적변수)");
			}
			};

	}
	
}

public class LocalInner2 {
	
	public static void main(String[] args) {
		Outer4 out = new Outer4();
		Runnable runner = out.getRunnable(10);
		runner.run();
	}

}
