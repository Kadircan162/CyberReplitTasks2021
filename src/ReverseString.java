import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        StringBuilder sb = new StringBuilder(word);

        if(word.length()<5){
            System.out.println("Too short!");
        }else if(word.length()>5){
            System.out.println("Too long!");
        }else{
            System.out.println(sb.reverse());
        }
    }
}
