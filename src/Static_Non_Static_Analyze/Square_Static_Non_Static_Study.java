package Static_Non_Static_Analyze;

public class Square_Static_Non_Static_Study {
    double widthNonStatic;
    static double areaStatic;

    public Square_Static_Non_Static_Study(){
        System.out.println(widthNonStatic);
        System.out.println(areaStatic);
        System.out.println(this.widthNonStatic);
        System.out.println(this.areaStatic); // no need to use 'this' here for a static global variable
        System.out.println(Square_Static_Non_Static_Study.areaStatic); // global Static variable can also be reached
                                                //by using own class reference
    }
    public Square_Static_Non_Static_Study(double width){
        this.Test1NonStatic(); // object reference calling non-static method
        Test1NonStatic(); // non-static can call non-static method directly
        // Square_Static_Non_Static_Study.Test1NonStatic(); --> error: Class reference can call only static methods
                                        // (Non-static method 'Test1NonStatic()' cannot be referenced from a static context)

        Test2Static(); // non-static method can call a Static method by calling directly the method itself
        this.Test2Static(); //this can call a Static method only by hardcoding the method name after dot

        System.out.println(widthNonStatic); // non-static method can call non-static global variable
        System.out.println(areaStatic); // non-static method can call Static global variable

        System.out.println(this.widthNonStatic); //'this' can also be used to call a non-static (global) variable from a non-static method
        System.out.println(this.areaStatic); // 'this' can also be used forcefully (hardcoded) to call a static (global) variable from a non-static method

        System.out.println(Square_Static_Non_Static_Study.areaStatic); // class reference is used to call a static variable or method
        // System.out.println(Square.widthNonStatic); --> error: class reference cannot be used to call a non-static variable or method

        // new Square(11); --> error: infinite loop

    }
    public void Test1NonStatic(){
        System.out.println(this.areaStatic);

        int i1NonStatic = 0;
        this.Test1NonStatic(); // non-static calls NON-STATIC itself using object reference 'this'--> OK
        this.Test4NonStatic(); // non-static calls other NON-STATIC method using object reference 'this'--> OK
        // Square.Test1NonStatic; --> error : Cannot resolve symbol 'Test1' when calling itself with class reference
        this.Test2Static(); // non-static calls STATIC using object reference 'this'--> Actually not OK but forcing to call it by typing manually makes it functional
        Square_Static_Non_Static_Study.Test2Static(); // Non-static method calls STATIC method with class reference --> OK
        // Square.Test1NonStatic(); --> error: Non-static method 'Test1()' cannot be referenced from a static context because class reference is used for calling
                                // a STATIC variable or method
        // Square.i1NonStatic; --> error: Cannot resolve symbol 'i1' when calling a non-static variable of itself by using class reference
        Test2Static();
        this.Test3Static(); // non-static calls STATIC method using object reference 'this' --> Actually not OK but forcing to call it by typing manually makes it functional
        Square_Static_Non_Static_Study.Test3Static(); // non-static calls STATIC using class reference variable
        Test3Static();
        this.Test4NonStatic(); // non-static calls NON-STATIC using object reference 'this'--> OK
        Test4NonStatic();

        //Global variables
        System.out.println(widthNonStatic); // non-static method can reach and use any global variables regardless of they're static or non-static
        System.out.println(areaStatic);

        //Square.Test4()NonStatic; --> error : Non-static method cannot call STATIC method by using class reference --> 'Test4()' cannot be referenced from a static context (class reference)

        Rectangle_Static_Non_Static_Study r1 = new Rectangle_Static_Non_Static_Study();
        r1.RecMe2NonStatic();
        r1.RecMeStatic(); // non-static method can call Static method by using object reference (hardcoded after dot)
        System.out.println(r1.lengthStatic); // non-static method can call Static variable by using object reference (hardcoded after dot)
        System.out.println(r1.areaNonStatic); // // non-static method can call Non-Static variable by using object reference

        Rectangle_Static_Non_Static_Study.RecMeStatic(); // non-static method can call Static method by using class reference
        System.out.println(Rectangle_Static_Non_Static_Study.lengthStatic);// non-static method can call Static variable by using class reference
        //Rectangle.RecMe2NonStatic(); // --> error: class reference cannot call a non-static method
        //System.out.println(Rectangle.areaNonStatic); // --> error: class reference cannot call a non-static variable

    }
    public static void Test2Static(){ // static calls static
        Rectangle_Static_Non_Static_Study r = new Rectangle_Static_Non_Static_Study();
        System.out.println(r.lengthStatic);
        r.RecMeStatic();
        r.RecMe2NonStatic();

        //Global variables
        // widthNonStatic; error --> even it's a global variable, a static method CANNOT reach and use a non-static variable
        System.out.println(areaStatic); // a static method can ONLY reach and use STATIC variable.
        Square_Static_Non_Static_Study s1 = new Square_Static_Non_Static_Study();
        s1.Test4NonStatic(); // only way for a static method in a class to reach a non-static method in the same class
        // is to create its own object and reach via object reference.
        Square_Static_Non_Static_Study s2 = new Square_Static_Non_Static_Study();
        System.out.println(s2.areaStatic);


        //static boolean b = false; // error: Modifier 'static' not allowed here
        boolean b = false;
        //Square.b;  --> error: Cannot resolve symbol 'i1' when calling a non-static variable of itself by using class reference
        Square_Static_Non_Static_Study.Test2Static(); // static method calls STATIC method itself with class reference --> OK
        Square_Static_Non_Static_Study.Test3Static(); // static calls other STATIC method with class reference --> OK
        Test2Static(); // static calls STATIC method itself with invisible class reference --> OK
        Test3Static(); // static calls other STATIC method with invisible class reference --> OK
        // Square.Test4NonStatic(); --> error: static calls NON-STATIC --> Non-static method 'Test4()' cannot be referenced from a static context
                                // as class reference is used to call STATIC variables and methods
        //Square.d4NonStatic; //--> error : other method's variable cannot be seen by others (not related to being static or non-static).
        //System.out.println(d4); //--> error : other method's variable cannot be seen by others (not related to being static or non-static).
        //widthNonStatic; --> error : static method cannot call a NON-STATIC global variable (of own class) --> Non-static field 'widthNonStatic' (this class's variable) cannot be referenced from a static context.
        // Test4NonStatic(); --> error : static method cannot call a NON-STATIC method (of own class)
        double area2 = areaStatic; // static method calls Static variable of this class --> OK
        Rectangle_Static_Non_Static_Study r2 = new Rectangle_Static_Non_Static_Study();
        System.out.println(r2.lengthStatic); //static method calls STATIC variable of an object with object reference --> Actually not OK but forcing to call it by typing manually makes it functional
        r2.RecMeStatic();
        r2.RecMe2NonStatic(); // object reference in static method can call a non-static method from another class object
        System.out.println(r2.areaNonStatic); // object reference in static method can call a non-static method from another class object
        Rectangle_Static_Non_Static_Study.RecMeStatic();// static method can call STATIC method of an object with class reference
        System.out.println(Rectangle_Static_Non_Static_Study.lengthStatic); // static method can call STATIC variable of an object with class reference
        //System.out.println(Rectangle.areaNonStatic); // error: Non-static field 'areaNonStatic' cannot be referenced from a static context
        //Rectangle.RecMe2NonStatic(); // error: Non-static method 'RecMe2NonStatic()' cannot be referenced from a static context

        // this.Test3Static(); --> error : 'this' cannot be referenced from a static context (method) at all.
        // this.Test4NonStatic(); --> error : 'this' cannot be referenced from a static context (method) at all.


    }
    public static void Test3Static(){
        //static int a=0; error: local variable cannot be static
        Test2Static();
        System.out.println(Square_Static_Non_Static_Study.areaStatic);
        // this.Test1(); --> error : 'this' cannot be referenced from a static context
        // Test4NonStatic(); --> error: Non-static method 'Test4NonStatic()' cannot be referenced from a static context
    }
    public void Test4NonStatic(){
        double width4 = widthNonStatic; // non-static method calls Non-static variable of this class --> OK
        double area4 = widthNonStatic; // non-static method calls Static variable of this class --> OK
        double d4NonStatic = 5.5;

        this.Test1NonStatic(); // object reference calling non-static method
        Test1NonStatic(); // non-static can call non-static method directly
        // Square.Test1NonStatic(); --> error: Class reference can call only static methods
        // (Non-static method 'Test1NonStatic()' cannot be referenced from a static context)
        System.out.println(widthNonStatic); // non-static method can call non-static global variable
        System.out.println(areaStatic); // non-static method can call Static global variable
        // new Square(11); --> error: infinite loop
        System.out.println(widthNonStatic);

        Test3Static(); //non-static method can call STATIC method itself with class reference of its own class --> OK
        Square_Static_Non_Static_Study.Test3Static(); //non-static method can call STATIC method itself with class reference of its own class --> OK
        Test4NonStatic(); // calling itself
        this.Test4NonStatic(); // calling itself ('this' can only be used in a non-static method)
        //Square.Test4();// --> error: Non-static method 'Test4()' cannot be referenced from a static context as class reference can only be used
                                // for calling a STATIC method
        Rectangle_Static_Non_Static_Study rec4 = new Rectangle_Static_Non_Static_Study();
        System.out.println(rec4.areaNonStatic); // non-static method can call Non-Static variable using object reference
        System.out.println(Rectangle_Static_Non_Static_Study.lengthStatic); // non-static method can call Static variable using object reference forcefully (hardcoded)
        //System.out.println(Rectangle.areaNonStatic); //Non-static field 'areaNonStatic' cannot be referenced from a static context as class reference
                                                        // can be used only for calling STATIC variables or methods
        Rectangle_Static_Non_Static_Study.RecMeStatic();//non-static method can call STATIC method using class reference
        rec4.RecMeStatic();//non-static method can call STATIC method using object reference forcefully (hard coded)

        // OVERALL:
        // Object reference in either Static or Non-static method can call a Non-Static variable or method. (r2.RecMe2NonStatic() , System.out.println(r2.lengthStatic))
        // However, an object reference in either Static or Non-static method can call a static variable or method ONLY by hardcoding after dot.
        // Class reference in either Static or Non-static method can call ONLY STATIC variable or method.
        // However, class reference in either Static or Non-static method CANNOT call a NON-STATIC variable or method. (error: Rectangle.RecMe2NonStatic())
        // 'this' can only be used in a NON-STATIC method, and it acts as same as an object reference.
        // In a non-static method, either STATIC or NON-STATIC methods or variables can be called and used.
        // However, in a STATIC method, only STATIC methods or variables can be called and used.
        // In a STATIC method, NON-STATIC methods and variables of an object CANNOT be used by using class reference (error: Rectangle.RecMe2NonStatic(),
        // error: System.out.println(Rectangle.areaNonStatic))
        // However, in a STATIC method, NON-STATIC methods and variables of an object CAN ONLY be used by using object reference (r2.RecMe2NonStatic();
        // System.out.println(r2.areaNonStatic);)
        //Global variables
            //Non-static method can reach and use any global variables regardless of they're static or non-static (System.out.println(widthNonStatic);)
            //However, even it's a global variable, a static method CANNOT reach and use a non-static variable (widthNonStatic; error)
            //A static method can ONLY reach and use STATIC variable (System.out.println(areaStatic);)
        //Static method in a class cannot reach a NON-STATIC methods in the same class. So, if there is a main method
        //in a class (public static void main(String[] args)), non-static classes become unreachable from the main method, however
        //only way for a Static method in a class to reach a non-static class is to create its own class's object and use
        //the object reference to reach that non-static method. But this way doesn't work for a local variable of the non-static method in the same class.
        //However, a static method of a class can reach another class's (object's) NON-STATIC variables or methods only
        //by using object reference (r2.SquareMeNonStatic) -- CANNOT do that by using class reference

    }
}
