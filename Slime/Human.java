package Slime;

public class Human {
    String name;
    int hp = 100;

    public Human(String name) {
        this.name = name;
    }

    public void attack(Slime s) {
        System.out.println(this.name + "님이 " + s.name + "을 공격했습니다.");
        s.hp -= 30;

        if (s.hp < 1) {
            System.out.println(s.name + "는 죽었다\n");
        } else {
            System.out.println("현재 " + s.name + "의 체력은" + s.hp + "이다.\n");
        }
    }
}
