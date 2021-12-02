package ReplitAssignments2021;

import java.util.Scanner;

public class UniqueWords {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int size = scan.nextInt();
//        String[] words = new String[size];
//        for(int i=0; i < size; i++){
//            words[i] = scan.next();
//        }
        String[] words = {"java", "code", "python", "code", "rust", "code", "rust"};
        printUniqueWords(words);
    }

    public static void printUniqueWords(String[] words){
        //WRITE YOUR CODE HERE
        int count = 0;
        int i = 0;
        for(String dummy : words){
            while (i < words.length){
                if(dummy.equalsIgnoreCase(words[i])){
                    count++;
                }
             i++;
            }
            if(count == 1){ //here to take only unique number
                System.out.println(dummy);
            }
            count = 0;
            i = 0;
        }

    }
}
