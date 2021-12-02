package Day27Lab4;

public class Q12HowManyOfArraysHave1AsFirstElement {
    public static void main(String[] args) {
        int[] intArr1 = {7,2,3};
        int[] intArr2 = {5,6,3};

        HowManyOfArraysHave1AsFirstElement(intArr1, intArr2);
    }

    public static void HowManyOfArraysHave1AsFirstElement(int[] arr1, int[] arr2){
        int counter = 0;
        if(arr1[0] == 1){
            counter++;
        }
        if(arr2[0] == 1){
            counter++;
        }
        System.out.println(counter);
    }
}
