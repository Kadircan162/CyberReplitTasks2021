package day44_oopReview_withmysolutions.shapes;

public class Diamond extends Shape{

    public Diamond(){
        type="Diamond";
    }

    @Override
    public void shapesInMath() {
        System.out.println("Calculate with diamond");
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + type);
    }

    public void diamondOnKite(){
        System.out.println("Some kites has a diamond shape");
    }

    public static void drawSquare(Square square){
        System.out.println("Diamond square");
    }

}
