package day43_polymorphism3_polymorphic_array_ArrayList_included;

import java.util.ArrayList;
import java.util.List;

public class ClassExtendingArrayList extends ArrayList {

    public static void main(String[] args) {

        ClassExtendingArrayList c = new ClassExtendingArrayList();

        c.add(new Shape());
        System.out.println("c = " + c.get(0).getClass().getSimpleName());

        ArrayList<Shape> c2 = new ClassExtendingArrayList();
        c2.add(new Circle());
        c2.add(new Triangle());
        c2.add(new Elips());

        List<Circle> c3 = new ClassExtendingArrayList();
        c3.add(new Circle());
        c3.add(new Elips());

    }

}
