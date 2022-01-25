package day44_oopReview_withmysolutions.shapes;

import day43_polymorphism3_polymorphic_array_ArrayList_included.Circle;

public class Test {


    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.shapesInMath();

        shape = new Diamond();
        shape.shapesInMath();
        shape.draw();

        Diamond diamond;
        diamond = (Diamond) shape;
        diamond.diamondOnKite();



    }
}
