package lab3StringMethodsPractice;

public class SubstituteQuestion11NumberOfTimesOfWord {

    public static void main(String[] args) {
        int times = SpecificCharacterFinder("hihhh");
        System.out.println(times);
    }
    public static int SpecificCharacterFinder(String word){
        int count=0;
        for(int i=0; i<word.length(); i++){
            if(word.substring(i,i+1).equals("h")){
                if(i+1!=word.length() && word.substring(i+1,i+2).equals("i")){
                    count++;
                }
            }
        }
        return count;
    }
}
