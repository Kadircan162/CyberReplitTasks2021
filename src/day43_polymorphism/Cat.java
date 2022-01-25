package day43_polymorphism;

public class Cat extends Animal implements Livings,Walkings{
    static int catCount = 10;

    public static void main(String[] args){
        System.out.println("catCount = " + catCount);

        throw new ArithmeticException("Arithmetic exception happened");
    }
}
