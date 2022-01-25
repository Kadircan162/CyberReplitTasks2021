package day44_oopReview_withmysolutions.shapes;

import day43_polymorphism3_polymorphic_array_ArrayList_included.Elips;

import java.util.ArrayList;
import java.util.List;

import static day44_oopReview_withmysolutions.shapes.ShapeManager.*;

public class ShapeTest {

    public static void main(String[] args) {
/*
        Shape shape5 = new Diamond();
        shape5.draw();
        shape5.type = "simple diamond";
        shape5.draw();

        shape5 = new Square();
        shape5.draw();
        shape5.type = "16*16 square";
        shape5.draw();

        ((Square)shape5).squareMethod();//you can downcast a class referance to address child object

        Square square = new Square();
        ((Shape)square).draw();//you can also upcast a class referance to address parent object

        shape5 = new Shape();
        shape5.draw();
        shape5.type = "circle";
        shape5.draw();
        buildShape("df");


        buildShape("square").draw(); //As the ShapeManger static methods are imported, we don't need to use class name to call the methods
        buildShape("diamond").draw();
        buildShape("shape").draw();

        System.out.println("***********drawSquare(Square square)********");
        Shape shape1 = buildShape("shape");
        Diamond diamond1 = (Diamond) buildShape("diamond");
        Square square1 = (Square) buildShape("square");

        Shape square2 = diamond1;
        Shape shape12 = square1;

        Diamond diamond3 = (Diamond) buildShape("diamond");
        Square square3 = (Square) buildShape("square");

        diamond3 = (Diamond) shape1;
        square3 = (Square) shape1;

        Shape shape4;
        Diamond diamond4 = new Diamond();
        Square square4 = new Square();

        shape4 = (Shape)diamond4;
        shape4 = (Square)square4;

        drawSquare(square4);//Shape shape = new Square();

        System.out.println("***********drawShape(Shape shape)**********");
        drawShape(buildShape("shape"));

        System.out.println("***********drawShape(String shape)**********");
        drawShape("diamond");

        System.out.println("***********drawShape(List<Shape> shapeList)*******");
        List<Shape> arrayList = new ArrayList<>();
        arrayList.add(buildShape("square"));
        arrayList.add(buildShape("diamond"));
        arrayList.add(buildShape("shape"));
        drawShape(arrayList);

*/

        Shape shape = new Shape();
        shape = new Triangle();
        shape = new Diamond();

        Shape shape2 = new Triangle();
        shape2 = new Shape();
        shape2 = new Circle();

        //Triangle triangle = new Shape();//ERROR: Different obj cannot be referenced by another type of reference
        //Triangle triangle1 = (Triangle) new Shape();//ERROR: We can only cast references, not objects itself
        //Triangle triangle2 = new Circle();//ERROR: Different obj cannot be referenced by another type of reference
        //Triangle triangle3 = (Triangle) new Circle();//ERROR:Inconvertible types; cannot cast

        Shape shape4 = new Shape();
        Triangle triangle4 = new Triangle();
        //triangle4 = (Triangle) shape4;//ERROR:ClassCastException
        Shape shape5 = new Shape();
        Triangle triangle5 = new Triangle();
        shape5 = triangle5;//Child reference to parent reference is acceptable

        Shape shape6 = new Shape();
        //Circle circle6 = (Circle) shape6;//ERROR:’ClassCastException'

        Shape shape7 = new Circle();
        Circle circle7 = (Circle) shape7;//Good to go














    }

}
