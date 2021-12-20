package Static_Non_Static_Analyze;

import static Static_Non_Static_Analyze.ABC.*;

public class ABCTest {
    public static void main(String[] args) {
//        ABC abc = new ABC(); // Cut the access of Constructor of ABC class so that only way to reach a method is by Class name.
//        abc.m1();
        //ABC.x = 0;
        m1();
        m1();
        System.out.println(x);
    }

}
