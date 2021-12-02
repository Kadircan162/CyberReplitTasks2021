package Day27Lab4;

public class Q18Unlocky13 {
    public static void main(String[] args) {
        int[] intArr = {1,2,13,1,13,3};
        int sum=0;
        for(int i=0; i<intArr.length; i++){
            if(intArr[i] == 13){
                break;
            }
            sum += intArr[i];
        }
        System.out.println(sum);
    }
}
