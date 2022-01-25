package day37Inheritance;

public class Apple extends Fruits{

    public Apple() { //Here the constructor can be either a non-argument or an argument constructor. But
        //the super should be called with an argument since the parent class has only an argument constructor.
        super("Apple");
    }

    @Override
    public void taste(String s) {

        System.out.println(name + " tastes " + s);

    }
}
