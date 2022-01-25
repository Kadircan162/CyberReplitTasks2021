package day45_exception;

public class NullPointer {
    static String name;

    public static void main(String[] args) {
        try {
            System.out.println("name.toLowerCase() = " + name.toLowerCase());
        }catch (NullPointerException n){//ArithmeticException does not work here as it's not an arithmetic exception but NullPointerException6
            System.out.println("n.getStackTrace() = " + n.getStackTrace());
            System.out.println("n.getMessage() = " + n.getMessage());
            System.out.print("n.printStackTrace(): ");
            n.printStackTrace();
            System.out.println("n.toString() = " + n.toString());
        }
    }
}
