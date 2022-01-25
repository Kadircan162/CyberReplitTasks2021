package day37Inheritance;

public class MySubClass extends MySupClass {
    //Here although I don't call super() constructor, no error occurs as there is a non-argument constructor in the parent class so that
    //it's implicitly called here in my implicit constructor.

    public static void main(String[] args) {
        System.out.println("name = " + name);
    }

    MySubClass(){

        System.out.println("super.x = " + super.x);

    }

    @Override
    void M2() {

    }

    @Override
    protected void M3() {

    }

    @Override
    public void M4() {

    }
}
