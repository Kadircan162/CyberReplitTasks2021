package ReplitAssignments2021;

import java.util.*;

public class RemoveInstances {
    public static ArrayList<Integer> removeInst(ArrayList<Integer> r,Integer n) {

        r.removeAll(List.of(n));
        return r;
    }

    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int n = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(removeInst(list, n));

    }
}
