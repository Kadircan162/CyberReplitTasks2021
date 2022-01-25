package day42_interface;

public interface ITestable extends NewTestable, ITestable2{//an interface can only extend an interface. Class cannot be extended by interfaces. And also an interface does not implement but extend another interface.

    String s="Banana"; //implicitly it's public static final
    public static final boolean IS_TESTABLE = true; //field variable is always public static final -- Modifiers 'public' 'static' 'final' is redundant for interface fields
    boolean IS_TEST_PASS = false; //implicitly it's public static final. (However it's public, it cannot be invoked from any other classes using object reference name but can only be
                                  //by Interfacename.fieldName)
    //protected boolean IS_PASS=false;//error: protected not allowed for fields
    //private boolean IS_PASS2=false; //error: private not allowed here
    final boolean b = true; //final is accepted for a field in an interface


    public static final String ACTION = "Try";//static+final can be used at the same time for a field


    //static {} //error: interfaces cannot have static block
    //{} //error: interfaces cannot have instance block

    //public ITestable(){}//error: In an interface, no constructor is allowed since an interface is not a class.

    public void charge1();//all public methods (with no block) in an interface are automatically assigned as abstract implicitly
    void charge2(); //In an interface, all methods (with no block) written in default-like-syntax are automatically assigned as public+abstract implicitly
    abstract void charge10(); //In an interface, all methods (with no block) written in default-like-syntax are automatically assigned as public+abstract implicitly

    public abstract void charge3();
    //public static abstract void charge4();//error:Illegal combination of modifiers: 'abstract' and 'static'
    //public final abstract  void charge5();//error:Illegal combination of modifiers: 'abstract' and 'static'

    //protected abstract void charge4();//error: an abstract method (with no block) cannot be protected in an interface
    //private abstract void charge5();//error: private+abstract is not allowed for an abstract method (with no block) in interface

    //void charge8(){} //error: regular method (with block) cannot have 'default access modifier' in interface as java takes it as being abstract class
    private void charge6(){}//private regular method is welcome in interface
    private static void charge7(){System.out.println("I'm private static");}//private regular method with static is welcome in interface
    //private final void charge12(){}//error: private with final keyword is NOT allowed for a method.
    //public final void charge13(){}//error: public+final is not allowed for a method with body.
    public static void charge8(){System.out.println("I'm public static");}//Modifier 'public' is redundant for interface methods
    //public regular method with static is welcome in interface. But it cannot be inherited or hidden by subclasses.
    static void charge12(){System.out.println("I'm static");}//Static method may be invoked on containing interface class only--here in the interface--and it's declared implicitly public
    //final static void charge13(){}//error:Illegal combination of modifiers: 'static' and 'final'
    //protected void charge7(){};//error: protected method cannot be created in an interface
    //public void charge9(){} //error: public regular method (with block) is not allowed in interface as java takes it as being abstract class
    public default void charging(){} //Interfaces can have a regular method (with body) with using "default" keyword but this is not access modifier,
                                        //it only shows it's an interface method (Modifier 'public' is redundant for interface methods )
    default void speeding(){} //A regular method can be without public however it's implicitly declared as public
    //protected default void test(){}//error: protected not allowed for a method.
    //private default void test2(){} //error: private and default keywords cannot be used at the same time
    //public default static void charge10(){}//error: default and static cannot be used at the same time for a method with body

    public static void main(String[] args) {//main method is welcome in an interface
        charge8();
        charge12();
        charge7();
    }
}
