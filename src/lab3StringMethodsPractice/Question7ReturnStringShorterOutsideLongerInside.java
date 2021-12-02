package lab3StringMethodsPractice;

public class Question7ReturnStringShorterOutsideLongerInside {
    public static void main(String[] args){
        System.out.println(ReturnStringShorterOutsideLongerInside("Hello", "hi"));
        System.out.println(ReturnStringShorterOutsideLongerInside("hi", "Hello"));
        System.out.println(ReturnStringShorterOutsideLongerInside("aaa", "b"));
        System.out.println(ReturnStringShorterOutsideLongerInside("b", "aaa"));
        System.out.println(ReturnStringShorterOutsideLongerInside("aaa", "aaa"));
    }

    public static String ReturnStringShorterOutsideLongerInside(String word1, String word2){
        if(word1.length()>word2.length()){
            return word2.concat(word1).concat(word2);
        }else {
            return word1.concat(word2).concat(word1);
        }
    }
}
