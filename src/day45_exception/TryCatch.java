package day45_exception;

public class TryCatch {

    public static void main(String[] args) {
        String str = "Java";
        try {
            //6String s = 5;//compiler error here that try-catch cannot handle
            System.out.println(str.charAt(0));
            System.out.println(str.charAt(5));
            System.out.println(str.charAt(1));//This line will not be executed after catching the exception above
        }catch (Exception e){//StringIndexOutOfBoundsException
            System.out.println(e.getMessage());
            try {//nested try-catch
                System.out.println(str.charAt(5));
            }catch (Exception e1){
                //System.out.println(str.charAt(5));//whenever an exception occurs in catch block, jvm stops handling and throws exception
                System.out.println("Nested try catch");
            }
            System.out.println("Exception handled");
        }
        System.out.println("Code continues after catching exception");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
