package java12_generic.ex01;

public class GenericMethod {
	
	public static <T, V> double makeRectange(Point<T, V> p1, Point<T, V> p2) {
		
		//doubleValue = 변수 값을 double형으로 변환
		double left = ((Number)p1.getX()).doubleValue();
		double right = ((Number)p2.getX()).doubleValue();
		double top = ((Number)p1.getY()).doubleValue();
		double bottom = ((Number)p2.getX()).doubleValue();
		
		double width = right - left;
		double hight = bottom - top;
		
		return width * hight;
	}
	

	public static void main(String[] args) {

		Point<Integer, Double> p1 = new Point<Integer, Double>(3, 1.2); 
		
		Point<Integer, Double> p2 = new Point<Integer, Double>(14, 10.9);
		
		double rect = GenericMethod.<Integer, Double>makeRectange(p1, p2);

		System.out.println("두점의 사각형 넓이는 " + rect);
	}

}
