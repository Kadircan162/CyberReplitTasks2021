package day43_polymorphism2;

public class TaxiDriver extends Employee{

    @Override
    public void working() {
        System.out.println("TaxiDriver is driving");
    }

    @Override
    public void speaking() {
        System.out.println("Taxi drivers are communicating in Hindu");
    }

    @Override
    public void residing() {
        System.out.println("Taxi drivers are resting at home");
    }
}
