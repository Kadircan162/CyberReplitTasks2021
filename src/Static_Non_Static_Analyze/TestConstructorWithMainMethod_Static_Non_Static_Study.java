package Static_Non_Static_Analyze;

public class TestConstructorWithMainMethod_Static_Non_Static_Study {
    double dt;
    static double dt2;

    public static void main(String[] args) {
       Rectangle_Static_Non_Static_Study rec1 = new Rectangle_Static_Non_Static_Study();

        System.out.println(rec1.widthStatic); // --> Although the variable are static in the class, you're able to use them with object reference by typing manually
        System.out.println(rec1.lengthStatic);
        System.out.println();


        System.out.println(rec1.areaNonStatic);
        System.out.println(rec1.areaNonStatic);


        System.out.println(rec1.RecMeStatic()); // --> Although the method is static in the class, you're able to use them with object reference by typing manually
        System.out.println(rec1.RecMeStatic());

        Square_Static_Non_Static_Study sq1 = new Square_Static_Non_Static_Study();
        System.out.println(sq1.widthNonStatic);
        // Square.width; --> error: not a statement because the with variable is non-static in the class, you can only use it by object reference
        Square_Static_Non_Static_Study rec4 = new Square_Static_Non_Static_Study(15);

    }
    public void Test1(){
        Rectangle_Static_Non_Static_Study rec1 = new Rectangle_Static_Non_Static_Study();
        rec1.RecMeStatic();   // it does not change if you try to reach a static variable or a static method of an object
                        // from a static or non-static method of another class. Still you need to use class reference like --> Rectangle.width; Rectangle.RecMe();
        System.out.println(rec1.widthStatic);
        System.out.println(rec1.areaNonStatic);
        rec1.RecMe2NonStatic();  // you can freely reach and use a non-static variable or a non-static method from a static or a non-static method only when they're
                        // of an object
        System.out.println(rec1.areaNonStatic);

        System.out.println(dt);

        System.out.println(Rectangle_Static_Non_Static_Study.RecMeStatic()); // otherwise, you need to use class reference to use static method or variable.
        System.out.println(Rectangle_Static_Non_Static_Study.widthStatic);

    }
    public static void Test2(){
        Rectangle_Static_Non_Static_Study rec2 = new Rectangle_Static_Non_Static_Study();
        System.out.println(rec2.areaNonStatic); // area is a non-static variable but can be reached by a static method only when it's an object variable or method
        // System.out.println(dt); --> error : dt is non-static variable of this class so a non-static var or method cannot be reached by static method in the
        // same class
        System.out.println(dt2); // dt2 is a static variable of this class so a static var or method can be reached by static method
    }
    public void Test3(){
        System.out.println(dt); // a non-static method can reach any static or non-static variable method either in the same class or from a created object
        System.out.println(dt2);
        Rectangle_Static_Non_Static_Study rec3 = new Rectangle_Static_Non_Static_Study();
        System.out.println(rec3.areaNonStatic);
        System.out.println(rec3.lengthStatic);
    }
}
