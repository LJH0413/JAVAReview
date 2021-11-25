package Slime;

import javax.swing.*;

public class Study02 {
    public static void main(String[] args) {
        Slime s = null;

        Slime s1 = new Slime("슬라삐");
        Slime s2 = new Slime("슬라돌");

        s = s1;

        System.out.println(s.name);
}
}
