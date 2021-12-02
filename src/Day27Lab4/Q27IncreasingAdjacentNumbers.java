package Day27Lab4;

public class Q27IncreasingAdjacentNumbers {
    public static void main(String[] args) {
        int[] intArr = new int[]{1,2,4,5,6,2};
        System.out.println(IncreasingAdjacentNumbers(intArr));
    }
    public static boolean IncreasingAdjacentNumbers(int[] arr){
        for(int i=0; i<arr.length-2; i++){
            int count=1;
            for (int j=i+1; j<i+3; j++){
                if(arr[j] == arr[j-1]+1){
                    count++;
                }else{
                    break;
                }
            }
            if(count == 3){
                return true;
            }
        }
        return false;
    }
}
