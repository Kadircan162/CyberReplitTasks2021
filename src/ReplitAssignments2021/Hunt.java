package ReplitAssignments2021;

import java.util.ArrayList;
import java.util.Scanner;

public class Hunt {
    private static int totalCatch;
    private static int numberOfNanuk;

    public static ArrayList<String> setArray(){
        ArrayList<String> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int catches = scanner.nextInt();
        numberOfNanuk = scanner.nextInt();
        int size = catches + numberOfNanuk;

        for(int i=0; i<size; i++){
            arrayList.add(scanner.next());
        }
        return arrayList;
    }

    public boolean nanuk(ArrayList<String> arrayList, int wayStones, int boast){ //["1","10","3","nanuk"],2,7

        for(int i=0; i<arrayList.size(); i++){
            if(arrayList.get(i).equalsIgnoreCase("nanuk")){
                numberOfNanuk++;
            }else{
                totalCatch = totalCatch + Integer.parseInt(arrayList.get(i));
            }
        }

        if(totalCatch >= boast && wayStones >= numberOfNanuk){
           return true;
        }

        return false;
    }

}
