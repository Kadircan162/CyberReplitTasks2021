package Day27Lab4;

public class Q26EvenOrOddNextToEachOther {
    public static void main(String[] args) {
        int[] intArr = {1,4,2,5,7,9};
        System.out.println(EvenOrOddNextToEachOther(intArr));
    }
    public static boolean EvenOrOddNextToEachOther(int[] arr){

        for(int i=0; i<arr.length-1; i++){
            int count=0;
            if(arr[i]%2 == 0){
                count++;
                for(int j=i+1; j<j+2; j++){
                    if(arr[j]%2 == 0){
                        count++;
                    }else{
                        break;
                    }
                    if(count == 3){
                        return true;
                    }
                }
            }else{
                count++;
                for(int k=i+1; k<k+2; k++){
                    if(arr[k]%2 == 1){
                        count++;
                    }else{
                        break;
                    }
                    if(count == 3){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
