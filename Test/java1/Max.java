package Test.java1;

public class Max {
	public static void main(String[] args) {
		
	int max = 0;
	int[] array = {4, 5, 1, 2, 3};
	
	for(int i=0; i <array.length; i++) {
	    if(array[i] > max) {
	    	max = array[i];
	    }
	
	}
	
	System.out.println("Max: " + max);
	}
}
	
