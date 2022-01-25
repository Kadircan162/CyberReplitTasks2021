package day38OverridingTestCovariantTypes;

public class ChildOfMikes extends MyParentMikes{

    static int sleepTime = 10;


    @Override
    public void sleep() {

        System.out.println("Child is sleeping");

    }

}
