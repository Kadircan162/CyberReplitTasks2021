package day40_accessmodifiers_final;

public class ParentCovariantReturnType {


    public ParentCovariantReturnType method1(ParentCovariantReturnType p){
        return p;
    }

    public Child1CovariantReturnType method2(Child1CovariantReturnType c1){
        return c1;
    }

    public SubClassOfChild1CovariantReturnType method3(SubClassOfChild1CovariantReturnType s){
        return s;
    }

    public Child2CovariantReturnType method4(Child2CovariantReturnType c2){
        return c2;
    }

    public void method5(){

    }


}
