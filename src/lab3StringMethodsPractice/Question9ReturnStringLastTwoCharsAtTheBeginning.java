package lab3StringMethodsPractice;

public class Question9ReturnStringLastTwoCharsAtTheBeginning {
    public static void main(String[] args){
        System.out.println(ReturnStringLastTwoCharsAtTheEnd("Hello"));
        System.out.println(ReturnStringLastTwoCharsAtTheEnd("java"));
        System.out.println(ReturnStringLastTwoCharsAtTheEnd("Hi"));
    }
    public static String ReturnStringLastTwoCharsAtTheEnd(String word){
        if(word.length()<2){
            return "Invalid word";
        }
        return word.substring(word.length()-2).concat(word.substring(0,word.length()-2));
    }
}
