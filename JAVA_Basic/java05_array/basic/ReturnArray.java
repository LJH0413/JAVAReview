package java05_array.basic;

public class ReturnArray {

	static int[] makeArray() {
		
		int temp[] = new int[4];//정수형 방 4개
		for(int i = 0; i<temp.length; i++) { // for문을 사용 각 방에 정수값을 할
			temp[i] = i; // 배열의 각방에 저장: 0 1 2 3
		}
		
		return temp;
	}
	
	public static void main(String[] args) {
		int intArray[];
		//int [] intArra; 도 가능 
		intArray = makeArray(); //메소드로부터 배열을 전달받
		for(int i =0; i<intArray.length; i++) {
			System.out.println(intArray[i] + " ");
		}
		intArray[0] = 50;
		intArray[1] = 60;
		intArray[2] = 70;
		intArray[3] = 80;
		
		for(int a : intArray) {
			System.out.println(a + " ");
		}
		
		intArray = ReturnArray.makeArray();
	}

}
