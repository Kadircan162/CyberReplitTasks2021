package day43_polymorphism2;

public class Engineer extends Employee{
    @Override
    public void working() {
        System.out.println("Engineer is building applications");
    }

    @Override
    public void speaking() {
        System.out.println("Engineers are speaking in Germany");
    }

    @Override
    public void residing() {
        System.out.println("Engineers are resting in a second-class caravan");
    }
}
