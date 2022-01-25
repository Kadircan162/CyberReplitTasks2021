package day40_accessmodifiers_final;

public class Test2ClassOfPropertiesWithAnyAccessModifiers extends ClassOfPropertiesWithAnyAccessModifiers{

    public void accessViaInstance(){

        ClassOfPropertiesWithAnyAccessModifiers c = new ClassOfPropertiesWithAnyAccessModifiers();

        c.protectedM1(); //a protected method can be accessed via instance variable even from a non-subclass (without inheriting)
        System.out.println("c.protectedS = " + c.protectedS); //a protected variable can be accessed via instance variable even from a non-subclass (without inheriting)
        System.out.println("c.protectedX = " + c.protectedX);

        c.defaultM2();
        System.out.println("c.defaultS2 = " + c.defaultS2);
        System.out.println("c.defaultY = " + c.defaultY);

        c.publicM3();
        System.out.println("c.publicZ = " + c.publicZ);

        //c.privateM4(); //error: a private method can only be accessed within the same class.
        //System.out.println("c.privateK = " + c.privateK); //error: a private variable can only be accessed within the same class

    }

    public void accessViaInheritance(){

        protectedM1();
        System.out.println("protectedS = " + protectedS);
        System.out.println("protectedX = " + protectedX);

        defaultM2();
        System.out.println("defaultY = " + defaultY);
        System.out.println("defaultS2 = " + defaultS2);

        publicM3();
        System.out.println("publicZ = " + publicZ);

        //c.privateM4(); //error: a private method can only be accessed within the same class.
        //System.out.println("c.privateK = " + c.privateK); //error: a private variable can only be accessed within the same class



    }

}
