package day45_exception;

public class ThrowvsThrows {

    public static void main(String[] args) {
        System.out.println("Hello World");
        //throw new RuntimeException("Runtime exception");//unchecked exception so that no need to cover it in try-catch block or use throws
        //keyword on method signature.
        try {
            throw new Exception("Exception");//This is a checked exception that's needed to be try-catched or use throws keyword
            //on method signature.
        } catch (Exception e) {
            e.printStackTrace();
        }

        String userName = "";
        if(userName.isEmpty()){
            throw new RuntimeException("Username cannot be empty");
        }else{
            System.out.println("Valid username");
        }

    }

    public static void sleep(int seconds) throws InterruptedException {
        try {
            Thread.sleep(seconds*1000);
        }catch (Exception e){
            System.out.println("That's all");
        }
        Thread.sleep(seconds*1000);//Thread.sleep has a checked exception so we should handle it either with a try-catch block or
        //throws keyword on method signature
    }
}
