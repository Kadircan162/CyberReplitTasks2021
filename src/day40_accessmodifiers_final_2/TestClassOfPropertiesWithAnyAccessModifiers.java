package day40_accessmodifiers_final_2;


import day40_accessmodifiers_final.ClassOfPropertiesWithAnyAccessModifiers;

public class TestClassOfPropertiesWithAnyAccessModifiers extends ClassOfPropertiesWithAnyAccessModifiers {

    public void accessViaInstanceVariable(){

        ClassOfPropertiesWithAnyAccessModifiers c = new ClassOfPropertiesWithAnyAccessModifiers();

        //c.protectedM1(); //error: a protected method at the class in different package cannot be accessed only by instance variable even though it's inherited.
        //System.out.println("c.protectedX = " + c.protectedX); //error: a protected variable at the class in different package cannot be accessed via instance variable even though it's inherited.
        //System.out.println("c.protectedS = " + c.protectedS);

        //c.defaultM2(); //error: a default method cannot be accessed from another class outside the package
        //System.out.println("c.defaultY = " + c.defaultY); //error: a default variable cannot be accessed from another class outside the package
        //System.out.println("c = " + c.defaultS2);


        c.publicM3(); //a public method is accessible from anywhere, even from another class outside the package
        System.out.println("c.publicZ = " + c.publicZ); //a public method is accessible from anywhere, even from another class outside the package

        //System.out.println("c.privateK = " + c.privateK); //error: a private variable can only be accessed within the same class
        //c.privateM4(); //error: a private method can only be accessed within the same class.

    }

    public void accessAsASubclassThroughInheritance(){

       // protectedM1();//a protected method at the class outside the package is accessible only from subclass (by inheriting)
       // System.out.println("x = " + protectedX);//a protected variable at the class outside the package is accessible only from subclass (by inheriting)
       // System.out.println("s = " + protectedS);

        //defaultM2();//error: a default method cannot be accessed at all from outside its package nevertheless its class inherited
        //System.out.println("defaultY = " + defaultY); //error: a default variable cannot be accessed at all from outside its package nevertheless its class inherited
        //System.out.println("defaultS2 = " + defaultS2);

       // publicM3(); //a public method is accessible from anywhere, even from another class outside the package
       // System.out.println("publicZ = " + publicZ); //a public variable is accessible from anywhere, even from another class outside the package

        //privateM4();//error: a private method can only be accessed within the same class
        //System.out.println("privateK = " + privateK); //error: a private variable can only be accessed within the same class
    }


}
