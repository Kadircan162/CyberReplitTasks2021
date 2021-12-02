package lab3StringMethodsPractice;

public class Question10IsFirstTwoCharsAtTheEnd {
    public static void main(String [] args){
        System.out.println(IsFirstTwoCharsAtTheEnd("edited"));
        System.out.println(IsFirstTwoCharsAtTheEnd("edit"));
        System.out.println(IsFirstTwoCharsAtTheEnd("ed"));
        System.out.println(IsFirstTwoCharsAtTheEnd("Me Somebody Help Me"));

    }

    public static boolean IsFirstTwoCharsAtTheEnd(String word){
        boolean isSame=false;
        if(word.substring(0,2).equals(word.substring(word.length()-2))){
            isSame=true;
        }
        return isSame;
    }
}
