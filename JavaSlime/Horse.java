package JavaSlime;
//about extends
public class Horse {

    String name;

    //생성자 오버로딩
//    Horse(int i) {
//        this(i, "제너널");
//        System.out.println(i + "kg 말이 탄생했습니다");
//    }

    Horse(String name) {
        this.name = name;
    }

    void run() {

    }
}

class Unicorn extends Horse {
    int fp;

    Unicorn(String name) {
        super(name);
    }
    void fly() {

    }
}