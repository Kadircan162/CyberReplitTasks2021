package day41_abstract_class;

public abstract class ChildOfAbstractClass extends AbstractClass {

    static Dog dog = new Dog();

    @Override
    protected void abstractMethodM2() {

    }

    @Override
    int abstractMethodM3() {
        return 0;
    }

    @Override
    public String abstractMethodM1() {
        return null;
    }

    public void test1(){
        //AbstractClass a = new AbstractClass();//abstract class cannot be instanced.


        abstractMethodM1();//child class is able to call an abstract class however there is no point to call it since there is no implementation in it.
        RegularMethodM2();
        RegularStaticMethod3();

        AbstractClass.RegularStaticMethod3();

        System.out.println("super.x = " + super.x);
        System.out.println("super.staticStr = " + super.staticStr);
        super.RegularMethodM2();
        super.RegularStaticMethod3();
        //super.abstractMethodM1();//error: Abstract method 'abstractMethodM1()' cannot be accessed by super keyword

    }

    @Override
    public void RegularMethodM2() {//As a sub-class, I don't have to override a regular (non-abstract) method
        super.RegularMethodM2();
    }

    public void test2(){
        System.out.println("AbstractClass.staticStr = " + AbstractClass.staticStr);
        AbstractClass.RegularStaticMethod3();

        AbstractClass b = new AbstractClass() {
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

            } //Anonymous class usage: this is how you instantiate a subclass of an abstract class
            @Override
            public void RegularMethodM2() {//As a sub-class, I don't have to override a regular (non-abstract) method
                super.RegularMethodM2();
            }

            @Override
            public String abstractMethodM1() {
                return "Apple";
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
        };



        b.abstractMethodM1();//we can call an abstract method by instantiating using anonymous class
        b.RegularMethodM2();
        b.RegularStaticMethod3();
        System.out.println("b.x = " + b.x);
        System.out.println("b.staticStr = " + b.staticStr);

    }

    public static void main(String[] args) {
        AbstractClass b = new AbstractClass() {
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

            } //This is creating an Anonymous subclass which is used only one time, and it doesn't have a space in heap.
            @Override
            public String abstractMethodM1() {

                return "Orange";
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
        };

        b.abstractMethodM1();
        b.RegularMethodM2();
        b.RegularStaticMethod3();
        System.out.println("b.x = " + b.x);
        System.out.println("b.staticStr = " + b.staticStr);
    }

    public abstract void childAbstractClass();
}
