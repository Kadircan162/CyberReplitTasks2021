package ReplitAssignments2021;

import java.util.ArrayList;
import java.util.Scanner;

public class RepeatAllModifier {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Boolean> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextBoolean());
        }

        repeatAll(list);
        System.out.println(list);
    }
    public static void repeatAll(ArrayList<Boolean> boo){
        ArrayList<Boolean> newBoo = new ArrayList<>(boo);
        System.out.println(newBoo);
        System.out.println("*************************");
        boo.addAll(newBoo);

    }


}
