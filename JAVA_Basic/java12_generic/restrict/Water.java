package java12_generic.restrict;

public class Water extends Material{
	
	public void doPrinting() {
		System.out.println("물 재료로 프린팅합니다.");
	}

	@Override
	public String toString() {
		return "Material is Water";
	}

}
