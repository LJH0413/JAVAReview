package Constuctor;

public class ObjectClass {
    public int x;
    public int y;

    public ObjectClass(String n, int[] iArr) {
        System.out.println("-- ObjectClass() --");
        System.out.println("s ---> " + n);
        System.out.println("iArr ---> " + iArr);
    }

    public ObjectClass(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
