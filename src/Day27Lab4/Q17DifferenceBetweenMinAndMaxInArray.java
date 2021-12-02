package Day27Lab4;

public class Q17DifferenceBetweenMinAndMaxInArray {
    public static void main(String[] args) {
        int[] intArr = {10, 3, 5, 6};
        System.out.println(DifferenceBetweenMinAndMaxInArray(intArr));
    }

    public static int DifferenceBetweenMinAndMaxInArray(int[] arr){
        int maxFlag = Integer.MIN_VALUE;
        int minFlag = Integer.MAX_VALUE;
        for(int i=0; i< arr.length; i++){
            if(arr[i] > maxFlag){
                maxFlag = arr[i];
            }
            if(arr[i] < minFlag){
                minFlag = arr[i];
            }
        }
        return maxFlag - minFlag;
    }

}
