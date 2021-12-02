package day33_Constructors;

public class BusTest {
    public static void main(String[] args) {

        Bus bus1 = new Bus("Volvo");
        bus1.printOut();
        Bus bus2 = new Bus("Transportation", "Crysler");
        bus2.printOut();
        Bus bus3 = new Bus("Sport Club", "BMW", true);
        bus3.printOut();
        Bus bus4 = new Bus("School", "MAN", false);
        bus4.printOut();
        Bus bus5 = new Bus("Tourism", "Mitsubishi", true, false);
        bus5.printOut();
        System.out.println(bus5.toString());
    }
}
