package Day23RandomClass;

import java.util.Random;

public class Task84HeadsOrTails {
    public static void main(String[] args){
        int i=0;
        while(i<10){
            HeadsOrTails();
            i++;
        }
    }
    public static void HeadsOrTails(){
        Random rn = new Random();
        if(rn.nextBoolean()==true){
            System.out.println("Heads");
        }else {
            System.out.println("Tails");
        }
    }
}
