package day44_oopReview_withmysolutions.shapes;

public class Square extends Shape{

    public Square(){
        type="Square";
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + type);
    }

    public void squareMethod(){
        System.out.println("Square method");
    }
}
