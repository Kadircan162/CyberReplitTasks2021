package day43_polymorphism3_polymorphic_array_ArrayList_included;

public class Shape {


    public void draw(){
        System.out.println("Drawing a shape");
    }

}

interface ColoredShape{

    void paint();

}

class Rectangle extends Shape implements ColoredShape{

    public void sides(){
        System.out.println("I have three sides");
    }

    @Override
    public void paint() {

        System.out.println("Painting my rectangle");

    }
}

class TestRectangle{

    public static void main(String[] args) {

        Shape rec = new Rectangle();
        rec.draw();
        //rec.sides();//error: //error: In polymorphism, reference type decides which methods or variables are to be accessed,
        //so if you call a method which the Parent class or Interface does not contain, the compiler gives ERROR
        //rec.paint();//error for the same reason above

        ((Rectangle) rec).paint(); //lazy way of reference type of casting (casting is used in order to call methods which
        //exists in a child class but does not exist in parent class or interface.
        ((Rectangle) rec).sides();

        Rectangle rec2 = (Rectangle) rec;//reference type casting using dummy reference variable
        rec2.paint();
        rec2.sides();






    }
}