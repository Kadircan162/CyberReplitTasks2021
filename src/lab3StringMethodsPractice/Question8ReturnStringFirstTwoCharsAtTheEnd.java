package lab3StringMethodsPractice;

public class Question8ReturnStringFirstTwoCharsAtTheEnd {
    public static void main(String[] args){
        System.out.println(ReturnStringFirstTwoCharsAtTheEnd("Hello"));
        System.out.println(ReturnStringFirstTwoCharsAtTheEnd("java"));
        System.out.println(ReturnStringFirstTwoCharsAtTheEnd("Hi"));
    }
    public static String ReturnStringFirstTwoCharsAtTheEnd(String word){
        if(word.length()<2){
            return "Invalid word";
        }
        return word.substring(2).concat(word.substring(0,2));
    }
}
