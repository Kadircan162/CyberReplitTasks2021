package ReplitAssignments2021;

public class RemoveFirstChar {
    public static void main(String[] args) {
        String word = "aaa";
        System.out.println(removeFirst(word));
    }
    public static String removeFirst(String target) {

        String newString = target.substring(1);
        return newString;
    }
}
