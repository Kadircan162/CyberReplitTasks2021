package ReplitAssignments2021;

import java.util.ArrayList;
import java.util.Scanner;

public class DublicatesInArray {

    public static int getDup(String[] r) { //"g", "g", "aabb", "7", "7", "2", "aabb", "7"
        ArrayList<String> dupStr = new ArrayList<>();

        for(int i=0; i<r.length; i++){
            if(dupStr.contains(r[i])){
                continue;
            }
            dupStr.add(r[i]);
            int index = dupStr.indexOf(r[i]);
            boolean dup = false;
            for (int j=i; j<r.length-1; j++){
                if(r[i].equals(r[j+1])){
                    dupStr.add(r[i]);
                    dup = true;
                }

            }
            if(!dup){
                dupStr.remove(index);
            }

        }

        return dupStr.size();

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] strs = new String[in.nextInt()];
        for(int i=0; i < strs.length; i++) {
            strs[i] = in.next();
        }
        //String[] strs = {"1","g","aabb","7","7","2","aa","7"};

        System.out.println(String.valueOf(getDup(strs)).trim());

    }
}
