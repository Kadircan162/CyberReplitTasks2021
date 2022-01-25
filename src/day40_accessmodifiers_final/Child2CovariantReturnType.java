package day40_accessmodifiers_final;

public class Child2CovariantReturnType extends ParentCovariantReturnType{

    @Override
    public ParentCovariantReturnType method1(ParentCovariantReturnType p){
        return p;
    }

    @Override
    public Child1CovariantReturnType method2(Child1CovariantReturnType s){
        return s;
    }

    @Override
    public SubClassOfChild1CovariantReturnType method3(SubClassOfChild1CovariantReturnType s){
    return s;
    }

    @Override
    public Child2CovariantReturnType method4(Child2CovariantReturnType c2){
        return c2;
    }

    @Override
    public void method5(){

    }




}
