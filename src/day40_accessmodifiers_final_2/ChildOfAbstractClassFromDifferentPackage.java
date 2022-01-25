package day40_accessmodifiers_final_2;

import day41_abstract_class.AbstractClass;

public abstract class ChildOfAbstractClassFromDifferentPackage extends AbstractClass{//error: if an abstract super class in a different package has a default abstract method,
                                                                            //that super abstract class cannot be extended by concrete class, however it can be extended by an
                                                                            //abstract subclass.


    @Override
    public String abstractMethodM1() {
        return null;
    }

    @Override
    protected void abstractMethodM2() {

    }


//    int abstractMethodM3(){//error: default abstract methods cannot be implemented from super class
//
//    }
}
