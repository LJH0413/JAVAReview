package Test.java1;

public class Lotte {

	public static void main(String[] args) {
		
		int lotte [] = new int[6];
		
		for(int i=0; i<lotte.length; i++) {
			lotte[i] = (int)(Math.random()*45);
			for(int j=0; j<i; j++) {
				if(lotte[i]==lotte[j]) {
					i--;
					break;
				}
			}
		}
		for(int k =0; k<lotte.length; k++) {
			System.out.println("로또 번호: " + lotte[k] ); 
		}
	}//main	

}//class
