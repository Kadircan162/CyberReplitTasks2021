package day37Inheritance;

public class SubClass extends SuperClass{

    public SubClass(){
        super(5);
    }

//
//    public SubClass(){
////        super(5); // if there is no constructor or there is a constructor with no arguments in Super class, jvm automatically
////                    // call default or no arg-constructor of Super class. However, in Super class, if there is a constructor
////                    //with an argument and there is no no-arg constructor, compiler gives an error to make sub-class explicitly
////                    //call super class constructor with argument. So, whenever you create a class, you should always create
////                    //a no-arg constructor in case it is extended(inherited) from a child class.
////        System.out.println("I'm subclass");
//    }

    public static void main(String[] args) {
        empolyee();
        System.out.println(company);
        System.out.println(employeeNumber);
    }

}
