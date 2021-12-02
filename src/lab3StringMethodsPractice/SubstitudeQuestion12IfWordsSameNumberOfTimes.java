package lab3StringMethodsPractice;

public class SubstitudeQuestion12IfWordsSameNumberOfTimes {
    public static void main(String[] args) {
        System.out.println(HasWordsEqualTimes("catme", "dog", "catmedog"));
        System.out.println(HasWordsEqualTimes("catse", "dogse", "catsedogse"));
        System.out.println(HasWordsEqualTimes("cat", "dog", "1cat1cadodog"));
    }
    public static boolean HasWordsEqualTimes(String word1, String word2, String givenWord){
        int countWord1=0, countWord2=0;
        for(int i=0; i<(givenWord.length()-(word1.length()-1)); i++){
            if(givenWord.substring(i, i+word1.length()).equals(word1)){
                countWord1++;
            }
        }
        for(int i=0; i<(givenWord.length()-(word2.length()-1)); i++){
            if(givenWord.substring(i,i+word2.length()).equals(word2)){
                countWord2++;
            }
        }
      System.out.print("Number of " + word1 + ": " + countWord1 + " Number of " + word2 + ": " + countWord2 + " ");
      return countWord1 == countWord2;
    }
}
