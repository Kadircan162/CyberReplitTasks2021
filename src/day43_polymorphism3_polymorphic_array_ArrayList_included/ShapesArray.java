package day43_polymorphism3_polymorphic_array_ArrayList_included;

import java.util.Arrays;

public class ShapesArray {

    public static void main(String[] args) {

        String[] s = new String[3];

        System.out.println("========Polymorphism for the array elements so that the elements may be declared any type of child of parent Shape======");

        Shape[] shapes = new Shape[3];
        shapes[0] = new Shape();
        shapes[1] = new Circle();
        shapes[2] = new Triangle();

        for (Shape each : shapes){
            each.draw();
        }

        System.out.println("========Polymorphism for the array object itself so that all elements has to be Circle here======");
        Shape[] shapes2 = new Circle[2];
        shapes2[0] = new Circle();
        shapes2[1] = new Elips();
        //shapes[1] = new Triangle();//compiler excepts however it gives RunTime Error because we try to insert a Triangle object into a Circle bucket


        for(int i=0; i< shapes2.length; i++){
            shapes2[i].draw();
        }

        Circle[] c = new Circle[10];
        //Elips[] e = (Elips[]) c;//error: We cannot down-cast an array like that
        Shape[] s2 = new Shape[10];
       // c = (Circle[]) s2;//error: We cannot down-cast an array like that

        Shape[] s3 = new Circle[10];
        Circle[] c3 = (Circle[]) s3;
        c3[0] = new Circle();
        c3[1] = new Elips();
        System.out.println("c3[0].x = " + c3[0].x);
        System.out.println("c3[0].x = " + Circle.x);
        c3[0].draw();

        System.out.println("c3[1].x = " + c3[1].x);
        System.out.println("c3[1].x = " + Elips.x);
        c3[1].draw();
        System.out.println(Arrays.toString(c3));


    }
}
