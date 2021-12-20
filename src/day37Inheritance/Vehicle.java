package day37Inheritance;

public class Vehicle {
    private String name;
    private int currentGear;
    private int speed;

    public Vehicle(){

    }

    public Vehicle(String name, int currentGear, int speed){
        this.name = name;
        this.currentGear = currentGear;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void move(int currentGear, int speed){
        this.currentGear = currentGear;
        this.speed = speed;
    }
}
