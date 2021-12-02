package ReplitAssignments2021;

import java.util.Scanner;

public class FindCharSeqInAWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.nextLine();
        String searchedChar1 = scan.nextLine();
        String searchedChar2 = scan.nextLine();
        countOfCats = countChars(word, searchedChar1);
        countOfDogs = countChars(word, searchedChar2);
        System.out.println(countOfCats == countOfDogs);

    }
    public static int countChars(String word, String searchedChars){
        int count = 0;
        for(int i=0; i<word.length()-(searchedChars.length()-1); i++){
            if(word.substring(i,i+searchedChars.length()).equals(searchedChars)){
               count++;
            }
        }
        return count;
    }
}


