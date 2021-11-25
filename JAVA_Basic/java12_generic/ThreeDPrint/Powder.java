package java12_generic.ThreeDPrint;

public class Powder{
	//genericprinter에 들어갈 자료
	
	
	public void doPrinting() {
		System.out.println("파우더 재료를 출력합니다.");
	}

	@Override
	public String toString() { //Powder 객체 호출시 출력
		return "Material is Powder";
	}
	
	

}
