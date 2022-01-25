package lab3StringMethodsPractice;

public class Question1ReturnsHelloFromBob {


    public static void main(String[] args){

        System.out.println(helloName("Bob"));
    }
    public static String helloName(String name){
        return "Hello ".concat(name).concat("!");
    }
}
