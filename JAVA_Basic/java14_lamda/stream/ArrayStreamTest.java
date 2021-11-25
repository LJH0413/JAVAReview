package java14_lamda.stream;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayStreamTest {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
		
		System.out.println("=== Use Stream ===");
		Arrays.stream(arr).forEach(s -> System.out.print(s + " "));
		System.out.println("\n");
		
		System.out.println("=== Get Sum Useing Stream ===");
		int sum = Arrays.stream(arr).sum();
		System.out.println("sum: " + sum);
		System.out.println();
		
		System.out.println("=== Get Avg Useing Stream ===");
		double avg = Arrays.stream(arr).average().getAsDouble();
		System.out.println("avg: " + avg);
		System.out.println();
		
		ArrayList<Integer> ai = new ArrayList<Integer>();
		
		ai.add(1); ai.add(2); ai.add(3); ai.add(4); ai.add(5);
		
		System.out.println("=== Arraylist sum Useing stream ===");
		int sum1 = ai.stream().mapToInt(n -> n.intValue()).sum();
		System.out.println(sum1);
	}

}
