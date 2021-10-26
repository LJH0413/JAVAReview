package java12_generic.ex02;

import java.util.Vector;

public class VectorEx {
	
	
	public static void main(String[] args) {

		
		Vector<Integer> v = new Vector<Integer>();
		
		v.add(5); //index 0
		v.add(4); //index 1
		v.add(-1); //index 2
		
		v.add(2, 100); //index 2에 100을 삽입.
		
		System.out.println("In Vector size: " + v.size());
		System.out.println("Capactiy Vector: " + v.capacity());
		System.out.println();
		
		
		System.out.println("Vector");
		for(Integer i : v) {
			System.out.print(i + " ");
		} System.out.println("\n");
		
		System.out.print("Sum of Vecotr: ");
		int sum = 0;
		for(Integer i : v) {
			sum += i;
		}
		System.out.println(sum);
		
	}

}
