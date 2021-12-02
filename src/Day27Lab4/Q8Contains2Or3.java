package Day27Lab4;

public class Q8Contains2Or3 {
    public static void main(String[] args) {

        int[] intArr = {5, 7, 2};
        System.out.println(Contains2Or3(intArr));
    }

    public static boolean Contains2Or3(int[] arr){

        for(int each : arr){
            if(each == 2 || each == 3){
                return true;
            }
        }
        return false;
    }
}
