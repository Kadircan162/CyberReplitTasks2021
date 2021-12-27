package day41_abstract_class;

public abstract class ElectricTruck extends ElectricCar{

    public ElectricTruck(String model, String color, double price) {
        super(model, color, price);
    }


    public abstract void load(String item);



}
