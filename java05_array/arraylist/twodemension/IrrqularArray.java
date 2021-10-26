package java05_array.arraylist.twodemension;

public class IrrqularArray {

	public static void main(String[] args) {

		int intArray[][] = new int[4][]; //비정방형 배열선언 
		intArray[0] = new int[3];  //행의 인덱스 0에 열의 개수 선언: 3
		intArray[1] = new int[2];  //행의 인덱스 1에 열의 개수 선언: 2
		intArray[2] = new int[3];  //행의 인덱스 2에 열의 개수 선언: 3
		intArray[3] = new int[2];  //행의 인덱스 3에 열의 개수 선언: 2
		
		/*		1열	2열	3열
		 * 1행   o	 o	 o
		 * 2행   o	 o	 x
		 * 3행   o	 o	 o
		 * 4행   o	 o	 
		 */
		
		for(int i = 0; i<intArray.length; i++) { //배열의 각 방에 값을 입력
			for(int j = 0; j<intArray[i].length; j++) {
				intArray[i][j] = (i+1) * 10 + j;
			}//inner for
		}//outer for
		
		for(int i=0; i<intArray.length; i++) { //배열의 값 출력
			for(int j=0; j<intArray[i].length; j++) {
				System.out.print(intArray[i][j]+" ");
			}//inner for
			System.out.println(); //행을 나누는 것
		}//out for
	}

}
