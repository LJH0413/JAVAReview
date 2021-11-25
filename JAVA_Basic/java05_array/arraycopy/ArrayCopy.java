package java05_array.arraycopy;

public class ArrayCopy {

	public static void main(String[] args) {
		
		//배열의 복사: 배열은 초기에 배열방의 갯수가 선언되고 자동으로 늘어나지 않는다
		//배열의 더 많은 정보를 넣기 위해서는 새로운 배열을 만들고기존의 배열의 값을 복사
		
		int[] array1 = {10, 20, 30, 40, 50};
		int[] array2 = {1, 2, 3, 4, 5};
		int[] array3 = new int[10];
		int[] array4 = new int[20];
			
		System.arraycopy(array1, 0, array2, 1, 4); //System.arraycopy(복사할 원본, 원본주소, 복사할 대상, 복사 받을 주소	, 원본 주소로부터 복사할 배열 개수)
		
		System.arraycopy(array2, 0, array3, 0, 5);
		
		for(int i = 0; i<array2.length; i++) {
			System.out.println(array2[i]+ " ");
		}
		
		System.out.println("===================");
		
		for(int i = 0; i<array3.length; i++) {
			System.out.print(array3[i]+ " ");
		}
	}

}
