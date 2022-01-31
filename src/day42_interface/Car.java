package day42_interface;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Car extends Vehicle implements ITestable,ITestable2{

    public static void drive(){} //hiding from Vehicle super class

    //public static void charge8(){} //A static method at implemented interface cannot be hidden or inherited by implementing classes

    @Override
    public void speeding() {
        ITestable.super.speeding();
        charging();
    }

    @Override
    public void charge1() {//these overridden abstract methods come from the both ITestable,ITestable2 interfaces where their signatures are exactly the same
                            //however enough to override only one of them

        start();
        drive();
        //charge6();//error: private methods cannot be inherited
        //charge8();//A static method at implemented interface cannot be hidden or inherited by implementing classes
    }

    @Override
    public void charge2() {

        System.out.println("IS_TESTABLE = " + IS_TESTABLE);


    }

    @Override
    public void charge10() {

        System.out.println("x = " + staticx);

        //System.out.println("IS_TEST_PASS = " + IS_TEST_PASS); //error: since both interfaces have the same fields, it cannot be inherited by implementing class



    }

    @Override
    public void charge3() {

    }

    @Override
    public void charging() {
        ITestable.super.charging();
    }


    @Override
    public void charge11() { //this abstract method is overridden only from ITestable2 interface

    }

    public static void main(String[] args) {//main method is welcome in an interface
        ITestable.charge8();

        ITestable itest = new Car();

    }
}
