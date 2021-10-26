package java07_inheritance.abstract_calc;

public abstract class Calculator { //추상클래스: 프로젝트 설계자가 구현부 없이 선언만 함.
						  //구현은 개발자가
	
	
	//추상 매소드 	구현은 자식클래스에서 
	public abstract int add(int a, int b); 
	public abstract int substact(int a, int b);
	public abstract double average(int[] a);
	public abstract int times (int[] b); //배열 인풋을 받아 모두 곱하고 출력
	
}
