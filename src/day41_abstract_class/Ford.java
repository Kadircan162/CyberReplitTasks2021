package day41_abstract_class;

public class Ford extends ElectricCar{

    private int year;

    public Ford(int year, String model, String color, double price) {
        super(model, color, price);
        this.year = year;
    }


    @Override
    public void start() {

        System.out.println("Ford = Push start button to start");

    }

    @Override
    public void charge() {

    }

    @Override
    public void drive() {

    }

    public int getYear() {
        return year;
    }
}
