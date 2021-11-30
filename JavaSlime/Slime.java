package JavaSlime;

import javax.swing.*;

public class Slime {
    String name;
    int hp = 80;

    // 생성자
    public Slime(String n) {
        name = n;
    }

    // 공격
    public void attack(Human h) {
        attack(h, 10);
    }

    public void attack(Human h, int damage) {
        if (hp > 0) {
            h.hp = h.hp - damage;

            if (h.hp < 1) {
                JOptionPane.showMessageDialog(null, "Game Over");
                System.exit(0);
            }
            if(damage < 30) {
                Study01.lbl2.setText(name + "의 공격. " + h.name + "의 체력은 " + h.hp + ".");
            } else {
                Study01.lbl2.setText(name + "의 강한공격. " + h.name + "의 체력은 " + h.hp + ".");
            }
        }
    }
}

class BlueSlime extends Slime {
    BlueSlime(String n) {
        super(n);
    }

    @Override
    public void attack(Human h) {
        //공격력 8
        attack(h, 8);
    }

    void heal(Slime s) {
        if(hp> 0 && s.hp > 0) {
            s.hp += 10;

            if(s.hp > 80) {
                s.hp = 80;
            }
            Study01.lbl2.setText(name + "는 " + s.name + "를 치료. 그의 체력은 " + s.hp
            );
        }
    }
} // blue slime

class RedSlime extends Slime {
    RedSlime(String n) {
        super(n);
    }

    @Override
    public void attack(Human h) {
        attack(h, 15);
    }

    public void attack2(Human h) {
        attack(h, 30);
    }
}
