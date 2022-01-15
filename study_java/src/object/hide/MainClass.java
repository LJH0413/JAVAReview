package object.hide;

public class MainClass {
    public static void main(String[] args) {

        StudentClass s1 = new StudentClass("LJH", 90);
        StudentClass s2 = new StudentClass("LSJ", 95);

        s1.getInfo();
        s2.getInfo();

        s1.setScore(100);
        s1.getInfo();

    }

}
