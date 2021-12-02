package assignmentOnStringAndMethodsDay29;

public class Q4WordGame2 {
    public Q4WordGame2(String word){
        OddNumberOfCharacters(word);
    }
    private static void OddNumberOfCharacters(String word){
        if(word.length() >= 5){
            int middleIndex = word.length() / 2;
            System.out.println(word.substring(middleIndex-1, middleIndex+2));
        }else{
            System.out.println("invalid");
        }
    }

    public static void main(String[] args) {

        new Q4WordGame2("$");
    }
}
