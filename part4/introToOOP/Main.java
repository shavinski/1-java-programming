package part4.introToOOP;

import part4.introToOOP.Person;
import part4.introToOOP.Whistle;


public class Main {
    public static void main(String[] args) {
        Whistle duckWhistle = new Whistle("Kvaak");
        Whistle roosterWhistle = new Whistle("Peef");

        duckWhistle.sound();
        roosterWhistle.sound();
        duckWhistle.sound();
    }
}
