package day43_polymorphism;

import AllTestsHere.B;

public class TestAllAnimals {

    public static void main(String[] args) {

        Animal animal = new Dog(); //Dog extends Animal class
        Livings animal2 = new Dog(); //Dog implements Livings interface
        Walkings animal3 = new Dog(); //Dog implements Walkings interface

        //Animal types
        animal = new Animal();//The reference of Animal type can be modified to address either to itself ot its child classes (Dog, Cat, Bird)
        animal.animalCount=10;
        animal = new Cat(); //Cat extends Animal class

        animal = new Bird(); //Bird extends Animal class


        //Living types
        //animal2 = new Livings();//error: Livings is an interface, so it cannot be instanced (it has no constructor)
        animal2 = new Cat();//Cat implements Livings interface
        animal2 = new Bird();//Bird implements Livings interface

        //Walkings types
        animal3 = new Cat();//Cat implements Walkings interface
        //animal3 = new Bird();//error: since the bird class does not implement Walkings interface, the reference type of
                                //Walkings cannot be addressed to Bird object.


    }

}
