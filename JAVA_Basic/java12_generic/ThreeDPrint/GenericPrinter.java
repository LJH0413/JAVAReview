package java12_generic.ThreeDPrint;

public class GenericPrinter<T>{
	//다양한 재료를 사용하는 프린터
	//다양한 객체 데이터타입을 받아서 처리

	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	public String toString() {
		return material.toString();
	}
	
	public void printing() {
//		material.doPrinting();
	}
}
