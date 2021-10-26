package java12_generic.ThreeDPrint;

public class GenericPrinterTest {

	public static void main(String[] args) {
		
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		powderPrinter.setMaterial(new Powder());
		//파우더 클래스에 Powder형 변수 powder를 저장함
		Powder powder = powderPrinter.getMaterial();
		//powderPrinter = powderPrinter.toString();
		System.out.println(powderPrinter);
		powder.doPrinting();
		
		System.out.println();
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		plasticPrinter.setMaterial(new Plastic());
		
		//플라스틱 클래스에 Plastic형 변수 plastic을 저장함
		Plastic plastic = plasticPrinter.getMaterial();
		//plasticPrinter = plasticPrinter.toString();
		System.out.println(plasticPrinter);
		plastic.doPrinting();
		
		System.out.println();

		
		GenericPrinter<Water> waterPrinter = new GenericPrinter<Water>();
		waterPrinter.setMaterial(new Water());
		Water water = waterPrinter.getMaterial();
		System.out.println(waterPrinter);
		water.doPrinting();
		
	}

}
