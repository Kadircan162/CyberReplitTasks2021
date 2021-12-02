package assignmentOnStringAndMethodsDay29;

public class Q7DoubleTheFirstTwoLetters {
    public static void main(String[] args) {
        String word = "java";
        System.out.println(word.substring(0,2).concat(word.substring(0,2)));
    }
}
