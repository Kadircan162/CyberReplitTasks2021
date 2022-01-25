package AllTestHereDifferenetPackage;

import day42_interface.ITestable;

public class TestITestable implements ITestable {
    @Override
    public void charge1() {

    }

    @Override
    public void charge2() {

    }

    @Override
    public void charge10() {

    }

    @Override
    public void charge3() {

    }

    @Override
    public void charge11() {
        charging();//accessible even from outside the interface package since it's a public method.
    }

//    @Override
//    public void charging() {
//        ITestable.super.charging();
//    }

    @Override
    public void speeding() {
        ITestable.super.speeding();
    }

    public void charge8(){System.out.println("I'm public static");}//that is not a hiding method from interface, it's just an instance method.

    static void charge12(){}//that is not a hiding method from interface, it's just an instance method.
    public static void main(String[] args) {
        //charge12();//error:Static method may be invoked on containing interface class only
        System.out.println("IS_TESTABLE = " + IS_TESTABLE);//IS_TESTABLE is inherited from ITestable interface

        ITestable.charge12();

        ITestable iTestable = new TestITestable();
        //iTestable.charge12();//error:Static method may be invoked on containing interface class only
    }
}
