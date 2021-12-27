package day41_abstract_class;

public class Tesla extends ElectricCar{

    public Tesla(String model, String color, double price) {
        super(model, color, price);
    }

    @Override
    public void start() {
        System.out.println("Tesla is starting quietly");
    }

    @Override
    public void charge() {

    }

    @Override
    public void drive() {

    }
}
