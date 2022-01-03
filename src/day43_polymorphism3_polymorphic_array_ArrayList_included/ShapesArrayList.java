package day43_polymorphism3_polymorphic_array_ArrayList_included;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Vector;

public class ShapesArrayList {

    public static void main(String[] args) {

        ArrayList<Shape> shapes = new ArrayList<>();//non-polymorphic usage
        //shapes3 = new Triangle();//error: once the ArrayList is declared to get Shapes elements, it cannot be modified
                                    //to get any other objects even it's a child object of Shapes
        shapes.add(new Shape());
        shapes.add(new Triangle());//the reference elements at each index can address either Shapes or its child classes (polymorphic ArrayList)
        System.out.println("shapes3 = " + shapes.get(0).getClass().getSimpleName());//Shapes
        System.out.println("shapes3 = " + shapes.get(1).getClass().getSimpleName());//Triangle

        List<Shape> shapes2 = new ArrayList<>();//here the reference type of ArrayList object is modified to address List object types in polymorphic way
        //as ArrayList is a class that implements List interface
        Collection<Shape> shapes3 = new ArrayList<>();//here the reference type of ArrayList object is modified to address Collection object types in polymorphic way
        //as ArrayList is a class that implements List and List is an interface which extends Collection interface
        List<Shape> shapes4 = new ArrayList<>();
        shapes3 = shapes4;
        ArrayList<Shape> shapes5 = new ArrayList<>();
        shapes3 = shapes5;
        Vector<Shape> vector = new Vector<>();
        shapes3 = vector;


        ArrayList<Shape> shape6 = new ArrayList<>();
        shape6.add(new Shape());
        shape6.add(new Triangle());
        shape6.add(new Circle());
        shape6.add(new Elips());
        System.out.println("shape6 = " + shape6);

        ArrayList<Triangle> shape7 = new ArrayList<>();
        //shape6 = shape7;//error: We cannot modify an ArrayList's holding elements' reference types to address
        //a different object like Shape to Triangle or Shapes to Circle


        System.out.println(shape6);


    }
}
