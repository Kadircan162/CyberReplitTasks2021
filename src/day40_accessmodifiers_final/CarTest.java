package day40_accessmodifiers_final;

import static day40_accessmodifiers_final.FinalVariables.ADMIN_USERNAME;//I can call the final variable ADMIN_USERNAME by its name from another class with the same way using only its name:
                                                                        //Answer: I should import the class with a static way.

public class CarTest { //in the same package with the Car class

    public static void main(String[] args) {

        Car c = new Car();
        c.model = "m3"; //1. At the Car class, model variable was default so that it was accessible all other classes in the same package
        c.year = 2017; //public --> At the Car class, year variable is public so that it's accessible from anywhere
        //c.door = 4;  //private --> not accessible (it's accessible only in the current class (Car))
        c.engine = 5.2; //protected --> it's accessible to all other classes in the same package

        System.out.println(c.toString());

        System.out.println("ADMIN_USERNAME = " + ADMIN_USERNAME);


    }
}
