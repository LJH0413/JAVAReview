package object.testPjt;

public class Car {
    public static void main(String[] args) {

        Grandeur g = new Grandeur();

        g.color = "black";
        g.gear = "auto";
        g.price = 36000000;

        g.info();
        g.run();
        g.stop();


        Volvo v = new Volvo();

        v.color = "white";
        v.gear = "auto";
        v.price = 40000000;

        v.info();
    }
}
