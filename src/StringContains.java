import java.util.Scanner;

public class StringContains {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String sentence = scan.nextLine();
        String matchWord = "";
        boolean flag=false;

        //WRITE YOUR CODE HERE
        int i = 0;
        while (i < sentence.length()) {
            if(sentence.charAt(i)!=' '){
                matchWord += sentence.charAt(i);
            }else if (matchWord.equals(word)) {
                    System.out.println("Word found!!");
                    flag=true;
                    break;
                } else {
                    matchWord = "";
                }
            i++;
        }
        if (matchWord.equals(word) && flag != true) {
            System.out.println("Word found!!");
        }else if(flag == false){
            System.out.println(false);
        }
    }
}
