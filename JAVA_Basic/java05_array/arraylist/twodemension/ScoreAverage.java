package java05_array.arraylist.twodemension;

public class ScoreAverage {

	public static void main(String[] args) {

		//2차원 배열로 학년의 각 학기별로(1학기, 2학기)로 성적을 저장하고, 4년간 전체 평점 출력
		
		double[][] score = {{3.3, 3.4},  //1학년 1, 2학기 
							{3.5, 3.6},  //2학년 1, 2학기
							{3.7, 4.0},  //3학년 1, 2학기
							{4.1, 4.2}}; //4학년 1, 2학기
		
		double sum = 0;
		for(int year = 0; year<score.length; year++) { //학년 출력
			for(int term = 0; term<score[year].length; term++) { //학기 출력 
				sum += score[year][term]; //전체 학점
			}//inner for
		}//outer for	
		
		int n = score.length; //score 행의 개수: 4개
		int m = score[0].length; //score 열의 개수: 2개
		System.out.println("모든 학기 총합: " + sum);
		System.out.println("모든 학기 평균: " +sum/(n*m));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main

}//class
