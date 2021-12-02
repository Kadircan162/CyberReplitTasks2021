package ReplitAssignments2021;

public class LimitString {
    public static String limit(String text, int maxLength){
        // your code
        String newString = text.substring(0, maxLength);
       return newString;

    }

    public static void main(String[] args) {
        String text = "bla abla";
        int maxLength = 3;
        System.out.println(limit(text, maxLength));
    }
}
