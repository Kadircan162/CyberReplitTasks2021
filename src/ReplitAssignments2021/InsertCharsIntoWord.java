package ReplitAssignments2021;

public class InsertCharsIntoWord {
    public static void main(String[] args) {
        System.out.println(at3("blabla", "a"));
    }
    public static String at3(String target,String word){

        String newString = target.substring(0, 3).concat(word).concat(target.substring(3));
        return newString;


    }
}


