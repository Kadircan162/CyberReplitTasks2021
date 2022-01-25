package day41_abstract_class;

public class Tesla extends ElectricCar{

    private static final int gear = 7;

    public Tesla(String model, String color, double price) {
        super(model, color, price);
    }

    @Override
    public void start() {
        System.out.println("Tesla is starting quietly");
    }

    @Override
    public void charge() {
        System.out.println("Tesla is charging quietly");
    }

    @Override
    public void drive() {
        System.out.println("Tesla is driving quietly");
    }

    public String getModel(){
        return "Tesla";
    }
    public String getModel(String s){//overloading a method which is already overriden
        return "Tesla";
    }

    public void test(){

        getModel();//overridden method
        getModel("MyTesla");

    }


    public static void main(String[] args) {
        System.out.println("Ford.brand = " + Ford.brand);
        Ford fordTesla = new Ford(2021, "FocusTesla", "TeslaBlue", 76.000);
        System.out.println("fordTesla.brand = " + fordTesla.brand);




    }
}
