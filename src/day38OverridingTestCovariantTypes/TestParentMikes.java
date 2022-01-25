package day38OverridingTestCovariantTypes;

public class TestParentMikes {


    public static void main(String[] args) {
        ChildOfMikes childOfMikes = new ChildOfMikes();

        childOfMikes.sleep();

        System.out.println("++childOfMikes.sleepTime = " + ++childOfMikes.sleepTime);



    }

}
