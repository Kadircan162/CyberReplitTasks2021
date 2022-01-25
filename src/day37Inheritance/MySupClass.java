package day37Inheritance;

public abstract class MySupClass {

    private class Class1{}
    protected class Class2{}
    class Class3{}
    //public Class4{} //error: An inner class cannot be public since the public class name is also the .java file name and a .java
    //file can only have either public or default access modifier

    static String name;
    int x;

    //abstract String str; //error: a variable cannot be abstract
    //static abstract int y; //error: a variable cannot be abstract

    {
        //as an abstract class I can have an instance block.
    }

    static {
        //as an abstract class I can have static block.
    }

    MySupClass(){

    }

    MySupClass(int x){
        this.x = x;
    }

    /*public abstract final void m1(){ //We cannot make an abstract method final.

    }
    */

    //private abstract void M1(); //error: an abstract method cannot be private since it cannot be implemented by subclasses by this way.
    abstract void M2();
    protected abstract void M3();
    public abstract void M4();

}
