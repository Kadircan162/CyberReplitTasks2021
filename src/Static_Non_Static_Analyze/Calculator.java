package Static_Non_Static_Analyze;

public class Calculator {

    private static void sum(){
        Calculator.sum();
        Calculator v1 = new Calculator();
        v1.sumTest();
        sum();

        Calculator.sum();

    }

    public static void main(String[] args) {
        sum();
        Calculator c1 = new Calculator();
        c1.sumTest();
        Calculator.sum();

    }
    public void sumTest(){
        Calculator.sum();
        Calculator ca = new Calculator();
        ca.sum();
        sum();
    }

}
