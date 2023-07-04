package io.codelex.polymorphism.practice.exercise2;

import java.util.ArrayList;
import java.util.List;

public class MakeSounds {
    public static void main(String[] arg) {

        List<Sound> sounds = new ArrayList<>();

        Sound firework = new Firework();
        Sound parrot = new Parrot();
        Sound radio = new Radio();

        sounds.add(firework);
        sounds.add(parrot);
        sounds.add(radio);

        for (Sound s : sounds) {
            System.out.print(s.getClass().getSimpleName() + ": ");
            s.playSound();
        }
    }
}
