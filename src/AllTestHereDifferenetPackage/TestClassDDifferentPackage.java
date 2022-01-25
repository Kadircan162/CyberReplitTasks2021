package AllTestHereDifferenetPackage;


//import AllTestsHere.ClassD; error: default class cannot be imported from different package
//import AllTestsHere.ClassD; //public class can be imported from different package

import AllTestsHere.ClassD;

import java.util.ArrayList;
import java.util.List;

public class TestClassDDifferentPackage extends ClassD{

    @Override
    protected void protectedM3() {

    }

    public void TestDefaultClassDifferentPackage(){

        System.out.println("==========Creating object from class without inheritance========");

        // ClassD classD = new ClassD(); //error: class with default constructor cannot be instanced from different package
        // ClassD classD = new ClassD(); //class with public constructor can be instanced from different package
        //ClassD classD = new ClassD(); //error: class with private constructor cannot be instanced at all
        //ClassD classD = new ClassD(); //error: class with protected constructor cannot be instanced from different package w or w-o
                                        //the class (ClassD) is extended
        //ClassD classD = new ClassD(); //a class can be instanced from different package only when its constructor is public


        System.out.println("==========Accessing object from class via inheritance========");

        System.out.println("public_x = " + public_x);//public variables can be accessed (inherited) from outside package via inheritance even though
                                                        //the super constructor is protected.
        //System.out.println("default_str = " + default_str);//error: default variables cannot be accessed (inherited) even with an inheritance relation
        System.out.println("protected_d = " + protected_d);//protected variables can be accessed (inherited) from outside package via inheritance even though
                                                            //the super constructor is protected.
        //System.out.println("private_c = " + private_c); //error: private variables cannot be accessed (inherited) at all

        //Same rules above of accessing from outside package via inheritance apply with the static variables as well.
        /*
        System.out.println("public_static_y = " + public_static_y);
        System.out.println("default_static_str = " + default_static_str);//error
        System.out.println("protected_static_d = " + protected_static_d);
        System.out.println("private_static_c = " + private_static_c);//error
        protected_staticM7();
        public_staticM5();
        ClassD.protected_staticM7();//Class (static) variables can be accessed (inherited) from outside package only via inheritance.
        ClassD.public_staticM5();
        System.out.println("ClassD.protected_static_d = " + ClassD.protected_static_d);
        */


    }
}
