package day44_oopReview_withmysolutions.shapes;

public class Shape {

    public String type;

    public Shape(){
        type = "Shape";
    }
    public void draw(){
        System.out.println("Drawing a " + type);
    }
}
