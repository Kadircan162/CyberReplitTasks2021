package day37Inheritance;

public class Car extends Vehicle{
    int door;
    String model;
    String year;

    public Car(){

    }

    @Override
    public void move(int currentGear, int speed) {
        move(currentGear, speed);
    }
    public void drift(){
        setName("BMW");
        System.out.println(getName());
        super.move(2, 120);
        move(3, 220);
    }
}
