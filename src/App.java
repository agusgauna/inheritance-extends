import ar.com.ada.oop.zoo.Dog;
import ar.com.ada.oop.zoo.Horse;

import javax.sound.midi.Soundbank;

public class App {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Doberman", 4, 4);
        Dog dog2 = new Dog("Pekines", 4, 8);

        Horse horse1 = new Horse("Arabe", "Odin", 100);
        Horse horse2 = new Horse("Pura Sangre", "Perseo", 200 );

        System.out.println(dog1.toString());
        System.out.println(dog2.toString());
        System.out.println(horse1.toString());
        System.out.println(horse2.toString());

        System.out.println(dog1.toString() + "- hashCode(): " +dog1.hashCode());
        System.out.println(dog2.toString() + "- hashCode(): " +dog2.hashCode());
        System.out.println(horse1.toString() + "- hashCode(): " +horse1.hashCode());
        System.out.println(horse2.toString() + "- hasCode(): " +horse2.hashCode());

        System.out.println("Perro1 es igual a perro2?: " +dog1.equals(dog2));
        System.out.println("Caballo1 es igual a caballo2?: " +horse1.equals(horse2));
    }
}
