package day40_accessmodifiers_final;


public class InnerClassWithAnyAccessModifiers {

    //Private nested or inner class
    private class PrivateInnerClass { //Inner class with private access modifier
        public void display() {
            System.out.println("Private inner class method called");
        }
    }

    protected class ProtectedInnerClass{
        public void display2(){
            System.out.println("Protected inner class method called");
        }
    }

    class DefaultInnerClass{
        public void display3(){
            System.out.println("Default inner class method called");
        }
    }
    public class PublicInnerClass{
        public void display4(){
            System.out.println("Public inner class method called");
        }
    }

    void myInnerClasses() {
        System.out.println("Outer public class method called");
        // Access the private inner class
        PrivateInnerClass innerDisplay = new PrivateInnerClass();
        innerDisplay.display();

        ProtectedInnerClass innerProtectedClass = new ProtectedInnerClass();
        innerProtectedClass.display2();

        DefaultInnerClass defaultInnerClass = new DefaultInnerClass();
        defaultInnerClass.display3();

        PublicInnerClass publicInnerClass = new PublicInnerClass();
        publicInnerClass.display4();

        DefaultOuterClass defaultOuterClass = new DefaultOuterClass();
        defaultOuterClass.display5();
    }

}

class DefaultOuterClass{
    public void display5(){
        System.out.println("Default outer class method called");
    }
}



