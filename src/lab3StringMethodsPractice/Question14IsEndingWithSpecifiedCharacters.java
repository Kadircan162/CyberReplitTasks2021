package lab3StringMethodsPractice;

public class Question14IsEndingWithSpecifiedCharacters {
    public static void main(String[] args){
        System.out.println(IsEndingWithLy("oddly"));
        System.out.println(IsEndingWithLy("y"));
        System.out.println(IsEndingWithLy("oddy"));
    }
    public static boolean IsEndingWithLy(String word){
        boolean doesContain = false;
        if(word.length() >= 2){ //ly.length()
            if(word.substring(word.length()-2).equalsIgnoreCase("ly")){
                doesContain=true;
            }
        }
        return doesContain;
    }
}
