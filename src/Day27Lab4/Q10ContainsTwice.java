package Day27Lab4;

public class Q10ContainsTwice {
    public static void main(String[] args) {
        int[] intArr = new int[]{2,5,3,7,2};
        System.out.println(ContainsTwice(intArr));
    }
    public static boolean ContainsTwice(int[] arr){
        int counterTwo = 0, counterThree = 0;
        for(int each : arr){
            if(each == 2){
                counterTwo++;
            }else if(each == 3){
                counterThree++;
            }
            if(counterTwo == 2 || counterThree == 2){
                return true;
            }
        }
        return false;
    }

}
