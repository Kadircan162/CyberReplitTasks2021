package day44_oopReview.shapes;

public class Diamond extends Shape{

    public Diamond(){
        type="Diamond";
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + type);
    }
}
