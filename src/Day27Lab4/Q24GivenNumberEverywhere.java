package Day27Lab4;

public class Q24GivenNumberEverywhere {
    public static void main(String[] args) {
        int[] intArr = {1,1,1,1};
        System.out.println(GivenNumberEverywhere(intArr, 1));
    }

    public static boolean GivenNumberEverywhere(int[] arr, int a){
        boolean result = false;
        for(int i=0; i<arr.length; i+=2){
            if(arr[i] == a || arr[i+1] == a){
                result = true;
            }else{
                result = false;
                break;
            }
        }
        return result;
    }
}
