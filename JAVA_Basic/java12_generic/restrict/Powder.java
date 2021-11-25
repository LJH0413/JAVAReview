package java12_generic.restrict;

public class Powder extends Material{

	@Override
	public void doPrinting() {
		System.out.println("파우더 재료로 프린팅합니다.");
	}

	@Override
	public String toString() {
		return "Material is Powder";
	}

}
