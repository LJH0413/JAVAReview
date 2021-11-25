package java11_basic_class.object.clone;

public class ArrayCloneTest {
	
	public static void main(String[] args) {
		
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 ;
		
		arr2 = arr1.clone(); //배열복사할때는 배열.clone(); 로 사용
		
		System.out.println("copy Array(arr2):");
		for(int n : arr2) {
			System.out.print(n + " ");
		}
		System.out.println("\n");
		
		arr2[3] = 0;
		System.out.println("변경후 arr1 배열");
		for(int n : arr1) {
			System.out.print(n + " ");
		}
		System.out.println("\n");
		
		System.out.println("변경 후 arr2 배열");
		for(int n : arr2 ) {
			System.out.print(n + " ");
		}
		System.out.println("\n");
		
		System.out.println(System.identityHashCode(arr1));
		System.out.println(System.identityHashCode(arr2));
	}

}
