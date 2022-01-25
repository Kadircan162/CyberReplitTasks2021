package AllTestsHere;

public class ClassDTestSamePackage {

//    Accessing a class via importing it,
//
//    Accessing the constructor of a class via creating an object,
//
//    Accessing instance variables and methods of a class by object reference,
//
//    Accessing static (class) variables and methods of a class by ClassName,
//
//    Accessing variables and methods of a class by inheritance (Super/Sub).


    public void mTestDefaultClassSamePackage(){


        //ClassD classD = new ClassD(); //error: class with private constructor cannot be instanced at all even though from the same package
        ClassD classD = new ClassD(); //class with protected constructor can be instanced from same package (even without extending)

        System.out.println("==========Instance variables========");

        System.out.println("classD.x = " + classD.public_x);
        System.out.println("classD.str = " + classD.default_str);
        System.out.println("classD.d = " + classD.protected_d);
        //System.out.println("classD.c = " + classD.private_c); //error: private instance variable


        System.out.println("==========Instance methods========");

        classD.publicM1();
        classD.defaultM2();
        classD.protectedM3();
        //classD.privateM4(); //error: private instance method


        System.out.println("==========Static (Class) variables========");

        System.out.println("classD.public_static_y = " + ClassD.public_static_y);
        System.out.println("classD.default_static_str = " + ClassD.default_static_str);
        System.out.println("classD.protected_static_d = " + ClassD.protected_static_d);
        //System.out.println("classD.private_static_c = " + ClassD.private_static_c); //error: private static (class) variable
        ClassD.public_staticM5();
        ClassD.default_staticM6();
        ClassD.protected_staticM7();
        //ClassD.private_staticM8(); //error: private static (class) method



    }

}
