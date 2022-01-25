package day44_oopReview_withmysolutions.shapes;

public class Triangle extends Shape{

    public Triangle() {
        //type = "triangle";
    }

    @Override
    public void draw() {
        System.out.println("Drawing a triangle");
    }

    public void triangleAsTrafficSign(){

        System.out.println("You can see me on the road");

    }
}
