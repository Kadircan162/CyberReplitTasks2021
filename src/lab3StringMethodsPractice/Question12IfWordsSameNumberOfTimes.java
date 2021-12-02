package lab3StringMethodsPractice;

public class Question12IfWordsSameNumberOfTimes {
    public static void main(String[] main){
        System.out.println(HasSameNumber("cat","dog","catdog"));
        System.out.println(HasSameNumber("cat","dog","catcat"));
        System.out.println(HasSameNumber("cat","dog","1cat1cadodog"));
    }
    public static boolean HasSameNumber(String word1, String word2, String givenWord){
        int countWord1=0, countWord2 = 0;
        for (int i=0; i<givenWord.length();i++){
            int j=0;
            if(givenWord.substring(i,i+1).equals(word1.substring(j,j+1))){
                if(givenWord.substring(i+1,i+2).equals(word1.substring(j+1,j+2))){
                    if(i+2!=givenWord.length() && givenWord.substring(i+2,i+3).equals(word1.substring(j+2,j+3))){
                        countWord1++;
                    }
                }
            }
        }
        for (int i=0; i<givenWord.length();i++){
            int j=0;
            if(givenWord.substring(i,i+1).equals(word2.substring(j,j+1))){
                if(givenWord.substring(i+1,i+2).equals(word2.substring(j+1,j+2))){
                    if(i+2!=givenWord.length() && givenWord.substring(i+2,i+3).equals(word2.substring(j+2,j+3))){
                        countWord2++;
                    }
                }
            }
        }
        System.out.println("Number of " + word1 + ": " + countWord1 + " Number of " + word2 + ": " + countWord2);
        return countWord1 == countWord2;
    }
}
