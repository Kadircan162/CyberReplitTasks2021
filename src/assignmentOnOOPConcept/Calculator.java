package assignmentOnOOPConcept;

//Question-10
public class Calculator {

    public static int plus(int a, int b){
        return a+b;
    }

    public static int minus(int a, int b){
        return a-b;
    }
}

class Test10{
    public static void main(String[] args) {
        System.out.println(Calculator.minus(1, 1));
        System.out.println(Calculator.plus(10, 1));

    }

}
