package day44_oopReview.shapes;

import java.util.List;

public class ShapeManager {

    public static Shape buildShape(String type){
        Shape shape;
        switch (type.toLowerCase()){
            case "square":
                shape = new Square();
                break;
            case "diamond":
                shape = new Diamond();
                break;
            default:
                shape = new Shape();
                break;
        }
        return shape;
    }

    public static void drawSquare(Square square){
        square.draw();
    }

    public static void drawShape(Shape shape){
        shape.draw();
    }

    public static void drawShape(String shape){
        buildShape(shape).draw();
    }
    public static void drawShape(List<Shape> shapeList){
        for (Shape each : shapeList){
            each.draw();
        }

    }

}
