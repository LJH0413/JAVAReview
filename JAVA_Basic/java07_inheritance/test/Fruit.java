package java07_inheritance.test;

public class Fruit { //부모객체
	
	//필드
	protected String fruitName;
	protected String fruitColor;
	protected int fruitSize;
	//생성자
	public Fruit() {}
	
	public Fruit(String fruitName, String fruitColor, int fruitSize) {
		this.fruitName = fruitName;
		this.fruitColor = fruitColor;
		this.fruitSize = fruitSize;
	}
	
	//매소드
	public String ShowFruitInfo() {
		return "fruitName: " +  fruitName + " | " + "fruitColor: " + fruitColor + " | " + "fruitSize: " + fruitSize ;
	}
	
	public void PriceAndTaste() {
	}
	
	
	public String getFruitName() {
		return fruitName;
	}
	
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
	
	public String getFruitColor() {
		return fruitColor;
	}
	
	public void setFruitColor(String fruitColor) {
		this.fruitColor = fruitColor;
	}
	
	public int getFruitSize() {
		return fruitSize;
	}
	
	public void setFruitSize(int fruitSize) {
		this.fruitSize = fruitSize;
	}
	
}

