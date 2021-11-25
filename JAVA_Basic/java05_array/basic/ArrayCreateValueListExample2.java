package java05_array.basic;

public class ArrayCreateValueListExample2 {

	public static void main(String[] args) {
		
		int[] scores;
		scores = new int[]{83, 90, 87};

		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		System.out.println("총합: " + sum);

		int sum2 = add (new int[] {83, 90, 87});
		System.out.println("총합2: " + sum2);
	}

	public static int add(int[] scores) {
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		return sum;
	}

}
