package day44_oopReview_withmysolutions.shapes;

import java.util.ArrayList;
import java.util.List;

import static day44_oopReview_withmysolutions.shapes.ShapeManager.*;

public class ShapeTest {

    public static void main(String[] args) {

        Shape shape = new Diamond();
        shape.draw();
        shape.type = "simple diamond";
        shape.draw();

        shape = new Square();
        shape.draw();
        shape.type = "16*16 square";
        shape.draw();

        ((Square)shape).squareMethod();//you can downcast a class referance to address child object

        Square square = new Square();
        ((Shape)square).draw();//you can also upcast a class referance to address parent object

        shape = new Shape();
        shape.draw();
        shape.type = "circle";
        shape.draw();
        ShapeManager.buildShape("df");


        buildShape("square").draw(); //As the ShapeManger static methods are imported, we don't need to use class name to call the methods
        buildShape("diamond").draw();
        buildShape("shape").draw();

        System.out.println("***********drawSquare(Square square)********");
        drawSquare((Square) buildShape("square"));

        System.out.println("***********drawShape(Shape shape)**********");
        drawShape(ShapeManager.buildShape("shape"));

        System.out.println("***********drawShape(String shape)**********");
        ShapeManager.drawShape("diamond");

        System.out.println("***********drawShape(List<Shape> shapeList)*******");
        List<Shape> arrayList = new ArrayList<>();
        arrayList.add(buildShape("square"));
        arrayList.add(buildShape("diamond"));
        arrayList.add(buildShape("shape"));
        drawShape(arrayList);


    }

}
