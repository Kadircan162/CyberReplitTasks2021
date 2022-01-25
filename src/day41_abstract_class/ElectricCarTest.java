package day41_abstract_class;

import static day41_abstract_class.Ford.brand;
import static day41_abstract_class.Ford.test;

public class ElectricCarTest {

    public static void main(String[] args) {

        System.out.println("brand = " + brand);
        brand = "Ford Electric Car";
        System.out.println("brand = " + brand);
        test();

        Ford ford2 = new Ford(1999, "Focus", "White", 35.000);
        ford2.brand = "Electrical Ford";
        System.out.println("ford.brand = " + ford2.brand);
        System.out.println("brand = " + brand);

        Ford ford3 = new Ford(2009, "Mondeo", "Black", 55.000);
        System.out.println("ford3.brand = " + ford3.brand);
        System.out.println("brand = " + brand);

        //Tesla tesla = new Tesla("TeslaX", "Red", 50_000);
//        System.out.println("tesla.getModel() = " + tesla.getModel());
//        System.out.println("tesla.getColor() = " + tesla.getColor());
//        System.out.println("tesla.getPrice() = " + tesla.getPrice());

//        tesla.charge();
//        tesla.start();
//        tesla.drive();
//        tesla.stop();
//
//
//        System.out.println(tesla); //same as using toString

        System.out.println("=================================================");

        Ford ford = new Ford(2019, "Ford Focus", "Green", 35_000);

        System.out.println("ford.getYear() = " + ford.getYear());
        System.out.println(ford);

        ford.start();
        ford.charge();
        ford.drive();
        ford.stop();


        System.out.println("=================================================");
        TeslaTruck teslaTruck = new TeslaTruck("TeslaTruckMan", "Blue", 37_500, 5.0);

        System.out.println("teslaTruck.toString() = " + teslaTruck.toString());
        System.out.println("teslaTruck.getEngineSize() = " + teslaTruck.getEngineSize());

        teslaTruck.load("Coal");
        teslaTruck.charge();
        teslaTruck.start();
        teslaTruck.drive();
        teslaTruck.stop();

        System.out.println("=================================================");

        TeslaSemi teslaSemi = new TeslaSemi("TeslaSemiEarth", "White", 75_000, 6.0);
        System.out.println("teslaSemi.getEngineSize() = " + teslaSemi.getEngineSize());
        System.out.println("teslaSemi.toString() = " + teslaSemi.toString());

        teslaSemi.charge();
        teslaSemi.start();
        teslaSemi.stop();
        teslaSemi.load("Gold");
        teslaSemi.stop();

    }
}
