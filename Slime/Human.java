package Slime;

public class Human {
    String name;
    int hp = 100;

    public Human(String n) {
        name = n;
    }

    public void attack(Slime s) {

        s.hp = s.hp - 30;

        if (s.hp < 1) {
            Study1.lbl.setText(s.name + "는 사망했다");
            Study1.lbl2.setText("");


        } else {
            Study1.lbl.setText(name + "의 공격. " + s.name + "의 체력은 " + s.hp + ".");
        }

    }
}
