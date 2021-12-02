import java.util.Scanner;

public class DublicateIt {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //YOUR CODE HERE
        boolean flag=false;
        outer: for(int i=0; i<word1.length()*2; i++){
            System.out.print(word1.charAt(i));
            if(i!=word1.length()-1 || flag==true){
                i=0;
                flag=true;
                continue outer;
            }
            inner: for (int j=0; j<word2.length(); j++){
                System.out.print(word2.charAt(j));
                if(j!=word1.length()-1){
                    continue inner;
                }
            }
        }
    }
}
