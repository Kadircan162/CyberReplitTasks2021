package lab3StringMethodsPractice;

public class Question13DoubleEachChars {
    public static void main(String[] args){
        System.out.println(DoubleEachChars("The"));
        System.out.println(DoubleEachChars("AAbb"));
        System.out.println(DoubleEachChars("Hi-There"));
    }
    public static String DoubleEachChars(String word){
        String newWord1="", newWord2 = "";
        for(int i=0; i<word.length(); i++){
            newWord1 += word.substring(i,i+1) + word.substring(i,i+1);
        }
        for(int i=0; i<word.length(); i++){
            newWord2 += word.substring(i,i+1).concat(word.substring(i,i+1));
        }
        return newWord1 + " " + newWord2;
    }

}
