package assignmentOnStringAndMethodsDay29;

public class Q3WordGame {
    public Q3WordGame(String word){
        if(word.length()%2 == 0) EvenNumberOfCharacters(word);
        else OddNumberOfCharacters(word);
    }
    private static void OddNumberOfCharacters(String word){
        if(word.length() >= 3){
            int middleIndex = word.length() / 2;
            System.out.println(word.charAt(middleIndex));
        }else{
            System.out.println(word.concat(word).concat(word));
        }
    }

    private static void EvenNumberOfCharacters(String word){
        if(word.length() >= 4){
            int middleIndex = word.length() / 2;
            System.out.println(word.substring(middleIndex-1, middleIndex+1));
        }else{
            System.out.println(word.concat(word));
        }
    }

    public static void main(String[] args) {
        new Q3WordGame("apples");
    }
}
