package Day27Lab4;

public class Q21SumOfAllTwo {
    public static void main(String[] args) {
        int[] intArr = {2,3,2,2,4,2};
        System.out.println(SumOfAllTwoEqualsEight(intArr));
    }

    public static boolean SumOfAllTwoEqualsEight(int[] arr){
        int sumOfTwos = 0;

        for(int each : arr){
           if(each == 2){
               sumOfTwos += 2;
           }
        }
        return sumOfTwos == 8;
    }
}
