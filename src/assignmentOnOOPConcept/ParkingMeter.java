package assignmentOnOOPConcept;

import java.util.Scanner;

//Question-6
public class ParkingMeter{
    int timeLeft = 0;
    int maxTime;

    public ParkingMeter(int maxTime){
        this.maxTime = maxTime;
    }

    public boolean add(int extraTime){
        if(extraTime == 25 && timeLeft<=maxTime){
            timeLeft += 30;
            return true;
        }
        return false;
    }
    public void tick(){
        if(timeLeft>0){
            timeLeft--;
        }
    }
    public boolean isExpired(){
        return timeLeft <= 0;
    }

}

class Test6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ParkingMeter pm = new ParkingMeter(in.nextInt());
        pm.add(in.nextInt());
        pm.tick();
        System.out.println(pm.timeLeft);
        System.out.println(pm.isExpired());

    }
}