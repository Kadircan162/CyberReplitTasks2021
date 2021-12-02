import java.util.Scanner;

public class StringNoEnd {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        String txt = s.next();

        //your code here
        for(int i=0; i<txt.length()-1; i++){
            System.out.print(txt.charAt(i));
        }
    }
}
