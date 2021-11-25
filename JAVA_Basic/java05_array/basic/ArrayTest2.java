package java05_array.basic;

public class ArrayTest2 {

	public static void main(String[] args) {
		
		double[] data = new double[5]; //double 배열 변수 data 5개 방
		
		int size = 0;
		
		data[0] = 10.0; size++;
		System.out.println(size);
		
		data[1] = 20.0; size++;
		System.out.println(size);
		
		data[2] = 30.0;	size++;
		System.out.println(size);
		
		double sum = 0.0;
		double total = 1.0;
		
		for(int i = 0; i<data.length; i++) {
			System.out.println("data[i]: " + data[i]);
			sum +=data[i];
		}
		
		for(int i = 0; i < size; i++) {
			total *= data[i];
		}
		System.out.println("total: " + total);
		
		

	}

}
