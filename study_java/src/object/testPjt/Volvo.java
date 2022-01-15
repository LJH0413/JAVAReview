package object.testPjt;

public class Volvo {

    public String color;
    public String gear;
    public int price;

    public Volvo() {
        System.out.println("Volvo 생성자");
    }

    public void info(){
        System.out.println(" -- info() --");
        System.out.println("color : " + color);
        System.out.println("gear : " + gear);
        System.out.println("price : " + price);
    }

    //method
    public void run() {
        System.out.println(" -- run -- ");
    }

    public void stop() {
        System.out.println(" -- stop -- ");
    }
}
