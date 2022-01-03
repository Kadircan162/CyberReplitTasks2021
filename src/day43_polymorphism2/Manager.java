package day43_polymorphism2;

public class Manager extends Employee{

    @Override
    public void working() {
        System.out.println("Manager is leading employees");
    }

    @Override
    public void speaking() {
        System.out.println("Managers are announcing orders in English");
    }

    @Override
    public void residing() {
        System.out.println("Managers are resting in first-class caravans");
    }
}
