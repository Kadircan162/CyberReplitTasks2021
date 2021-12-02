package Day27Lab4;

public class Q22NumberOneGreaterThanNumberFour {
    public static void main(String[] args) {
        int[] intArr = {1,1};
        System.out.println(NumberOneGreaterThanNumberFour(intArr));
    }
    public static boolean NumberOneGreaterThanNumberFour(int[] arr){
        int countOne=0, countFour=0;
        for(int each : arr){
            if(each == 1){
                countOne++;
            }else if(each == 4){
                countFour++;
            }
        }
        return countOne > countFour;
    }
}
