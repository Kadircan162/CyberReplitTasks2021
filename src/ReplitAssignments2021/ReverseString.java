package ReplitAssignments2021;

public class ReverseString {
    public static void main(String[] args) {

        System.out.println(reverse("apple"));
    }
    public static String reverse(String input){
        String dummy = "";
        int index = input.length();

        for (int i=0; i<input.length(); i++){
            dummy += input.substring(index-1, index);
            index--;
        }
        return dummy;
    }
}
