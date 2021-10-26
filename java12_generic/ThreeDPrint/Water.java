package java12_generic.ThreeDPrint;

public class Water {

	public void doPrinting() {
		System.out.println("물 재료로 프린트합니다.");
	}

	@Override
	public String toString() { //Plastic 객체 호출시 출력
		return "Material is Water";
	}

}
