package java12_generic.ex02;

import java.util.Vector;

public class PointVectorEx {

	public static void main(String[] args) {
		
		Vector<Point> p1 = new Vector<Point>();
		
		//vector은 자바에서 제공하는 api
		//vector 라는 arrayList
		
		//쉽게 정리
		//vector라는 arrayList에 Point 객체를 저장
		//Point의 객체는 (x, y)	
		
		p1.add(new Point(2, 3));
		p1.add(new Point(-5, 20));
		p1.add(new Point(-7, -8));
		p1.add(new Point(2, -12));
		System.out.println(p1);
		
		//p1.remove(1) index 1번방의 객체를 삭제 
		
		
	}

}
