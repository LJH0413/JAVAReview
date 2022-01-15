package object.testPjt;

public class Grandeur {

    //필드 (속성)
    public String color;
    public String gear;
    public int price;

    //생성자 : 클래스를 호출할 수 있는
    public Grandeur() {
        System.out.println("Grandeur 생성자");
    }

    //overloading
    public Grandeur(String color) {
        System.out.println(color + "color :" + "Grandeur 생성자");
    }

    //overloading
    public Grandeur(String color, int price) {
        System.out.println(color + "color : " + "Grandeur 생성자" + "(price :" + price + ")");
    }

    //method
    public void run() {
        System.out.println(" -- run -- ");
    }

    public void stop() {
        System.out.println(" -- stop -- ");
    }

    public void info(){
        System.out.println(" -- info() --");
        System.out.println("color : " + color);
        System.out.println("price : " + price);
    }


}
