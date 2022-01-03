package day43_polymorphism2;

public class Employee implements HumanBeings,European{

    public void working(){
        System.out.println("Employees are working");
    }

    @Override
    public void speaking() {

        System.out.println("Employees are communicating in Spanish");

    }

    @Override
    public void residing() {

        System.out.println("Employees are resting in caravans");

    }
}
