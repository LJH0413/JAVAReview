package java12_generic.restrict;

public class PrinterTest {
	
	public static void main(String[] args) {
		
		System.out.println("===== 파우더 재료 프린팅 =====");
		Printer<Powder> powderPrinter = new Printer<Powder>();
		powderPrinter.setMaterial(new Powder()); //Powder 객체 생성
		System.out.println(powderPrinter); // =  System.out.println(powderPrinter.toString());
		powderPrinter.doPrinting();
		
		Powder powder = powderPrinter.getMaterial();
		System.out.println(powder);
		powder.doPrinting();
		System.out.println();
		
		System.out.println("===== 플라스틱 재료 프린팅 =====");
		Printer<Plastic> plasticPrinter = new Printer<Plastic>();
		plasticPrinter.setMaterial(new Plastic());
		System.out.println(plasticPrinter); 
		plasticPrinter.doPrinting();
		
		Plastic plastic = plasticPrinter.getMaterial();
		System.out.println(plastic);
		powder.doPrinting();
		System.out.println();
		
		//water class는 material 클래스를 상속받지 않아서 사용 불가
		
		System.out.println("===== 물 재료 프린팅 =====");
		Printer<Water> waterPrinter = new Printer<Water>();
		waterPrinter.setMaterial(new Water());
		System.out.println(waterPrinter);
		waterPrinter.doPrinting();

		Water water = waterPrinter.getMaterial();
		System.out.println(water);
		water.doPrinting();
	
	}


}
