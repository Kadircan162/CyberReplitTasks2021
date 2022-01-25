package day45_exception;

public class TryCatchFinallyBlock {

    public static void main(String[] args) {
        String str = "Selenium";

        try {
            System.out.println("str.length() = " + str.length());
            System.out.println("str.charAt(100) = " + str.charAt(100));
        }catch (Exception e){
            System.out.println("Enter correct index");
            System.out.println("e.getStackTrace() = " + e.getStackTrace());
            e.printStackTrace();
            System.out.println("e.getMessage() = " + e.getMessage());
            //System.exit(0); only when jvm crash or System.exit() method used, finally block does not work
            //return;//even if the method is closed with return, finally block still works
        }finally {//only when jvm crash or System.exit() method used, finally block does not work, otherwise it works all the time after all blocks
            System.out.println("Finally block");
        }
        System.out.println("Story ended");
    }
}
