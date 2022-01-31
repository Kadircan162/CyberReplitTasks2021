package day41_abstract_class;

public abstract class ElectricCar{

    private String model, color;
    private double price;

    public static final int i = 30;

    public ElectricCar(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public abstract void start();
    public abstract void charge();
    public abstract void drive();

    public void stop(){

        System.out.println("Electric car stops when pushing brake paddle");

    }


    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
