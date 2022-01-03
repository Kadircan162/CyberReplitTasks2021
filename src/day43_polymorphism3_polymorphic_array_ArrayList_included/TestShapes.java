package day43_polymorphism3_polymorphic_array_ArrayList_included;

public class TestShapes {

    public static void main(String[] args) {

//        Circle shape = new Circle();
//        shapes.draw();

        Shape shapes = new Circle();
        //shapes.draw();//error: If there is no draw() method in parent class, we cannot call it by using parent reference type. This rule
        //also applies for instance variables of the created onject.
        //shapes.rotate();//error
        //shapes.x;//error
        ((Circle) shapes).rotate();//lazy way of ref type casting
        ((Circle) shapes).draw();
        System.out.println("((Circle) shapes).x = " + ((Circle) shapes).x);
        ((Circle) shapes).x = 10;
        System.out.println("((Circle) shapes).x = " + ((Circle) shapes).x);

        Circle elips = (Circle) shapes;//this will create a new reference type in Circle type and cast reference type of Shape into
        //the new reference Circle type. With that way, the reference type starts to address exactly the same Circle object.
        //Whenever you change any instance variable using the new reference, it will be modified in the existing Circle object.
        elips.rotate();
        elips.rotate();
        elips.x = 25;
        System.out.println("((Circle) shapes).x = " + ((Circle) shapes).x);

        //Elips elips1 = (Elips) shapes;//error
        //Elips elips2 = (Elips) elips;//error


    }
}
