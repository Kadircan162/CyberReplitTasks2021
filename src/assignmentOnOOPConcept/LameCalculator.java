package assignmentOnOOPConcept;

//Question-2
public class LameCalculator {

    public int plus(int num1, int num2){
        return num1+num2;
    }

    public int minus(int num1, int num2){
        return num1-num2;
    }

    public int multiply(int num1, int num2){
        return num1*num2;
    }

    public int divide(int num1, int num2){
        return num1/num2;
    }
}

class Test2{

    public static void main(String[] args) {
        LameCalculator lm = new LameCalculator();

        System.out.println(lm.plus(1, 3));
        System.out.println(lm.divide(15, 5));
        System.out.println(lm.minus(4, -9));
        System.out.println(lm.multiply(-4, 20));

    }
}
