package Constuctor;

public class MainClass {

    public static void main(String[] args) {

        int[] iArr = new int[]{1, 2, 3, 4, 5};
        ObjectClass obj1 = new ObjectClass("LJH", iArr);

        ObjectClass obj2 = new ObjectClass(10, 20);
    }
}
