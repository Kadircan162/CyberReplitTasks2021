package lab3StringMethodsPractice;

public class Question16ReturnItsFirstTwoChars {
    public static void main(String[] args){
        System.out.println(ReturnItsFirstTwoChars("hello"));
        System.out.println(ReturnItsFirstTwoChars("hi"));
        System.out.println(ReturnItsFirstTwoChars("h"));
        System.out.println(ReturnItsFirstTwoChars("Java"));
    }
    public static String ReturnItsFirstTwoChars(String givenWord){
        String resultWord="";
        if(givenWord.length()<2){
            resultWord += givenWord.substring(0).concat("@");
        }else{
            resultWord = givenWord.substring(0,2);
        }
        return resultWord;
    }
}
