package java14_lamda.stream;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class InArrayTest {

	public static void main(String[] args) {
		
		int [] arr = {1, 2, 3, 4 , 5};
		
		int sumVal = Arrays.stream(arr).sum(); //배열의 모든 값을 더한값
	 	int count = (int) Arrays.stream(arr).count(); //배열의 방의 개수를 리턴
	 	double avgVal = Arrays.stream(arr).average().getAsDouble();
	 	int minVal = Arrays.stream(arr).min().getAsInt();
	 	int maxVal = Arrays.stream(arr).max().getAsInt();
	 	
	 	System.out.println(sumVal);
	 	System.out.println(count);
	 	System.out.println(avgVal);
	 	System.out.println(minVal);
	 	System.out.println(maxVal);
	 	
	}
}
