package day41_abstract_class;

public class TeslaSemi extends ElectricTruck{

    private double engineSize;

    public TeslaSemi(String model, String color, double price, double engineSize) {
        super(model, color, price);
        this.engineSize = engineSize;
    }

    @Override
    public void start() {

    }

    @Override
    public void charge() {

    }

    @Override
    public void drive() {

    }

    @Override
    public void load(String item) {

        System.out.println("Tesla-Semi load " + item + "by lowering the truck and opening the door");

    }

    public double getEngineSize() {
        return engineSize;
    }
}
