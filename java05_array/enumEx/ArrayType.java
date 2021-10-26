package java05_array.enumEx;

public class ArrayType {
	
	public static void main(String[] args) {
		
		int[] intArray = {10, 20, 30, 40, 50};
		for(int i=0; i<intArray.length; i++) {
			System.out.println("intArray" + intArray[i]);
			System.out.printf("intArray [%d]:%d%n", i ,intArray[i]);
		}
		
		//new로 초기
		int[] intArray2;
		intArray2= new int[] {10, 20, 30, 40, 50};
		for(int i=0; i<intArray2.length; i++) {
			System.out.printf("intArray2 [%d]:%d%n", i,intArray2[i]);
		}
		
		System.out.println();
		//String 
		System.out.println("String 배열");
		String strArray[];
		strArray = new String[] {"이순신","강감찬", "김자바"};
		for(int i=0; i<strArray.length; i++) {
			System.out.printf("strArray [%d]:%s%n", i, strArray[i]);
		}
		
		System.out.println();
		
		int [][] intnArray = {{10,20,30,40,50},{60,70,80, 90, 100}};
		for(int i =0; i<intnArray[i].length; i++) {
			for(int j=0; j<intnArray[i].length; j++) {
				System.out.printf("%d, %d:%d%n", i, j, intnArray[i][j]);
			}
		}
	
		System.out.println("향상된 for문");
		
	}//main
}//class
