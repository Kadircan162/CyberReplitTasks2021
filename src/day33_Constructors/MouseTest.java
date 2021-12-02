package day33_Constructors;

public class MouseTest {
    public static void main(String[] args) {
        Mouse m1 = new Mouse(15);
        m1.print();
        m1 = new Mouse(29, 35);
        m1.print();
        m1 = new Mouse(55, 23, 98);
        m1.print();
        System.out.println(m1.weight);
        System.out.println(m1.numTeeth);
        System.out.println(m1.numWhiskers);

    }
}
