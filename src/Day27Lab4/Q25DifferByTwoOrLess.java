package Day27Lab4;

public class Q25DifferByTwoOrLess {
    public static void main(String[] args) {
        int[] intArr1 = {1,2,3};
        int[] intArr2 = {2,3,5};

        System.out.println(DifferByTwoOrLess(intArr1, intArr2));
    }
    public static int DifferByTwoOrLess(int[] arr1, int[] arr2){

        int count=0;
        for(int i=0; i<arr1.length; i++){
            if(Math.abs(arr1[i] - arr2[i]) <= 2 && Math.abs(arr1[i] - arr2[i]) >= 1){
                count++;
            }
        }
        return count;
    }
}
