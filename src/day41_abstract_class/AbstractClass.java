package day41_abstract_class;

import day42_interface.ITestable2;

public abstract class AbstractClass implements ITestable2 {

    static String staticStr;
    int x;
    public static final String ACTION = "Try";


    public AbstractClass(){}//constructor of an abstract class can have all 4 access modifiers: public, protected, default and private
    protected AbstractClass(String s, int x){}
    AbstractClass(String s){}
    private AbstractClass(int y){}

    public abstract String abstractMethodM1();
    protected abstract void abstractMethodM2();
    abstract int abstractMethodM3();
    public abstract void eat();
    //void eat1(); //error: missing abstract keyword
    abstract void eat2();
    //private abstract int abstractMethodM4();//an abstract method cannot be private.

    public void RegularMethodM2(){ //An abstract class can have any type of non-abstract methods
       //Math math = new Math(); Since Math class has a private constructor, it cannot be instanced.
    }

    void RegularMethodM4(){}

    public static void RegularStaticMethod3(){}

    private void RegularStaticMethod4(){}

    private static void RegularStaticMethod5(){}



}
