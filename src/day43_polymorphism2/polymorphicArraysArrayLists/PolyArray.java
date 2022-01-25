package day43_polymorphism2.polymorphicArraysArrayLists;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PolyArray {


    static class Shape{

    }

    static class Circle extends Shape{

    }

    static class Square extends Shape{

    }

    public static void main(String[] args) {

        Shape s = new Circle();
        Square sq = new Square();
        sq = (Square) s;


        Shape[] shapeArray= new Circle[3];

        Shape shape = new Shape();
        Circle circle = new Circle();
        Square square = new Square();

        shapeArray[0] = new Circle();
        shapeArray[1] = new Circle();
        shapeArray[2] = new Circle();

        shapeArray = new Square[3];//Circle type of objects within the array has been changed to Square type of objects (another child of Shape)
        shapeArray[0] = new Square();
        shapeArray[1] = new Square();
        shapeArray[2] = new Square();

        shapeArray = new Shape[3];//Square type of objects within the array has been changed to Shape type of objects (parent)
        shapeArray[0] = new Shape();
        shapeArray[1] = new Square();
        shapeArray[2] = new Circle();//elements



    }

    public void test() throws Throwable {
        List<Integer> list = new LinkedList<>();
        list.add(34);
        list.add(45);
        list.add(34);
        list.add(65);

        Deque<Integer> d = new LinkedList<>();
        list = (List<Integer>) d;//error: If reference types have no parent/child relationship in between, you cannot cast it
                                // to use in polymorphic way

        LinkedList list2 = (LinkedList<Integer>) list;//down-casting


    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
