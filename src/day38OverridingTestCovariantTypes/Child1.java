package day38OverridingTestCovariantTypes;

public class Child1 extends Parent{

    public Parent m1ReturningParent(){return new Parent();}

    public Child1 m2ReturningChild1(){return new Child1();}
    //public Child2 m2ReturningChild1(){return new Child2();}//error: ?? incompatible return type error ALTHOUGH Child1 is sibling (at the same level) of Child2
    //public SubChildOfChild1 m2ReturningChild1(){return new SubChildOfChild1();} //no error when trying to return child of the return type
    //public SubChildOfChild2 m2ReturningChild1(){return new SubChildOfChild2();} //error: ?? incompatible return type error when trying to return child of the return type
    //public Parent m2ReturningChild1(){return new Parent();} //error: incompatible return type which is higher level than the parent method



    public Child2 m3ReturningChild2(){return new Child2();}
    //public SubChildOfChild2 m3ReturningChild2(){return new SubChildOfChild2();} //no error as returning covariant type
    //public SubChildOfChild1 m3ReturningChild2(){return new SubChildOfChild1();} //error: ?? incompatible return type error when trying to return child of the return type
    //public Parent m3ReturningChild2(){return new Parent();} //error: incompatible return type which is higher level than the parent method
    //public Child1 m3ReturningChild2(){return new Child1();} error: ?? incompatible error ALTHOUGH Child2 is sibling (at the same level) of Child1

    public SubChildOfChild2 m4ReturningSubChildOfChild2(){return new SubChildOfChild2();}

    public SubChildOfChild1 m5ReturningSubChildOfChild1(){return new SubChildOfChild1();}

    //P.S. When overriding:
    // 1. Return type is not allowed to be the sibling of the return type,
    // 2. Return type is not allowed to be the child of the sibling of the return type


    public static void m6StaticMethod(){} //here it is the method hiding (of the static method of the parent class)

    public void m7StaticMethod(){} //here it is the method overriding (of the non-static method of the parent class)






}
