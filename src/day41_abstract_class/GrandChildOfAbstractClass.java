package day41_abstract_class;

public class GrandChildOfAbstractClass extends ChildOfAbstractClass{

//    @Override
//    public void abstractMethodM1() { //Grand child can (optional if the parent of grandchild is not abstract) override the already implemented abstract class from Child class (implemented from parent class)
//
//    }

    public GrandChildOfAbstractClass(){
        super();
    }

    static Dog dog = new Dog();

    @Override
    public String abstractMethodM1() { //As a grandchild, I have to implement (override) any abstract methods of superclass if not implemented by child abstract class which is my parent class.
        return "Mellon";
    }

    @Override
    public void abstractMethodM2() {

    }

    @Override
    int abstractMethodM3() {
        return 0;
    }

    @Override
    public void eat() {

    }

    @Override
    void eat2() {

    }

    @Override
    public void test1() {

    }

    @Override
    public void RegularMethodM2() {

    }

    @Override
    public void test2() {

    }

    @Override
    public void childAbstractClass() { // as a child, I have to implement my parent's all abstract methods.

    }

    @Override
    public void charge1() {

    }

    @Override
    public void charge2() {

    }

    @Override
    public void charge3() {

    }

    @Override
    public void charge11() {

    }
}
