package day45_exception;

public class TryCatchEMessages {
    public static void main(String[] args) {
        int[] nums = {36,5,7,12};
        try {
            System.out.println(nums[6]);
        }catch (Exception e){
            //System.out.println("Wrong index");
            System.out.println("e.getStackTrace() = " + e.getStackTrace());
            e.printStackTrace();
            System.out.println("e.getMessage() = " + e.getMessage());
        }

        try {
            int x = 10/0;
        }catch (Exception e){
            System.out.println("e.getMessage() = " + e.getMessage());
            e.printStackTrace();
            System.out.println("e.getStackTrace() = " + e.getStackTrace());
        }

    }
}
