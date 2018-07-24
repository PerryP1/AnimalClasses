import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class AnimalClasses {

    public static void main(String[] args) {

        Animal animalA = new Animal();
        print(animalA.eat());
        print(animalA.sleep());

        print("");

        Cat catB = new Cat();
        print(catB.eat());
        print(catB.sleep());

        print("");

        Bird birdC = new Bird();
        print(birdC.eat());
        print(birdC.sleep());

print("");

        Dog dogD = new Dog();
        print(dogD.eat());
        print(dogD.sleep());

        print("");

        Elephant elephantE = new Elephant();
        print(elephantE.eat());
        print(elephantE.sleep());


    }

    private static void print(String s) {
        System.out.println(s);
    }
}


//Your Assignment:
//
//What just happened? Comment your understanding of object-oriented programming from the four classes created above. Where is the method executing encapsulation? Inheritance? Or polymorphism?
//
//Create 2 more animal classes (i.e. Dog, Mouse, etc.) and extend the animal class to verify your understanding.

