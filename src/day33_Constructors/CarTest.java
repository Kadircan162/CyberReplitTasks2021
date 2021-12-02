package day33_Constructors;

public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car("BMW", "520", 2015, 10_000, "Gray");
        System.out.println(c1.make);
        System.out.println(c1.model);
        System.out.println(c1.year);
        System.out.println(c1.miles);
        System.out.println(c1.color);

    }
}
