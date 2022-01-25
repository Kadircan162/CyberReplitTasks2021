package day38OverridingTestCovariantTypes;

public class Parent {

    public Parent m1ReturningParent(){return new Parent();}

    public Child1 m2ReturningChild1(){return new Child1();}

    public Child2 m3ReturningChild2(){return new Child2();}

    public SubChildOfChild2 m4ReturningSubChildOfChild2(){return new SubChildOfChild2();}

    public SubChildOfChild1 m5ReturningSubChildOfChild1(){return new SubChildOfChild1();}

    public static void m6StaticMethod(){}

    public void m7StaticMethod(){}

}
