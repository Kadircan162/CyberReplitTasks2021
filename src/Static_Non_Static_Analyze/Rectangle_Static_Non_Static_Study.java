package Static_Non_Static_Analyze;

public class Rectangle_Static_Non_Static_Study { // * if you do not create a constructor in a class, jvm automatically creates one when you create object.
                        // ** if you create constructor with arguments and assign variables inside the constructor
                        // and create class object, it makes the object variables how that constructor assigns values.
                        // *** if you create a constructor manually with no arguments and create a class object,
                        // the object variables are still created with default values
                        // **** You can reach and use NON-STATIC variables and NON-STATIC methods of a class object only by using object reference like
                                // Rectangle rec = new Rectangle (); --> rec.length; rec.RecMe(); but cannot reach them by class reference like
                                // Rectangle.area; Rectangle.RecMe(); where 'area' and 'RecMe2' are non-static.
                        // However, if those variables and methods are STATIC inside the class object, then you CANNOT reach and use them
                        // by using object reference (Or you should somehow force using them by typing manually).
                        // Only way of using STATIC variables and STATIC methods in a class object is to use class reference name like -->
                        // Rectangle.width; Rectangle.RecMe2(); where length and RecMe are STATIC.

    static double lengthStatic;
    static double widthStatic;
    double areaNonStatic;

//    public Rectangle(){
//            length = 5.6;
//            width = 7.1;
//            area = length*width;
//    }
//    public Rectangle(double a, double b){
//
//    }

     public static int RecMeStatic(){
         System.out.println(lengthStatic);
         System.out.println(Rectangle_Static_Non_Static_Study.lengthStatic);
         Rectangle_Static_Non_Static_Study r = new Rectangle_Static_Non_Static_Study();
         System.out.println(r.lengthStatic);
        // RecMe2NonStatic(); error: non-static method RecMe2() cannot be referenced and used from a static context
        // d2 = 6.8; error: non-static variable area cannot be referenced and used from a static context
         // non-static variable or method from static method is ERROR.
        double d1 = lengthStatic;
        int b = 4;
        int c = 5;
        return b*c;
    }

    public void RecMe2NonStatic(){
        RecMeStatic(); // However, either a static or non-static variable or a method can be referenced and used freely by non-static method.
                // Static variable or method from non-static is OK.
        double d2 = lengthStatic;
    }


}
