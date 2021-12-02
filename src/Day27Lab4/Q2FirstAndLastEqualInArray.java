package Day27Lab4;

public class Q2FirstAndLastEqualInArray {
    public static void main(String[] args) {
        System.out.println(FirsAndLastIsEqual(new int[] {1,2,3,1}));
        System.out.println(FirsAndLastIsEqual(new int[] {}));
    }

    public static String FirsAndLastIsEqual(int[] arr){
        if(arr.length < 1){
            return "not a valid array";
        }
        if(arr[0] == arr[arr.length-1]){
            return "true";
        }
        return "false";
    }
}
