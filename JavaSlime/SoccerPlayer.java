package JavaSlime;

public class SoccerPlayer {

    //전역 변수와 지역 변수 알아보기

    int att = 100;
    int def = 70;

    public void attack() {
//        int att = 100;
//        int def = 70;
        att += 10;
        def -= 10;
    }

    public void defensive() {
        att -= 10;
        def += 10;
    }
}
