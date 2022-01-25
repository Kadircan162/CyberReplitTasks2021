package day41_abstract_class;

public class Ford extends ElectricCar{

    private int year;
    static String brand;

    public Ford(int year, String model, String color, double price) {
        super(model, color, price);
        this.year = year;
    }

    public static void main(String[] args) {
        System.out.println("brand = " + brand);
    }


    @Override
    public void start() {
        System.out.println("Ford = Push start button to start");
    }

    @Override
    public void charge() {
        System.out.println("Ford = Charging fast");

    }

    @Override
    public void drive() {
        System.out.println("Ford = Driving fast");

    }

    public int getYear() {
        return year;
    }

    public static void test(){}
}
