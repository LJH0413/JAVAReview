package java07_inheritance.abstract_calc;

public class GoodCalc extends Calculator{ //Calculator의 추상매소드를 구현하는 자식클래스

	//매소드의 구현은 메인메소드에 있으면 안됨.	
	@Override
	public int add(int a, int b) {
		return a + b;
	}
	
	@Override
	public int substact(int a, int b) {
		return a - b;
	}
	
	@Override				//int 자료형의 a 이름의 배열
	public double average(int[] a) {	//배열의 값을 할당 받아서 평균을 돌려주는 함수
		double sum = 0;
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		return sum/a.length;
	}
	
	@Override
	public int times(int[] b) {
		int t = 1;
		for(int i=0; i<b.length; i++) {
			t *= b[i];
		}
		return t;
	}
	
	
	
	public static void main(String[] args) {
		GoodCalc c = new GoodCalc();
		
		int[] cc = {4, 5, 6, 7, 8, 9};
		
		int[] dd = new int[5];
		dd[0] = 30; dd[1] = 40; dd[2] = 50;
		dd[3] = 60; dd[4] = 70; 
		
		
		System.out.println(c.add(2, 3));
		System.out.println(c.substact(10, 5));
		System.out.println(c.average(new int [] {2, 3, 4, c.add(2, 3), c.substact(10, 5)}));
		System.out.println(c.average(cc));
		System.out.println(c.average(dd));
		
		System.out.println(c.times(new int[] {2, 3, 4}));
	}

	

}
