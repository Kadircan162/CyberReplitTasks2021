package ReplitAssignments2021;

import java.util.Scanner;

public class CleanUnwantedString {
    public static void main(String[] args) {
//        System.out.println(clean("one two three", "two"));
//        Scanner scanner = new Scanner(System.in);
  //      scanner.nextLine();
        String text = "blahhe said bla bla bla ffrblabla blah";
        String badWord = "bla";
        System.out.println(clean(text, badWord));

    }

    public static String clean(String text, String badWord){
        System.out.println(text.indexOf(badWord));

        for(int i=0; i<text.length()-(badWord.length()); i++){
            if(text.substring(i,i+badWord.length()).equals(badWord)){
                if(i!=0 && text.substring(i-1, i).equals(" ")){
                    text=text.replace(text.substring(i-1,i+badWord.length()), "");//here to remove whitespace before badword
                }else{
                    text = text.replace(text.substring(i,i+badWord.length()), "");
                }
            }
        }
       return text.trim();
    }
}

