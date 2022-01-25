package day44_oopReview_withmysolutions.shapes;

public class ShapeTest2 {

    public static void main(String[] args) {

        //A reference type cannot hardly be changed to any other reference type either to parent or child.
        //You can only down or upcast it (on the right side of the equation) and assign to a reference which has covariant type
        Shape shape;
        Shape shape1 = new Shape();
        shape = shape1;
        Circle circle = new Circle();
        shape = circle;
        Shape shape2 = new Circle();
        shape = shape2;
        Shape shape3 = new Circle();
        shape2 = shape3;
        Shape shape4 = new Elips();
        Shape shape5 = new Triangle();
        Elips elips = new Elips();
        Triangle triangle = new Triangle();

        shape = (Circle) shape4;

        Circle circle1;
        //circle1 = (Shape) shape1;
        //circle1 = (Circle) shape1;//ERROR: ClassCastException
        //circle1 = (Elips) shape1;//ERROR: ClassCastException
        //circle1 = (Triangle) shape1;//ERROR: ClassCastException
        circle1 = (Circle) shape2;
        //circle1 = (Elips)shape2;//ERROR: ClassCastException
        //circle1 = (Triangle)shape2;//ERROR: Cannot convert to a reference which does not have any parent/child relation
        circle1 = (Circle) shape4;
        circle1 = (Elips) shape4;
        //circle1 = (Shape) shape5;//ERROR: Cannot cast and assign a parent type of reference to a child reference
        //circle1 = (Circle) shape5;//ERROR: ClassCastException
        //circle1 = (Elips) shape5;//ERROR: ClassCastException
        //circle1 = (Triangle) shape5;//ERROR: Cannot cast and assign a different type of reference to a different type
        circle1 = (Circle) elips;//no need to cast it to Circle type as it's already the parent of Elips
        circle1 = elips;
        //circle1 = (Shape)triangle;//ERROR: Cannot cast and assign a parent type of reference to a child reference
        //circle1 = (Circle) triangle;//ERROR: Inconvertible types on the right side; cannot cast
        //circle1 = (Elips)triangle;//ERROR: Inconvertible types on the right side; cannot cast


        Elips elips1;
        //elips1 = (Elips) shape1;//ERROR: ClassCastException
        //elips1 = (Elips) shape2;//ERROR: ClassCastException
        elips1 = (Elips) shape4;//Good to go
        ((Shape)elips1).draw();
        ((Circle)elips1).draw();
        elips1.draw();
        //elips1 = (Elips) shape5;//ERROR: ClassCastException

        circle1 = circle;

        circle1 = (Circle) shape2;

        Shape shape6 = new Triangle();
        //circle1 = (Circle) shape4;//ERROR: ClassCastException

        Circle circle2 = (Circle) shape2;

        Circle circle3 = new Elips();
        circle1 = circle3;
        circle1.draw();
        circle1.shapesInMath();

        //circle3 = (Circle) shape1;//ERROR: ClassCastException
        circle3 = circle;
        circle3 = (Circle) shape2;
        Circle circle4 = new Circle();
        Shape shape7 = new Circle();
        Shape shape8 = new Elips();
        Shape shape9 = new Triangle();
        Elips elips2 = new Elips();
        circle3 = circle4;
        //circle3 = (Elips) shape5;//ERROR: ClassCastException
        //circle3 = (Circle) shape5;
        circle3 = elips;

        Circle circle5 = null;
        //circle5 = (Circle) shape6;//ERROR: Inconvertible types; cannot cast
        ///circle5.draw();
        //circle5 = (Elips)shape6;
        //circle5.draw();
        //circle5 = (Circle) shape7;//ERROR: ClassCastException
        circle5 = elips;

        Shape shape10 = new Shape();
        shape8.draw();
        shape8 = circle;
        shape8 = elips;
        shape8 = circle5;

        System.out.println("*******Lazy way of casting*****");
        Shape shape11 = new Shape();
        Shape shape12 = new Circle();
        Shape shape13 = new Elips();
        Circle circle6 = new Circle();
        Circle circle7 = new Elips();
        Elips elips3 = new Elips();

        shape9.draw();
        ((Shape)shape9).draw(); //Casting 'shape9' to 'Shape' is redundant
        //((Circle)shape9).draw();//ERROR: ClassCastException
        //((Elips) shape9).draw();//ERROR: ClassCastException
        //((Triangle) shape9).draw();////ERROR: ClassCastException

        ((Shape) shape10).draw();
       //((Circle) shape10).draw();
        //((Elips) shape10).draw();//ERROR: ClassCastException
        //((Triangle) shape10).draw();//ERROR: ClassCastException

        System.out.println("=============================");
        ((Shape) shape11).draw();
        //((Circle) shape11).draw();
       // ((Elips) shape11).draw();
        //((Triangle) shape11).draw();//ERROR: ClassCastException

        System.out.println("((Shape) shape11) = " + ((Shape) shape11));//All three casting reference addresses are the same as shape11 reference showing Elips object
        //System.out.println("((Circle) shape11) = " + ((Circle) shape11));
       // System.out.println("((Elips) shape11) = " + ((Elips) shape11));

        ((Shape) circle6).draw();
        ((Circle) circle6).draw();
        //((Elips) circle6).draw();//ERROR: ClassCastException
        //((Triangle) circle6).draw();//ERROR: Inconvertible types; cannot cast

        ((Shape) circle7).draw();
        ((Circle) circle7).draw();

        System.out.println("ÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜ");
        ((Elips) circle7).draw();
        //((Triangle) circle7).draw();//ERROR: Inconvertible types; cannot cast

        ((Shape) elips1).draw();
        ((Circle) elips1).draw();
        ((Elips) elips1).draw();
        //((Triangle) elips1).draw();//ERROR: Inconvertible types; cannot cast


        //Triangle triangle11 = (Triangle) new Shape();//ERROR: ClassCastException
        //Triangle triangle2 = (Triangle) new Circle();//ERROR: Inconvertible types; cannot cast
        Shape shape14 = new Shape();
        //Triangle triangle12 = (Triangle) new Shape();//ERROR: ClassCastException
        //Triangle triangle12 = (Triangle) shape14;//ERROR: ClassCastException
        Shape shape15 = new Triangle();
        Triangle triangle13 = (Triangle) shape15;
        triangle13.draw();

        Shape shape16 = new Triangle();
        Triangle triangle14 = new Triangle();
        triangle14 = (Triangle) shape16;
        triangle14.triangleAsTrafficSign();
        triangle14.draw();

        Shape shape17 = new Shape();
        Triangle triangle155 = new Triangle();
        shape17 = triangle155;












    }
}
