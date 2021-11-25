package java05_array.arraylist.twodemension;

public class TwoDimension {

	public static void main(String[] args) {

		int[][] arr = {{1, 2, 3}, {4, 5, 6}}; // 2dimention []행 []열
		
		//int[][] arr = {{1, 2, 3}, {4, 5, 6}};
		//       1열    2열    3열 
		// 1행    1      2     3
		// 2행    4      5     6
		//arr.length = 행의 길이 arr[i].length = 열의 길
		
		
		//				2차원 배열일때 [행]
		for(int i = 0; i<arr.length; i++) {
			//						[열]
			for(int j = 0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+ "("+i +", " + j +")" +" " );
			}
			System.out.println();
			System.out.println("행의 길이: " + arr.length);
			System.out.println("열의 길이: " + arr[i].length);
		}
		arr	[1][2] = 300; //배열 방에 값을 할당 
		System.out.println(arr[1][2]); //배열 방의 값을 출력
		
		
	}

}
