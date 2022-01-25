package day40_accessmodifiers_final_2;

//import day40_accessmodifiers_final.Car; //if you want to use a class belongs to a different package (either you'll inherit it or
                                        // just create an object from it) you have to import it.


import day37Inheritance.Car;

public class Car2 extends Car {

    public Car2() {

        //model = "M3"; //model was a default variable belongs to a different package so that it's not accessible even though you inherit it (you're a subclass).
        year = "2017"; //year is a public variable so that it's accessible from anywhere
        //door = 4; //door is a private variable so that it's NOT accessible outside its own class even though you inherit it (as a subclass), it's only accessible from its current class.
        //engine = 5.2;//engine is a protected variable so that it's accessible from outside package ONLY WHEN YOU INHERIT the class (you're a subclass)
                     //which means that if you want to access a protected variable from outside its package, you have to inherit its class

    }


}
