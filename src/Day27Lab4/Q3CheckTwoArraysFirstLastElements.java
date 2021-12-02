package Day27Lab4;

public class Q3CheckTwoArraysFirstLastElements {
    public static void main(String[] args) {
        System.out.println(FirstLastElementsAreEqual(new int[]{1,7,5}, new int[]{1,9,5}));
    }

    public static String FirstLastElementsAreEqual(int[] arr1, int[] arr2){
        if(!(arr1.length >1 && arr2.length >1)){
            return "Array1 and Array2 are not valid";
        }else if(!(arr1.length > 1)){
            return  "Array1 is not valid";
        }else if(!(arr2.length > 1)){
            return "Array2 is not valid";
        }

        if(arr1[0] == arr2[0] || arr1[arr1.length-1] == arr2[arr2.length-1]){
            return  "true";
        }
        return "false";
    }
}
