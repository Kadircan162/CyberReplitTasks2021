import java.util.Scanner;

public class MergeTwoWords {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //YOUR CODE HERE
        int i=0;
        int j=0;
        if(word1.length()!=3 || word2.length()!=3){
            System.out.println("cannot merge");
        }else {
            outer: for(; i<word1.length(); i++){
                System.out.print(word1.charAt(i));
                for(; j<word2.length();){
                    System.out.print(word2.charAt(j));
                    j++;
                    if(j!=word2.length()){
                        continue outer;
                    }
                }
            }
        }
    }
}
