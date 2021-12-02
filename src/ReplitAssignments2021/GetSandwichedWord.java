package ReplitAssignments2021;

import java.util.Scanner;

public class GetSandwichedWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        String searchedWord = "bread";
        String dummy1 = "", dummy2= "";
        int firstIndex=0, lastIndex = 0;

        for (int i=0; i<str.length(); i++){
            dummy1 += str.substring(0,i);
            if(dummy1.contains(searchedWord)){
                firstIndex = i;
                break;
            }
        }
        for (int j=str.length()-1; j>firstIndex; j--){
            dummy2 = str.substring(j);
            if(dummy2.contains(searchedWord)){
                break;
            }
            lastIndex=j-1;
        }
        if(str.substring(firstIndex,lastIndex).isBlank()){
            System.out.println("nothing");
        }
        System.out.println(str.substring(firstIndex,lastIndex));
    }
}
