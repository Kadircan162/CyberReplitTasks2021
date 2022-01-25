package AllTestsHere;

import day42_interface.ITestable;

public class Car2ImplementingFromDifferentPackage implements ITestable {
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
        charging();//methods that are inherited from the interface ITestable from another package
        speeding();
    }

    @Override
    public void charge11() {

    }

    @Override
    public void charging() {
        ITestable.super.charging();
    }

    @Override
    public void speeding() {
        ITestable.super.speeding();
    }
}
