import java.util.Scanner;

public class PrintHalfTwice {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        System.out.println(doubleMyHalf(word));
        }
    public static String doubleMyHalf(String word){
        String doubleHalf="";
        for (int i=0; i<word.length()/2; i++){
           doubleHalf += word.charAt(i);
        }
        return doubleHalf + "" + doubleHalf;
    }
}


