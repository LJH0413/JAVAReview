package java07_inheritance.test;

public class Apple extends Fruit{
	
	private String taste = "Apple Taste";
	private int price = 1000;
	
	//생성자
	public Apple() {}

	
	public Apple(String fruitName, String fruitColor, int fruitSize) {
		super(fruitName, fruitColor, fruitSize);
	}


	@Override
	public void PriceAndTaste() {
		System.out.println("Apple: " + price + "원" + ", " + taste);
		
	}


	
	
	
	

}
