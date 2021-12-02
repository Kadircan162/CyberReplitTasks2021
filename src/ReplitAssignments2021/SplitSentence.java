package ReplitAssignments2021;

public class SplitSentence {
    public static void main(String[] args) {
        String[] str = "Java is fun".split(" ");
        for (String each : str){
            System.out.println(each);
        }
    }
}
