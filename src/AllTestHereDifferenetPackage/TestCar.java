package AllTestHereDifferenetPackage;


import day42_interface.Car;
import day42_interface.ITestable;

public class TestCar{


   public void main(String[] args) {

      Car car = new Car();
      System.out.println("car.IS_TESTABLE = " + car.IS_TESTABLE);
      //System.out.println("car.IS_TEST_PASS = " + car.IS_TEST_PASS); //error: since both interfaces have the same fields, it cannot be inherited by implementing class
      //car.IS_TESTABLE = false; //error: final fields cannot be modified


   }

}
