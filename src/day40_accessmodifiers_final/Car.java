package day40_accessmodifiers_final;

public class Car {
    public String model;
    public int year;
    private int door;
    protected double engine;

    public final int X;
    final int C;
    final int V = 18; //you can initialize a final instance variable at the same statement
    public static final String MODEL;

    static { //static final variable can be initialized in a static block.
        MODEL = "TOYOTA";
    }

    public Car(){ //you can initialize a final instance variable in a constructor
        X = 25;
        //MODEL = "Bmw"; //error: static final variable cannot be initialized in a constructor.
    }

    static { //final instance variable cannot be initialized in a static variable
        final int Y;
        Y = 13;
    }

    { //you can initialize a final instance variable in an instance block
        C = 10;
        final int Z = 20;
    }

    public void m1(){ //In a method, you can initialize only a local final variable.
        final int Y;
        Y = 6;
    }


    @Override
    public String toString() {//If you don't override the toString method, it prints only the object address that is created from another class.
                                // However, if you override it, it prints out any instance variables of this class that you inherit.

        return "Car [model=" + model + ", year=" + year + ", door=" + door + ", engine=" + engine + "]";
    }


}
