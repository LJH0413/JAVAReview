package Slime;

import javax.swing.*;

public class Slime {
    String name;
    int hp = 100;

    public Slime(String name) {
        this.name = name;
    }

    //공격
   public void attack(Human h) {
        if(hp > 0) {
            System.out.println(name + "는(은) " + h.name + "를 공격했습니다.");
            h.hp -= 10;
            if(h.hp < 1) {
                JOptionPane.showMessageDialog(null, "Game Over");
                System.exit(0);
            }
            System.out.println("현재" + h.name + "의 체력은 " + h.hp
                    + "이다\n");
        }
    }
}
