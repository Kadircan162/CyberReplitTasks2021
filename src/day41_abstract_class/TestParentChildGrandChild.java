package day41_abstract_class;

public class TestParentChildGrandChild extends GrandChildOfAbstractClass{

    public static void main(String[] args) {

        T1(dog);
    }

    public static void T1(Dog dog){

        dog.breathe();
        dog.name = "Doggy";
        System.out.println("dog.name = " + dog.name);
//        Animal a = new Animal() {
//            @Override
//            void eat() {
//
//            }
//
//            @Override
//            void breathe() {
//
//            }
//        };

    }
}
