package day40_accessmodifiers_final_2;

import java.util.Scanner;

import day37Inheritance.Car;
//import day40_accessmodifiers_final.Car; //if you want to use a class belongs to a different package you have to import it

//import static day40_accessmodifiers_final.FinalVariables.ADMIN_USERNAME; //I can call the final variable ADMIN_USERNAME by its name from another PACKAGE by using only its name:
//Answer: I should import the class with a static way.

public class CarTest {

    public static void main(String[] args) {

        //System.out.println("ADMIN_USERNAME = " + ADMIN_USERNAME);

        Car c = new Car();

        //c.model = "M3"; //model was a default variable belongs to a different package so that it was NOT accessible to all other classes outside the package
        c.year = "2017"; //year is a public variable so that it's accessible from anywhere
        //c.door = 4;//door is a private variable so that it's NOT accessible outside its own class, only accessible from its current class
        //c.engine = 5.2; //engine is a protected variable belongs to a different package so that it's NOT accessible from outside packages


    }
}
