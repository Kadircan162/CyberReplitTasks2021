package ReplitAssignments2021;

public class ReverseSentence {
    public static void main(String[] args) {
        String sentence = "Java is fun";
        String[] arr = sentence.split(" ");

        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}
