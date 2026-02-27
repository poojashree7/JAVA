//OVERRIDING
import java.util.Scanner;
class Animal_dog {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal_dog{
    void sound() {
        System.out.println("Dog barks");
    }
}
public class Test {
    public static void main(String[] args) {
        Animal_dog a = new Animal_dog();
        Animal_dog b = new Dog();
        a.sound();
        b.sound();
    }
}