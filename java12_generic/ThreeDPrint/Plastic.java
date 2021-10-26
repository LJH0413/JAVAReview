package java12_generic.ThreeDPrint;

public class Plastic{
	//genericPrint에 들어갈 재료
	
	public void doPrinting() {
		System.out.println("플라스틱 재료로 프린트합니다.");
	}

	@Override
	public String toString() { //Plastic 객체 호출시 출력
		return "Material is Plastic";
	}


}
