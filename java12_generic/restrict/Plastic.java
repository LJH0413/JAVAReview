package java12_generic.restrict;

public class Plastic extends Material{
	
	@Override
	public void doPrinting() {
		System.out.println("플라스틱 재료로 프린팅합니다.");
	}

	@Override
	public String toString() {
		return "Material is Plastic";
	}

}
