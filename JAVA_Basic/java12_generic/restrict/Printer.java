package java12_generic.restrict;

public class Printer<T extends Material> {
	
	//<T extends Material> : 데이터 타입의 접근 제한 => Material을 상속받은 클래스만 사용
	
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return material.toString();
	}
	
	public void doPrinting() {
		material.doPrinting();
	}
	

}
